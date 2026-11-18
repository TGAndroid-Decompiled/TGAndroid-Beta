package org.telegram.ui;

import android.content.DialogInterface;
public final class k70 implements DialogInterface.OnDismissListener {
    public final int f49206a;
    public final LaunchActivity f49207b;

    public k70(LaunchActivity launchActivity, int i7) {
        this.f49206a = i7;
        this.f49207b = launchActivity;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        int i7 = this.f49206a;
        LaunchActivity launchActivity = this.f49207b;
        switch (i7) {
            case 0:
                launchActivity.f43109w1 = false;
                return;
            case 1:
                String str = LaunchActivity.C1;
                org.telegram.messenger.g0.h3(new s60(launchActivity, 7), 30000L);
                return;
            default:
                String str2 = LaunchActivity.C1;
                org.telegram.messenger.g0.h3(new s60(launchActivity, 10), 30000L);
                return;
        }
    }
}
