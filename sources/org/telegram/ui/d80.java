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

public final class d80 implements Runnable {

    public final int f37302a;

    public final LaunchActivity f37303b;

    public final int f37304c;

    public d80(LaunchActivity launchActivity, int i10, int i11) {
        this.f37302a = i11;
        this.f37303b = launchActivity;
        this.f37304c = i10;
    }

    @Override
    public final void run() {
        File directory;
        int i10 = this.f37302a;
        int i11 = this.f37304c;
        LaunchActivity launchActivity = this.f37303b;
        switch (i10) {
            case 0:
                Pattern pattern = LaunchActivity.f35496x1;
                if (UserConfig.getInstance(launchActivity.K).isClientActivated()) {
                    try {
                        SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
                        if ((((i11 == 2 || i11 == 1) && Math.abs(launchActivity.f35534s1 - System.currentTimeMillis()) > 240000) || Math.abs(globalMainSettings.getLong("last_space_check", 0L) - System.currentTimeMillis()) >= 259200000) && (directory = FileLoader.getDirectory(4)) != null) {
                            StatFs statFs = new StatFs(directory.getAbsolutePath());
                            long availableBlocksLong = statFs.getAvailableBlocksLong() * statFs.getBlockSizeLong();
                            if (i11 > 0 || availableBlocksLong < 52428800) {
                                if (i11 > 0) {
                                    launchActivity.f35534s1 = System.currentTimeMillis();
                                }
                                globalMainSettings.edit().putLong("last_space_check", System.currentTimeMillis()).commit();
                                AndroidUtilities.runOnUIThread(new p80(launchActivity, 6));
                            }
                        }
                    } catch (Throwable unused) {
                        return;
                    }
                    break;
                }
                break;
            default:
                Pattern pattern2 = LaunchActivity.f35496x1;
                ConnectionsManager.getInstance(launchActivity.K).cancelRequest(i11, true);
                break;
        }
    }
}
