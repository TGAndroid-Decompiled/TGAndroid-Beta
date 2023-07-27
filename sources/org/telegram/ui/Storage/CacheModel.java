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
    public ArrayList<CacheControlActivity.DialogFileEntities> entities = new ArrayList<>();
    private final LongSparseArray<CacheControlActivity.DialogFileEntities> entitiesByDialogId = new LongSparseArray<>();
    public final ArrayList<FileInfo> media = new ArrayList<>();
    public final ArrayList<FileInfo> documents = new ArrayList<>();
    public final ArrayList<FileInfo> music = new ArrayList<>();
    public final ArrayList<FileInfo> voice = new ArrayList<>();
    public final ArrayList<FileInfo> stories = new ArrayList<>();
    private final HashSet<Long> dialogIdsTmp = new HashSet<>();
    public HashSet<FileInfo> selectedFiles = new HashSet<>();
    public HashSet<Long> selectedDialogs = new HashSet<>();

    public CacheModel(boolean z) {
        this.isDialog = z;
    }

    public void add(int i, FileInfo fileInfo) {
        getListByType(i).add(fileInfo);
    }

    private ArrayList<FileInfo> getListByType(int i) {
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
        ArrayList<FileInfo> listByType = getListByType(i);
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

    private void sort(ArrayList<FileInfo> arrayList) {
        Collections.sort(arrayList, new Comparator() {
            @Override
            public final int compare(Object obj, Object obj2) {
                int lambda$sort$0;
                lambda$sort$0 = CacheModel.lambda$sort$0((CacheModel.FileInfo) obj, (CacheModel.FileInfo) obj2);
                return lambda$sort$0;
            }
        });
    }

    public static int lambda$sort$0(FileInfo fileInfo, FileInfo fileInfo2) {
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
            if (!z) {
                if (i == 0) {
                    this.allPhotosSelected = false;
                } else if (i == 1) {
                    this.allVideosSelected = false;
                } else if (i == 2) {
                    this.allDocumentsSelected = false;
                } else if (i == 3) {
                    this.allMusicSelected = false;
                } else if (i == 4) {
                    this.allVoiceSelected = false;
                }
            } else if (i == 0) {
                this.allPhotosSelected = checkAllFilesSelectedInArray(i, this.media);
            } else if (i == 1) {
                this.allVideosSelected = checkAllFilesSelectedInArray(i, this.media);
            } else if (i == 2) {
                this.allDocumentsSelected = checkAllFilesSelectedInArray(i, this.documents);
            } else if (i == 3) {
                this.allMusicSelected = checkAllFilesSelectedInArray(i, this.music);
            } else if (i == 4) {
                this.allVoiceSelected = checkAllFilesSelectedInArray(i, this.voice);
            } else if (i == 7) {
                checkAllFilesSelectedInArray(i, this.stories);
            }
        }
    }

    private boolean checkAllFilesSelectedInArray(int i, ArrayList<FileInfo> arrayList) {
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            if (arrayList.get(i2).type == i && !this.selectedFiles.contains(arrayList.get(i2))) {
                return false;
            }
        }
        return true;
    }

    public void toggleSelect(CacheControlActivity.DialogFileEntities dialogFileEntities) {
        int i = 0;
        if (!this.selectedDialogs.contains(Long.valueOf(dialogFileEntities.dialogId))) {
            while (i < dialogFileEntities.entitiesByType.size()) {
                Iterator<FileInfo> it = dialogFileEntities.entitiesByType.valueAt(i).files.iterator();
                while (it.hasNext()) {
                    FileInfo next = it.next();
                    if (this.selectedFiles.add(next)) {
                        this.selectedSize += next.size;
                    }
                }
                i++;
            }
        } else {
            while (i < dialogFileEntities.entitiesByType.size()) {
                Iterator<FileInfo> it2 = dialogFileEntities.entitiesByType.valueAt(i).files.iterator();
                while (it2.hasNext()) {
                    FileInfo next2 = it2.next();
                    if (this.selectedFiles.remove(next2)) {
                        this.selectedSize -= next2.size;
                    }
                }
                i++;
            }
        }
        checkSelectedDialogs();
    }

    private void checkSelectedDialogs() {
        if (this.isDialog) {
            return;
        }
        this.dialogIdsTmp.clear();
        Iterator<FileInfo> it = this.selectedFiles.iterator();
        while (it.hasNext()) {
            long j = it.next().dialogId;
            if (j != 0) {
                this.dialogIdsTmp.add(Long.valueOf(j));
            }
        }
        this.selectedDialogs.clear();
        Iterator<Long> it2 = this.dialogIdsTmp.iterator();
        while (it2.hasNext()) {
            CacheControlActivity.DialogFileEntities dialogFileEntities = this.entitiesByDialogId.get(it2.next().longValue());
            if (dialogFileEntities != null) {
                int i = 0;
                while (true) {
                    if (i < dialogFileEntities.entitiesByType.size()) {
                        Iterator<FileInfo> it3 = dialogFileEntities.entitiesByType.valueAt(i).files.iterator();
                        while (it3.hasNext()) {
                            if (!this.selectedFiles.contains(it3.next())) {
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

    public void setEntities(ArrayList<CacheControlActivity.DialogFileEntities> arrayList) {
        this.entities = arrayList;
        this.entitiesByDialogId.clear();
        Iterator<CacheControlActivity.DialogFileEntities> it = arrayList.iterator();
        while (it.hasNext()) {
            CacheControlActivity.DialogFileEntities next = it.next();
            this.entitiesByDialogId.put(next.dialogId, next);
        }
    }

    public boolean isSelected(long j) {
        return this.selectedDialogs.contains(Long.valueOf(j));
    }

    public CacheControlActivity.DialogFileEntities removeSelectedFiles() {
        CacheControlActivity.DialogFileEntities dialogFileEntities = new CacheControlActivity.DialogFileEntities(0L);
        Iterator<FileInfo> it = this.selectedFiles.iterator();
        while (it.hasNext()) {
            FileInfo next = it.next();
            dialogFileEntities.addFile(next, next.type);
            CacheControlActivity.DialogFileEntities dialogFileEntities2 = this.entitiesByDialogId.get(next.dialogId);
            if (dialogFileEntities2 != null) {
                dialogFileEntities2.removeFile(next);
                if (dialogFileEntities2.isEmpty()) {
                    this.entitiesByDialogId.remove(next.dialogId);
                    this.entities.remove(dialogFileEntities2);
                }
                remove(next.type, next);
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
            this.selectedFiles.add(this.media.get(i));
            if (this.media.get(i).type == 0) {
                this.photosSelectedSize += this.media.get(i).size;
            } else {
                this.videosSelectedSize += this.media.get(i).size;
            }
        }
        for (int i2 = 0; i2 < this.documents.size(); i2++) {
            this.selectedFiles.add(this.documents.get(i2));
            this.documentsSelectedSize += this.documents.get(i2).size;
        }
        for (int i3 = 0; i3 < this.music.size(); i3++) {
            this.selectedFiles.add(this.music.get(i3));
            this.musicSelectedSize += this.music.get(i3).size;
        }
        for (int i4 = 0; i4 < this.voice.size(); i4++) {
            this.selectedFiles.add(this.voice.get(i4));
            this.voiceSelectedSize += this.voice.get(i4).size;
        }
        this.allPhotosSelected = true;
        this.allVideosSelected = true;
        this.allDocumentsSelected = true;
        this.allMusicSelected = true;
        this.allVoiceSelected = true;
    }

    public void allFilesSelcetedByType(int i, boolean z) {
        ArrayList<FileInfo> arrayList;
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
        } else {
            arrayList = i == 7 ? this.stories : null;
        }
        if (arrayList != null) {
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                if (arrayList.get(i2).type == i) {
                    if (z) {
                        if (!this.selectedFiles.contains(arrayList.get(i2))) {
                            this.selectedFiles.add(arrayList.get(i2));
                            incSize(arrayList.get(i2), true);
                        }
                    } else if (this.selectedFiles.contains(arrayList.get(i2))) {
                        this.selectedFiles.remove(arrayList.get(i2));
                        incSize(arrayList.get(i2), false);
                    }
                }
            }
        }
    }

    private void incSize(FileInfo fileInfo, boolean z) {
        long j = fileInfo.size;
        if (!z) {
            j = -j;
        }
        int i = fileInfo.type;
        if (i == 0) {
            this.photosSelectedSize += j;
        } else if (i == 1) {
            this.videosSelectedSize += j;
        } else if (i == 2) {
            this.documentsSelectedSize += j;
        } else if (i == 3) {
            this.musicSelectedSize += j;
        } else if (i == 4) {
            this.voiceSelectedSize += j;
        } else if (i == 7) {
            this.storiesSelectedSize += j;
        }
    }

    public boolean isEmpty() {
        return this.media.isEmpty() && this.documents.isEmpty() && this.music.isEmpty() && (this.isDialog || this.entities.isEmpty());
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
