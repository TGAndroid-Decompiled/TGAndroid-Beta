package org.telegram.ui;

import android.os.StatFs;
import android.text.TextUtils;
import android.util.LongSparseArray;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.Storage.CacheModel;

public final class CacheControlActivity$$ExternalSyntheticLambda1 implements Runnable {
    public final int $r8$classId;
    public final CacheControlActivity f$0;

    public CacheControlActivity$$ExternalSyntheticLambda1(CacheControlActivity cacheControlActivity, int i) {
        this.$r8$classId = i;
        this.f$0 = cacheControlActivity;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                CacheControlActivity cacheControlActivity = this.f$0;
                cacheControlActivity.cacheSize = CacheControlActivity.getDirectorySize(5, FileLoader.checkDirectory(4));
                if (!CacheControlActivity.canceled) {
                    cacheControlActivity.cacheTempSize = CacheControlActivity.getDirectorySize(4, FileLoader.checkDirectory(4));
                    if (!CacheControlActivity.canceled) {
                        long directorySize = CacheControlActivity.getDirectorySize(0, FileLoader.checkDirectory(0));
                        cacheControlActivity.photoSize = directorySize;
                        cacheControlActivity.photoSize = CacheControlActivity.getDirectorySize(0, FileLoader.checkDirectory(100)) + directorySize;
                        if (!CacheControlActivity.canceled) {
                            long directorySize2 = CacheControlActivity.getDirectorySize(0, FileLoader.checkDirectory(2));
                            cacheControlActivity.videoSize = directorySize2;
                            cacheControlActivity.videoSize = CacheControlActivity.getDirectorySize(0, FileLoader.checkDirectory(101)) + directorySize2;
                            if (!CacheControlActivity.canceled) {
                                long directorySize3 = CacheControlActivity.getDirectorySize(1, AndroidUtilities.getLogsDir());
                                cacheControlActivity.logsSize = directorySize3;
                                if (!BuildVars.DEBUG_VERSION && directorySize3 < 268435456) {
                                    cacheControlActivity.logsSize = 0L;
                                }
                                if (!CacheControlActivity.canceled) {
                                    long directorySize4 = CacheControlActivity.getDirectorySize(1, FileLoader.checkDirectory(3));
                                    cacheControlActivity.documentsSize = directorySize4;
                                    cacheControlActivity.documentsSize = CacheControlActivity.getDirectorySize(1, FileLoader.checkDirectory(5)) + directorySize4;
                                    if (!CacheControlActivity.canceled) {
                                        long directorySize5 = CacheControlActivity.getDirectorySize(2, FileLoader.checkDirectory(3));
                                        cacheControlActivity.musicSize = directorySize5;
                                        cacheControlActivity.musicSize = CacheControlActivity.getDirectorySize(2, FileLoader.checkDirectory(5)) + directorySize5;
                                        if (!CacheControlActivity.canceled) {
                                            cacheControlActivity.stickersCacheSize = CacheControlActivity.getDirectorySize(0, new File(FileLoader.checkDirectory(4), "acache"));
                                            if (!CacheControlActivity.canceled) {
                                                cacheControlActivity.cacheEmojiSize = CacheControlActivity.getDirectorySize(3, FileLoader.checkDirectory(4));
                                                if (!CacheControlActivity.canceled) {
                                                    cacheControlActivity.stickersCacheSize += cacheControlActivity.cacheEmojiSize;
                                                    cacheControlActivity.audioSize = CacheControlActivity.getDirectorySize(0, FileLoader.checkDirectory(1));
                                                    cacheControlActivity.storiesSize = CacheControlActivity.getDirectorySize(0, FileLoader.checkDirectory(6));
                                                    if (!CacheControlActivity.canceled) {
                                                        long j = cacheControlActivity.cacheSize + cacheControlActivity.cacheTempSize + cacheControlActivity.videoSize + cacheControlActivity.logsSize + cacheControlActivity.audioSize + cacheControlActivity.photoSize + cacheControlActivity.documentsSize + cacheControlActivity.musicSize + cacheControlActivity.storiesSize + cacheControlActivity.stickersCacheSize;
                                                        CacheControlActivity.lastTotalSizeCalculated = Long.valueOf(j);
                                                        cacheControlActivity.totalSize = j;
                                                        CacheControlActivity.lastTotalSizeCalculatedTime = System.currentTimeMillis();
                                                        ArrayList<File> rootDirs = AndroidUtilities.getRootDirs();
                                                        File file = rootDirs.get(0);
                                                        file.getAbsolutePath();
                                                        if (!TextUtils.isEmpty(SharedConfig.storageCacheDir)) {
                                                            int size = rootDirs.size();
                                                            for (int i = 0; i < size; i++) {
                                                                File file2 = rootDirs.get(i);
                                                                if (file2.getAbsolutePath().startsWith(SharedConfig.storageCacheDir)) {
                                                                    file = file2;
                                                                }
                                                            }
                                                        }
                                                        try {
                                                            StatFs statFs = new StatFs(file.getPath());
                                                            long blockSizeLong = statFs.getBlockSizeLong();
                                                            long availableBlocksLong = statFs.getAvailableBlocksLong();
                                                            cacheControlActivity.totalDeviceSize = statFs.getBlockCountLong() * blockSizeLong;
                                                            cacheControlActivity.totalDeviceFreeSize = availableBlocksLong * blockSizeLong;
                                                        } catch (Exception e) {
                                                            FileLog.e(e);
                                                        }
                                                        AndroidUtilities.runOnUIThread(new CacheControlActivity$$ExternalSyntheticLambda1(cacheControlActivity, 1));
                                                        cacheControlActivity.getFileLoader().getFileDatabase().getQueue().postRunnable(new CacheControlActivity$$ExternalSyntheticLambda1(cacheControlActivity, 2));
                                                        break;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                break;
            case 1:
                CacheControlActivity cacheControlActivity2 = this.f$0;
                cacheControlActivity2.resumeDelayedFragmentAnimation();
                cacheControlActivity2.calculating = false;
                cacheControlActivity2.updateRows$1(true);
                cacheControlActivity2.updateChart();
                break;
            default:
                CacheControlActivity cacheControlActivity3 = this.f$0;
                cacheControlActivity3.getFileLoader().getFileDatabase().ensureDatabaseCreated();
                CacheModel cacheModel = new CacheModel(false);
                LongSparseArray longSparseArray = new LongSparseArray();
                cacheControlActivity3.fillDialogsEntitiesRecursive(FileLoader.checkDirectory(4), 6, longSparseArray, cacheModel);
                cacheControlActivity3.fillDialogsEntitiesRecursive(FileLoader.checkDirectory(0), 0, longSparseArray, cacheModel);
                cacheControlActivity3.fillDialogsEntitiesRecursive(FileLoader.checkDirectory(100), 0, longSparseArray, cacheModel);
                cacheControlActivity3.fillDialogsEntitiesRecursive(FileLoader.checkDirectory(2), 1, longSparseArray, cacheModel);
                cacheControlActivity3.fillDialogsEntitiesRecursive(FileLoader.checkDirectory(101), 1, longSparseArray, cacheModel);
                cacheControlActivity3.fillDialogsEntitiesRecursive(FileLoader.checkDirectory(1), 4, longSparseArray, cacheModel);
                cacheControlActivity3.fillDialogsEntitiesRecursive(FileLoader.checkDirectory(6), 6, longSparseArray, cacheModel);
                cacheControlActivity3.fillDialogsEntitiesRecursive(FileLoader.checkDirectory(3), 2, longSparseArray, cacheModel);
                cacheControlActivity3.fillDialogsEntitiesRecursive(FileLoader.checkDirectory(5), 2, longSparseArray, cacheModel);
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                for (int i2 = 0; i2 < longSparseArray.size(); i2++) {
                    CacheControlActivity.DialogFileEntities dialogFileEntities = (CacheControlActivity.DialogFileEntities) longSparseArray.valueAt(i2);
                    arrayList.add(dialogFileEntities);
                    if (cacheControlActivity3.getMessagesController().getUserOrChat(((CacheControlActivity.DialogFileEntities) arrayList.get(i2)).dialogId) == null) {
                        long j2 = dialogFileEntities.dialogId;
                        if (j2 > 0) {
                            arrayList2.add(Long.valueOf(j2));
                        } else {
                            arrayList3.add(Long.valueOf(j2));
                        }
                    }
                }
                CacheModel.sort(cacheModel.media);
                CacheModel.sort(cacheModel.documents);
                CacheModel.sort(cacheModel.music);
                CacheModel.sort(cacheModel.voice);
                CacheModel.sort(cacheModel.stories);
                cacheControlActivity3.getMessagesStorage().getStorageQueue().postRunnable(new CacheControlActivity$$ExternalSyntheticLambda18(cacheControlActivity3, arrayList2, arrayList3, arrayList, cacheModel, 0));
                break;
        }
    }
}
