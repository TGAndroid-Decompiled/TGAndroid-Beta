package org.telegram.ui;

import android.content.DialogInterface;
public final class l70 implements DialogInterface.OnDismissListener {
    public final int f49509a;
    public final LaunchActivity f49510b;

    public l70(LaunchActivity launchActivity, int i7) {
        this.f49509a = i7;
        this.f49510b = launchActivity;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        int i7 = this.f49509a;
        LaunchActivity launchActivity = this.f49510b;
        switch (i7) {
            case 0:
                launchActivity.f43150w1 = false;
                return;
            case 1:
                String str = LaunchActivity.C1;
                org.telegram.messenger.g0.h3(new t60(launchActivity, 7), 30000L);
                return;
            default:
                String str2 = LaunchActivity.C1;
                org.telegram.messenger.g0.h3(new t60(launchActivity, 10), 30000L);
                return;
        }
    }
}
