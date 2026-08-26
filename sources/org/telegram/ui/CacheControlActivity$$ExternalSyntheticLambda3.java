package org.telegram.ui;

import java.io.File;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.Utilities;

public final class CacheControlActivity$$ExternalSyntheticLambda3 implements Runnable {
    public final int $r8$classId;
    public final Utilities.Callback f$0;

    public CacheControlActivity$$ExternalSyntheticLambda3(int i, Utilities.Callback callback) {
        this.$r8$classId = i;
        this.f$0 = callback;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                Utilities.Callback callback = this.f$0;
                CacheControlActivity.canceled = false;
                long directorySize = CacheControlActivity.getDirectorySize(5, FileLoader.checkDirectory(4));
                long directorySize2 = CacheControlActivity.getDirectorySize(4, FileLoader.checkDirectory(4));
                long directorySize3 = CacheControlActivity.getDirectorySize(0, FileLoader.checkDirectory(100)) + CacheControlActivity.getDirectorySize(0, FileLoader.checkDirectory(0));
                long directorySize4 = CacheControlActivity.getDirectorySize(0, FileLoader.checkDirectory(101)) + CacheControlActivity.getDirectorySize(0, FileLoader.checkDirectory(2));
                long directorySize5 = CacheControlActivity.getDirectorySize(1, FileLoader.checkDirectory(5)) + CacheControlActivity.getDirectorySize(1, FileLoader.checkDirectory(3));
                long directorySize6 = CacheControlActivity.getDirectorySize(2, FileLoader.checkDirectory(5)) + CacheControlActivity.getDirectorySize(2, FileLoader.checkDirectory(3));
                long directorySize7 = CacheControlActivity.getDirectorySize(3, FileLoader.checkDirectory(4)) + CacheControlActivity.getDirectorySize(0, new File(FileLoader.checkDirectory(4), "acache"));
                long directorySize8 = CacheControlActivity.getDirectorySize(0, FileLoader.checkDirectory(1));
                long directorySize9 = CacheControlActivity.getDirectorySize(0, FileLoader.checkDirectory(6));
                long directorySize10 = CacheControlActivity.getDirectorySize(1, AndroidUtilities.getLogsDir());
                if (!BuildVars.DEBUG_VERSION && directorySize10 < 268435456) {
                    directorySize10 = 0;
                }
                long j = directorySize + directorySize2 + directorySize4 + directorySize8 + directorySize3 + directorySize5 + directorySize6 + directorySize7 + directorySize9 + directorySize10;
                CacheControlActivity.lastTotalSizeCalculated = Long.valueOf(j);
                CacheControlActivity.lastTotalSizeCalculatedTime = System.currentTimeMillis();
                if (!CacheControlActivity.canceled) {
                    AndroidUtilities.runOnUIThread(new CacheControlActivity$$ExternalSyntheticLambda9(j, 0, callback));
                }
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new CacheControlActivity$$ExternalSyntheticLambda3(3, this.f$0));
                break;
            case 2:
                this.f$0.run(null);
                break;
            case 3:
                this.f$0.run(null);
                break;
            default:
                this.f$0.run(LaunchActivity.getSafeLastFragment());
                break;
        }
    }
}
