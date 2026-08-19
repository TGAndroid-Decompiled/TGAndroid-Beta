package org.telegram.ui.Storage;

import android.util.LongSparseArray;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.MessageObject;
import org.telegram.ui.CacheControlActivity;

public class CacheModel {
    public boolean allDocumentsSelected;
    public boolean allMusicSelected;
    public boolean allPhotosSelected;
    public boolean allStoriesSelected;
    public boolean allVideosSelected;
    public boolean allVoiceSelected;
    public long documentsSelectedSize;
    public final boolean isDialog;
    public long musicSelectedSize;
    public long photosSelectedSize;
    private long selectedSize;
    public long storiesSelectedSize;
    public long videosSelectedSize;
    public long voiceSelectedSize;
    public ArrayList entities = new ArrayList();
    private final LongSparseArray entitiesByDialogId = new LongSparseArray();
    public final ArrayList media = new ArrayList();
    public final ArrayList documents = new ArrayList();
    public final ArrayList music = new ArrayList();
    public final ArrayList voice = new ArrayList();
    public final ArrayList stories = new ArrayList();
    private final HashSet dialogIdsTmp = new HashSet();
    public HashSet selectedFiles = new HashSet();
    public HashSet selectedDialogs = new HashSet();

    public CacheModel(boolean z) {
        this.isDialog = z;
    }

    public void add(int i, FileInfo fileInfo) {
        getListByType(i).add(fileInfo);
    }

    private ArrayList getListByType(int i) {
        if (i == 0) {
            return this.media;
        }
        if (i == 1) {
            return this.media;
        }
        if (i == 2) {
            return this.documents;
        }
        if (i == 3) {
            return this.music;
        }
        if (i == 4) {
            return this.voice;
        }
        if (i == 7) {
            return this.stories;
        }
        return null;
    }

    private void remove(int i, FileInfo fileInfo) {
        ArrayList listByType = getListByType(i);
        if (listByType != null) {
            listByType.remove(fileInfo);
        }
    }

    public void remove(CacheControlActivity.DialogFileEntities dialogFileEntities) {
        this.entities.remove(dialogFileEntities);
    }

    public void sortBySize() {
        sort(this.media);
        sort(this.documents);
        sort(this.music);
        sort(this.voice);
        sort(this.stories);
    }

    private void sort(ArrayList arrayList) {
        Collections.sort(arrayList, new Comparator() {
            @Override
            public final int compare(Object obj, Object obj2) {
                return CacheModel.$r8$lambda$5Ho1DEdqeZCt_duz_Wk_ub4AxX4((CacheModel.FileInfo) obj, (CacheModel.FileInfo) obj2);
            }
        });
    }

    public static int $r8$lambda$5Ho1DEdqeZCt_duz_Wk_ub4AxX4(FileInfo fileInfo, FileInfo fileInfo2) {
        long j = fileInfo2.size;
        long j2 = fileInfo.size;
        if (j > j2) {
            return 1;
        }
        return j < j2 ? -1 : 0;
    }

    public void toggleSelect(FileInfo fileInfo) {
        if (this.selectedFiles.contains(fileInfo)) {
            this.selectedFiles.remove(fileInfo);
            incSize(fileInfo, false);
            this.selectedSize -= fileInfo.size;
            checkAllFilesSelected(fileInfo.type, false);
        } else {
            this.selectedFiles.add(fileInfo);
            incSize(fileInfo, true);
            this.selectedSize += fileInfo.size;
            checkAllFilesSelected(fileInfo.type, true);
        }
        checkSelectedDialogs();
    }

    private void checkAllFilesSelected(int i, boolean z) {
        if (this.isDialog) {
            if (z) {
                if (i == 0) {
                    this.allPhotosSelected = checkAllFilesSelectedInArray(i, this.media);
                    return;
                }
                if (i == 1) {
                    this.allVideosSelected = checkAllFilesSelectedInArray(i, this.media);
                    return;
                }
                if (i == 2) {
                    this.allDocumentsSelected = checkAllFilesSelectedInArray(i, this.documents);
                    return;
                }
                if (i == 3) {
                    this.allMusicSelected = checkAllFilesSelectedInArray(i, this.music);
                    return;
                } else if (i == 4) {
                    this.allVoiceSelected = checkAllFilesSelectedInArray(i, this.voice);
                    return;
                } else {
                    if (i == 7) {
                        this.allStoriesSelected = checkAllFilesSelectedInArray(i, this.stories);
                        return;
                    }
                    return;
                }
            }
            if (i == 0) {
                this.allPhotosSelected = false;
                return;
            }
            if (i == 1) {
                this.allVideosSelected = false;
                return;
            }
            if (i == 2) {
                this.allDocumentsSelected = false;
                return;
            }
            if (i == 3) {
                this.allMusicSelected = false;
            } else if (i == 4) {
                this.allVoiceSelected = false;
            } else if (i == 7) {
                this.allStoriesSelected = false;
            }
        }
    }

