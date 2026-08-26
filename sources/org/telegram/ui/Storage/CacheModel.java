package org.telegram.ui.Storage;

import android.util.LongSparseArray;
import android.util.SparseArray;
import com.google.android.exoplayer2.util.ConditionVariable;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.MessageObject;
import org.telegram.ui.CacheControlActivity;
import org.telegram.ui.OAuthSheet$$ExternalSyntheticLambda3;

public final class CacheModel {
    public boolean allDocumentsSelected;
    public boolean allMusicSelected;
    public boolean allPhotosSelected;
    public boolean allVideosSelected;
    public boolean allVoiceSelected;
    public long documentsSelectedSize;
    public final boolean isDialog;
    public long musicSelectedSize;
    public long photosSelectedSize;
    public long selectedSize;
    public long videosSelectedSize;
    public long voiceSelectedSize;
    public ArrayList entities = new ArrayList();
    public final LongSparseArray entitiesByDialogId = new LongSparseArray();
    public final ArrayList media = new ArrayList();
    public final ArrayList documents = new ArrayList();
    public final ArrayList music = new ArrayList();
    public final ArrayList voice = new ArrayList();
    public final ArrayList stories = new ArrayList();
    public final HashSet dialogIdsTmp = new HashSet();
    public final HashSet selectedFiles = new HashSet();
    public final HashSet selectedDialogs = new HashSet();

    public final class FileInfo {
        public long dialogId;
        public final File file;
        public int messageId;
        public MessageObject messageObject;
        public int messageType;
        public ConditionVariable metadata;
        public long size;
        public int type;

        public FileInfo(File file) {
            this.file = file;
        }
    }

    public CacheModel(boolean z) {
        this.isDialog = z;
    }

    public static void sort(ArrayList arrayList) {
        Collections.sort(arrayList, new OAuthSheet$$ExternalSyntheticLambda3(9));
    }

    public final void checkAllFilesSelected(int i, boolean z) {
        if (this.isDialog) {
            if (!z) {
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
                } else if (i == 3) {
                    this.allMusicSelected = false;
                    return;
                } else {
                    if (i == 4) {
                        this.allVoiceSelected = false;
                        return;
                    }
                    return;
                }
            }
            ArrayList arrayList = this.media;
            if (i == 0) {
                this.allPhotosSelected = checkAllFilesSelectedInArray(i, arrayList);
                return;
            }
            if (i == 1) {
                this.allVideosSelected = checkAllFilesSelectedInArray(i, arrayList);
                return;
            }
            if (i == 2) {
                this.allDocumentsSelected = checkAllFilesSelectedInArray(i, this.documents);
                return;
            }
            if (i == 3) {
                this.allMusicSelected = checkAllFilesSelectedInArray(i, this.music);
            } else if (i == 4) {
                this.allVoiceSelected = checkAllFilesSelectedInArray(i, this.voice);
            } else if (i == 7) {
                checkAllFilesSelectedInArray(i, this.stories);
            }
        }
    }

    public final boolean checkAllFilesSelectedInArray(int i, ArrayList arrayList) {
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            if (((FileInfo) arrayList.get(i2)).type == i && !this.selectedFiles.contains(arrayList.get(i2))) {
                return false;
            }
        }
        return true;
    }

    public final void checkSelectedDialogs() {
        if (this.isDialog) {
            return;
        }
        HashSet hashSet = this.dialogIdsTmp;
        hashSet.clear();
        HashSet hashSet2 = this.selectedFiles;
        Iterator it = hashSet2.iterator();
        while (it.hasNext()) {
            long j = ((FileInfo) it.next()).dialogId;
            if (j != 0) {
                hashSet.add(Long.valueOf(j));
            }
        }
        HashSet hashSet3 = this.selectedDialogs;
        hashSet3.clear();
        Iterator it2 = hashSet.iterator();
        while (it2.hasNext()) {
            CacheControlActivity.DialogFileEntities dialogFileEntities = (CacheControlActivity.DialogFileEntities) this.entitiesByDialogId.get(((Long) it2.next()).longValue());
            if (dialogFileEntities != null) {
                int i = 0;
                while (true) {
                    SparseArray sparseArray = dialogFileEntities.entitiesByType;
                    if (i >= sparseArray.size()) {
                        hashSet3.add(Long.valueOf(dialogFileEntities.dialogId));
                        break;
                    }
                    ArrayList arrayList = ((CacheControlActivity.FileEntities) sparseArray.valueAt(i)).files;
                    int size = arrayList.size();
                    int i2 = 0;
                    while (i2 < size) {
                        Object obj = arrayList.get(i2);
                        i2++;
                        if (!hashSet2.contains((FileInfo) obj)) {
                            break;
                        }
                    }
                    i++;
                }
            }
        }
    }

    public final ArrayList getListByType(int i) {
        ArrayList arrayList = this.media;
        if (i == 0 || i == 1) {
            return arrayList;
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

    public final long getSelectedFilesSize(int i) {
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

    public final void incSize(FileInfo fileInfo, boolean z) {
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
        } else if (i == 3) {
            this.musicSelectedSize += j;
        } else if (i == 4) {
            this.voiceSelectedSize += j;
        }
    }

    public final boolean isEmpty() {
        if (this.media.isEmpty() && this.documents.isEmpty() && this.music.isEmpty()) {
            return this.isDialog || this.entities.isEmpty();
        }
        return false;
    }

    public final void toggleSelect(FileInfo fileInfo) {
        HashSet hashSet = this.selectedFiles;
        if (hashSet.contains(fileInfo)) {
            hashSet.remove(fileInfo);
            incSize(fileInfo, false);
            this.selectedSize -= fileInfo.size;
            checkAllFilesSelected(fileInfo.type, false);
        } else {
            hashSet.add(fileInfo);
            incSize(fileInfo, true);
            this.selectedSize += fileInfo.size;
            checkAllFilesSelected(fileInfo.type, true);
        }
        checkSelectedDialogs();
    }
}
