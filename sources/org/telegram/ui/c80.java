package org.telegram.ui;

import android.content.SharedPreferences;
import android.os.StatFs;
import java.io.File;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.ConnectionsManager;
public final class c80 implements Runnable {
    public final int f35866a;
    public final LaunchActivity f35867b;
    public final int f35868c;

    public c80(LaunchActivity launchActivity, int i10, int i11) {
        this.f35866a = i11;
        this.f35867b = launchActivity;
        this.f35868c = i10;
    }

    @Override
    public final void run() {
        File directory;
        int i10 = this.f35866a;
        int i11 = this.f35868c;
        LaunchActivity launchActivity = this.f35867b;
        switch (i10) {
            case 0:
                Pattern pattern = LaunchActivity.C1;
                if (UserConfig.getInstance(launchActivity.O).isClientActivated()) {
                    try {
                        SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
                        if ((((i11 == 2 || i11 == 1) && Math.abs(launchActivity.f33205x1 - System.currentTimeMillis()) > 240000) || Math.abs(globalMainSettings.getLong("last_space_check", 0L) - System.currentTimeMillis()) >= 259200000) && (directory = FileLoader.getDirectory(4)) != null) {
                            StatFs statFs = new StatFs(directory.getAbsolutePath());
                            long availableBlocksLong = statFs.getAvailableBlocksLong() * statFs.getBlockSizeLong();
                            if (i11 > 0 || availableBlocksLong < 52428800) {
                                if (i11 > 0) {
                                    launchActivity.f33205x1 = System.currentTimeMillis();
                                }
                                globalMainSettings.edit().putLong("last_space_check", System.currentTimeMillis()).commit();
                                AndroidUtilities.runOnUIThread(new j80(launchActivity, 10));
                            } else {
                                return;
                            }
                        }
                        return;
                    } catch (Throwable unused) {
                        return;
                    }
                }
                return;
            default:
                Pattern pattern2 = LaunchActivity.C1;
                ConnectionsManager.getInstance(launchActivity.O).cancelRequest(i11, true);
                return;
        }
    }
}
