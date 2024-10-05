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
import org.telegram.ui.Storage.CacheModel;

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

    public CacheModel(boolean z) {
        this.isDialog = z;
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
                    if (i >= dialogFileEntities.entitiesByType.size()) {
                        this.selectedDialogs.add(Long.valueOf(dialogFileEntities.dialogId));
                        break;
                    }
                    Iterator it3 = ((CacheControlActivity.FileEntities) dialogFileEntities.entitiesByType.valueAt(i)).files.iterator();
                    while (it3.hasNext()) {
                        if (!this.selectedFiles.contains((FileInfo) it3.next())) {
                            break;
                        }
                    }
                    i++;
                }
            }
        }
    }

    private ArrayList getListByType(int i) {
        if (i != 0 && i != 1) {
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
        return this.media;
    }

    private void incSize(FileInfo fileInfo, boolean z) {
        long j = fileInfo.size;
        if (!z) {
            j = -j;
        }
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

    public static int lambda$sort$0(FileInfo fileInfo, FileInfo fileInfo2) {
        long j = fileInfo2.size;
        long j2 = fileInfo.size;
        if (j > j2) {
            return 1;
        }
        return j < j2 ? -1 : 0;
    }

    private void remove(int i, FileInfo fileInfo) {
        ArrayList listByType = getListByType(i);
        if (listByType != null) {
            listByType.remove(fileInfo);
        }
    }

    private void sort(ArrayList arrayList) {
        Collections.sort(arrayList, new Comparator() {
            @Override
            public final int compare(Object obj, Object obj2) {
                int lambda$sort$0;
                lambda$sort$0 = CacheModel.lambda$sort$0((CacheModel.FileInfo) obj, (CacheModel.FileInfo) obj2);
                return lambda$sort$0;
            }
        });
    }

    public void add(int i, FileInfo fileInfo) {
        getListByType(i).add(fileInfo);
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
                    boolean contains = this.selectedFiles.contains(arrayList.get(i2));
                    if (z) {
                        if (!contains) {
                            this.selectedFiles.add((FileInfo) arrayList.get(i2));
                            incSize((FileInfo) arrayList.get(i2), true);
                        }
                    } else if (contains) {
                        this.selectedFiles.remove(arrayList.get(i2));
                        incSize((FileInfo) arrayList.get(i2), false);
                    }
                }
            }
        }
    }

    public void clearSelection() {
        this.selectedSize = 0L;
        this.selectedFiles.clear();
        this.selectedDialogs.clear();
    }

    public int getSelectedFiles() {
        return this.selectedFiles.size();
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

    public boolean isEmpty() {
        return this.media.isEmpty() && this.documents.isEmpty() && this.music.isEmpty() && (this.isDialog || this.entities.isEmpty());
    }

    public boolean isSelected(long j) {
        return this.selectedDialogs.contains(Long.valueOf(j));
    }

    public boolean isSelected(FileInfo fileInfo) {
        return this.selectedFiles.contains(fileInfo);
    }

    public void onFileDeleted(FileInfo fileInfo) {
        if (this.selectedFiles.remove(fileInfo)) {
            this.selectedSize -= fileInfo.size;
        }
        remove(fileInfo.type, fileInfo);
    }

    public void remove(CacheControlActivity.DialogFileEntities dialogFileEntities) {
        this.entities.remove(dialogFileEntities);
    }

    public CacheControlActivity.DialogFileEntities removeSelectedFiles() {
        CacheControlActivity.DialogFileEntities dialogFileEntities = new CacheControlActivity.DialogFileEntities(0L);
        Iterator it = this.selectedFiles.iterator();
        while (it.hasNext()) {
            FileInfo fileInfo = (FileInfo) it.next();
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

    public void setEntities(ArrayList arrayList) {
        this.entities = arrayList;
        this.entitiesByDialogId.clear();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            CacheControlActivity.DialogFileEntities dialogFileEntities = (CacheControlActivity.DialogFileEntities) it.next();
            this.entitiesByDialogId.put(dialogFileEntities.dialogId, dialogFileEntities);
        }
    }

    public void sortBySize() {
        sort(this.media);
        sort(this.documents);
        sort(this.music);
        sort(this.voice);
        sort(this.stories);
    }

    public void toggleSelect(CacheControlActivity.DialogFileEntities dialogFileEntities) {
        int i = 0;
        if (this.selectedDialogs.contains(Long.valueOf(dialogFileEntities.dialogId))) {
            while (i < dialogFileEntities.entitiesByType.size()) {
                Iterator it = ((CacheControlActivity.FileEntities) dialogFileEntities.entitiesByType.valueAt(i)).files.iterator();
                while (it.hasNext()) {
                    FileInfo fileInfo = (FileInfo) it.next();
                    if (this.selectedFiles.remove(fileInfo)) {
                        this.selectedSize -= fileInfo.size;
                    }
                }
                i++;
            }
        } else {
            while (i < dialogFileEntities.entitiesByType.size()) {
                Iterator it2 = ((CacheControlActivity.FileEntities) dialogFileEntities.entitiesByType.valueAt(i)).files.iterator();
                while (it2.hasNext()) {
                    FileInfo fileInfo2 = (FileInfo) it2.next();
                    if (this.selectedFiles.add(fileInfo2)) {
                        this.selectedSize += fileInfo2.size;
                    }
                }
                i++;
            }
        }
        checkSelectedDialogs();
    }

    public void toggleSelect(FileInfo fileInfo) {
        boolean z;
        long j;
        if (this.selectedFiles.contains(fileInfo)) {
            this.selectedFiles.remove(fileInfo);
            z = false;
            incSize(fileInfo, false);
            j = this.selectedSize - fileInfo.size;
        } else {
            this.selectedFiles.add(fileInfo);
            z = true;
            incSize(fileInfo, true);
            j = this.selectedSize + fileInfo.size;
        }
        this.selectedSize = j;
        checkAllFilesSelected(fileInfo.type, z);
        checkSelectedDialogs();
    }
}
