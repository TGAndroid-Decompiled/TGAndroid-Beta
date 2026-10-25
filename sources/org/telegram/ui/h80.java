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
public final class h80 implements Runnable {
    public final int f39931a;
    public final LaunchActivity f39932b;
    public final int f39933c;

    public h80(LaunchActivity launchActivity, int i10, int i11) {
        this.f39931a = i11;
        this.f39932b = launchActivity;
        this.f39933c = i10;
    }

    @Override
    public final void run() {
        File directory;
        int i10 = this.f39931a;
        int i11 = this.f39933c;
        LaunchActivity launchActivity = this.f39932b;
        switch (i10) {
            case 0:
                Pattern pattern = LaunchActivity.D1;
                if (UserConfig.getInstance(launchActivity.O).isClientActivated()) {
                    try {
                        SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
                        if ((((i11 == 2 || i11 == 1) && Math.abs(launchActivity.f35567y1 - System.currentTimeMillis()) > 240000) || Math.abs(globalMainSettings.getLong("last_space_check", 0L) - System.currentTimeMillis()) >= 259200000) && (directory = FileLoader.getDirectory(4)) != null) {
                            StatFs statFs = new StatFs(directory.getAbsolutePath());
                            long availableBlocksLong = statFs.getAvailableBlocksLong() * statFs.getBlockSizeLong();
                            if (i11 > 0 || availableBlocksLong < 52428800) {
                                if (i11 > 0) {
                                    launchActivity.f35567y1 = System.currentTimeMillis();
                                }
                                globalMainSettings.edit().putLong("last_space_check", System.currentTimeMillis()).commit();
                                AndroidUtilities.runOnUIThread(new o80(launchActivity, 10));
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
                Pattern pattern2 = LaunchActivity.D1;
                ConnectionsManager.getInstance(launchActivity.O).cancelRequest(i11, true);
                return;
        }
    }
}
