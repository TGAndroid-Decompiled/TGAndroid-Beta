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
public final class n80 implements Runnable {
    public final int f36406a;
    public final LaunchActivity f36407b;
    public final int f36408c;

    public n80(LaunchActivity launchActivity, int i10, int i11) {
        this.f36406a = i11;
        this.f36407b = launchActivity;
        this.f36408c = i10;
    }

    @Override
    public final void run() {
        File directory;
        int i10 = this.f36406a;
        int i11 = this.f36408c;
        LaunchActivity launchActivity = this.f36407b;
        switch (i10) {
            case 0:
                Pattern pattern = LaunchActivity.f31586y1;
                if (UserConfig.getInstance(launchActivity.L).isClientActivated()) {
                    try {
                        SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
                        if ((((i11 == 2 || i11 == 1) && Math.abs(launchActivity.f31625t1 - System.currentTimeMillis()) > 240000) || Math.abs(globalMainSettings.getLong("last_space_check", 0L) - System.currentTimeMillis()) >= 259200000) && (directory = FileLoader.getDirectory(4)) != null) {
                            StatFs statFs = new StatFs(directory.getAbsolutePath());
                            long availableBlocksLong = statFs.getAvailableBlocksLong() * statFs.getBlockSizeLong();
                            if (i11 > 0 || availableBlocksLong < 52428800) {
                                if (i11 > 0) {
                                    launchActivity.f31625t1 = System.currentTimeMillis();
                                }
                                globalMainSettings.edit().putLong("last_space_check", System.currentTimeMillis()).commit();
                                AndroidUtilities.runOnUIThread(new z80(launchActivity, 6));
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
                Pattern pattern2 = LaunchActivity.f31586y1;
                ConnectionsManager.getInstance(launchActivity.L).cancelRequest(i11, true);
                return;
        }
    }
}
