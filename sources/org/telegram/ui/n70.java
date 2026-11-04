package org.telegram.ui;

import android.content.SharedPreferences;
import android.os.StatFs;
import java.io.File;
import org.telegram.tgnet.ConnectionsManager;
public final class n70 implements Runnable {
    public final int f47907a;
    public final LaunchActivity f47908b;
    public final int f47909c;

    public n70(LaunchActivity launchActivity, int i3, int i10) {
        this.f47907a = i10;
        this.f47908b = launchActivity;
        this.f47909c = i3;
    }

    @Override
    public final void run() {
        File z10;
        int i3 = this.f47907a;
        int i10 = this.f47909c;
        LaunchActivity launchActivity = this.f47908b;
        switch (i3) {
            case 0:
                String str = LaunchActivity.E1;
                ConnectionsManager.getInstance(launchActivity.P).cancelRequest(i10, true);
                return;
            default:
                String str2 = LaunchActivity.E1;
                if (org.telegram.messenger.h10.i(launchActivity.P).p()) {
                    try {
                        SharedPreferences e12 = org.telegram.messenger.hp.e1();
                        if ((((i10 == 2 || i10 == 1) && Math.abs(launchActivity.f41331z1 - System.currentTimeMillis()) > 240000) || Math.abs(e12.getLong("last_space_check", 0L) - System.currentTimeMillis()) >= 259200000) && (z10 = org.telegram.messenger.w7.z(4)) != null) {
                            StatFs statFs = new StatFs(z10.getAbsolutePath());
                            long availableBlocksLong = statFs.getAvailableBlocksLong() * statFs.getBlockSizeLong();
                            if (i10 > 0 || availableBlocksLong < 52428800) {
                                if (i10 > 0) {
                                    launchActivity.f41331z1 = System.currentTimeMillis();
                                }
                                e12.edit().putLong("last_space_check", System.currentTimeMillis()).commit();
                                org.telegram.messenger.g0.h3(new m60(launchActivity, 2));
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
        }
    }
}
