package org.telegram.ui;

import android.content.SharedPreferences;
import android.os.StatFs;
import java.io.File;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.ConnectionsManager;

public final class LaunchActivity$$ExternalSyntheticLambda8 implements Runnable {
    public final int $r8$classId;
    public final LaunchActivity f$0;
    public final int f$1;

    public LaunchActivity$$ExternalSyntheticLambda8(LaunchActivity launchActivity, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = launchActivity;
        this.f$1 = i;
    }

    @Override
    public final void run() {
        File directory;
        switch (this.$r8$classId) {
            case 0:
                LaunchActivity launchActivity = this.f$0;
                if (UserConfig.getInstance(launchActivity.currentAccount).isClientActivated()) {
                    try {
                        SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
                        int i = this.f$1;
                        if ((((i == 2 || i == 1) && Math.abs(launchActivity.alreadyShownFreeDiscSpaceAlertForced - System.currentTimeMillis()) > 240000) || Math.abs(globalMainSettings.getLong("last_space_check", 0L) - System.currentTimeMillis()) >= 259200000) && (directory = FileLoader.getDirectory(4)) != null) {
                            StatFs statFs = new StatFs(directory.getAbsolutePath());
                            long availableBlocksLong = statFs.getAvailableBlocksLong() * statFs.getBlockSizeLong();
                            if (i > 0 || availableBlocksLong < 52428800) {
                                if (i > 0) {
                                    launchActivity.alreadyShownFreeDiscSpaceAlertForced = System.currentTimeMillis();
                                }
                                globalMainSettings.edit().putLong("last_space_check", System.currentTimeMillis()).commit();
                                AndroidUtilities.runOnUIThread(new LaunchActivity$$ExternalSyntheticLambda20(launchActivity, 5));
                            }
                        }
                    } catch (Throwable unused) {
                        return;
                    }
                    break;
                }
                break;
            default:
                ConnectionsManager.getInstance(this.f$0.currentAccount).cancelRequest(this.f$1, true);
                break;
        }
    }
}