    private boolean checkAllFilesSelectedInArray(int i, ArrayList arrayList) {
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            if (((FileInfo) arrayList.get(i2)).type == i && !this.selectedFiles.contains(arrayList.get(i2))) {
                return false;
            }
        }
        return true;
    }

    public void toggleSelect(CacheControlActivity.DialogFileEntities dialogFileEntities) {
        if (!this.selectedDialogs.contains(Long.valueOf(dialogFileEntities.dialogId))) {
            for (int i = 0; i < dialogFileEntities.entitiesByType.size(); i++) {
                ArrayList arrayList = ((CacheControlActivity.FileEntities) dialogFileEntities.entitiesByType.valueAt(i)).files;
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayList.get(i2);
                    i2++;
                    FileInfo fileInfo = (FileInfo) obj;
                    if (this.selectedFiles.add(fileInfo)) {
                        this.selectedSize += fileInfo.size;
                    }
                }
            }
        } else {
            for (int i3 = 0; i3 < dialogFileEntities.entitiesByType.size(); i3++) {
                ArrayList arrayList2 = ((CacheControlActivity.FileEntities) dialogFileEntities.entitiesByType.valueAt(i3)).files;
                int size2 = arrayList2.size();
                int i4 = 0;
                while (i4 < size2) {
                    Object obj2 = arrayList2.get(i4);
                    i4++;
                    FileInfo fileInfo2 = (FileInfo) obj2;
                    if (this.selectedFiles.remove(fileInfo2)) {
                        this.selectedSize -= fileInfo2.size;
                    }
                }
            }
        }
        checkSelectedDialogs();
    }

    private void checkSelectedDialogs() {
        if (this.isDialog) {
            return;
        }
        this.dialogIdsTmp.clear();
        Iterator it = this.selectedFiles.iterator();
        while (it.hasNext()) {
            long j = ((FileInfo) it.next()).dialogId;
            if (j != 0) {
                this.dialogIdsTmp.add(Long.valueOf(j));
            }
        }
        this.selectedDialogs.clear();
        Iterator it2 = this.dialogIdsTmp.iterator();
        while (it2.hasNext()) {
            CacheControlActivity.DialogFileEntities dialogFileEntities = (CacheControlActivity.DialogFileEntities) this.entitiesByDialogId.get(((Long) it2.next()).longValue());
            if (dialogFileEntities != null) {
                int i = 0;
                while (true) {
                    if (i < dialogFileEntities.entitiesByType.size()) {
                        ArrayList arrayList = ((CacheControlActivity.FileEntities) dialogFileEntities.entitiesByType.valueAt(i)).files;
                        int size = arrayList.size();
                        int i2 = 0;
                        while (i2 < size) {
                            Object obj = arrayList.get(i2);
                            i2++;
                            if (!this.selectedFiles.contains((FileInfo) obj)) {
                                break;
                            }
                        }
                        i++;
                    } else {
                        this.selectedDialogs.add(Long.valueOf(dialogFileEntities.dialogId));
                        break;
                    }
                }
            }
        }
    }

    public boolean isSelected(FileInfo fileInfo) {
        return this.selectedFiles.contains(fileInfo);
    }

    public int getSelectedFiles() {
        return this.selectedFiles.size();
    }

    public void clearSelection() {
        this.selectedSize = 0L;
        this.selectedFiles.clear();
        this.selectedDialogs.clear();
    }

    public void setEntities(ArrayList arrayList) {
        this.entities = arrayList;
        this.entitiesByDialogId.clear();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            CacheControlActivity.DialogFileEntities dialogFileEntities = (CacheControlActivity.DialogFileEntities) obj;
            this.entitiesByDialogId.put(dialogFileEntities.dialogId, dialogFileEntities);
        }
    }

    public boolean isSelected(long j) {
        return this.selectedDialogs.contains(Long.valueOf(j));
    }

    public CacheControlActivity.DialogFileEntities removeSelectedFiles() {
        CacheControlActivity.DialogFileEntities dialogFileEntities = new CacheControlActivity.DialogFileEntities(0L);
        for (FileInfo fileInfo : this.selectedFiles) {
            dialogFileEntities.addFile(fileInfo, fileInfo.type);
            CacheControlActivity.DialogFileEntities dialogFileEntities2 = (CacheControlActivity.DialogFileEntities) this.entitiesByDialogId.get(fileInfo.dialogId);
            if (dialogFileEntities2 != null) {
                dialogFileEntities2.removeFile(fileInfo);
                if (dialogFileEntities2.isEmpty()) {
                    this.entitiesByDialogId.remove(fileInfo.dialogId);
                    this.entities.remove(dialogFileEntities2);
                }
                remove(fileInfo.type, fileInfo);
            }
        }
        return dialogFileEntities;
    }

    public long getSelectedFilesSize() {
        return this.selectedSize;
    }

    public long getSelectedFilesSize(int i) {
        if (i == 0) {
            return this.photosSelectedSize;
        }
        if (i == 1) {
            return this.videosSelectedSize;
        }
        if (i == 2) {
            return this.documentsSelectedSize;
        }
        if (i == 3) {
            return this.musicSelectedSize;
        }
        if (i == 4) {
            return this.voiceSelectedSize;
        }
        return -1L;
    }

    public void selectAllFiles() {
        for (int i = 0; i < this.media.size(); i++) {
            this.selectedFiles.add((FileInfo) this.media.get(i));
            if (((FileInfo) this.media.get(i)).type == 0) {
                this.photosSelectedSize += ((FileInfo) this.media.get(i)).size;
            } else {
                this.videosSelectedSize += ((FileInfo) this.media.get(i)).size;
            }
        }
        for (int i2 = 0; i2 < this.documents.size(); i2++) {
            this.selectedFiles.add((FileInfo) this.documents.get(i2));
            this.documentsSelectedSize += ((FileInfo) this.documents.get(i2)).size;
        }
        for (int i3 = 0; i3 < this.music.size(); i3++) {
            this.selectedFiles.add((FileInfo) this.music.get(i3));
            this.musicSelectedSize += ((FileInfo) this.music.get(i3)).size;
        }
        for (int i4 = 0; i4 < this.voice.size(); i4++) {
            this.selectedFiles.add((FileInfo) this.voice.get(i4));
            this.voiceSelectedSize += ((FileInfo) this.voice.get(i4)).size;
        }
        this.allPhotosSelected = true;
        this.allVideosSelected = true;
        this.allDocumentsSelected = true;
        this.allMusicSelected = true;
        this.allVoiceSelected = true;
    }

    public void allFilesSelcetedByType(int i, boolean z) {
        ArrayList arrayList;
        if (i == 0) {
            arrayList = this.media;
            this.allPhotosSelected = z;
        } else if (i == 1) {
            arrayList = this.media;
            this.allVideosSelected = z;
        } else if (i == 2) {
            arrayList = this.documents;
            this.allDocumentsSelected = z;
        } else if (i == 3) {
            arrayList = this.music;
            this.allMusicSelected = z;
        } else if (i == 4) {
            arrayList = this.voice;
            this.allVoiceSelected = z;
        } else if (i == 7) {
            arrayList = this.stories;
            this.allStoriesSelected = z;
        } else {
            arrayList = null;
        }
        if (arrayList != null) {
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                if (((FileInfo) arrayList.get(i2)).type == i) {
                    if (z) {
                        if (!this.selectedFiles.contains(arrayList.get(i2))) {
                            this.selectedFiles.add((FileInfo) arrayList.get(i2));
                            incSize((FileInfo) arrayList.get(i2), true);
                        }
                    } else if (this.selectedFiles.contains(arrayList.get(i2))) {
                        this.selectedFiles.remove(arrayList.get(i2));
                        incSize((FileInfo) arrayList.get(i2), false);
                    }
                }
            }
        }
    }

    private void incSize(FileInfo fileInfo, boolean z) {
        long j = z ? fileInfo.size : -fileInfo.size;
        int i = fileInfo.type;
        if (i == 0) {
            this.photosSelectedSize += j;
            return;
        }
        if (i == 1) {
            this.videosSelectedSize += j;
            return;
        }
        if (i == 2) {
            this.documentsSelectedSize += j;
            return;
        }
        if (i == 3) {
            this.musicSelectedSize += j;
        } else if (i == 4) {
            this.voiceSelectedSize += j;
        } else if (i == 7) {
            this.storiesSelectedSize += j;
        }
    }

    public boolean isEmpty() {
        if (this.media.isEmpty() && this.documents.isEmpty() && this.music.isEmpty()) {
            return this.isDialog || this.entities.isEmpty();
        }
        return false;
    }

    public void onFileDeleted(FileInfo fileInfo) {
        if (this.selectedFiles.remove(fileInfo)) {
            this.selectedSize -= fileInfo.size;
        }
        remove(fileInfo.type, fileInfo);
    }

    public static class FileInfo {
        public long dialogId;
        public final File file;
        public int messageId;
        public MessageObject messageObject;
        public int messageType;
        public FileMetadata metadata;
        public long size;
        public int type;

        public static class FileMetadata {
            public String author;
            public boolean loading;
            public String title;
        }

        public FileInfo(File file) {
            this.file = file;
        }
    }
}
