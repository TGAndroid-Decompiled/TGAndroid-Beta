package org.telegram.ui;

import android.content.DialogInterface;
public final class i70 implements DialogInterface.OnDismissListener {
    public final int f47925a;
    public final LaunchActivity f47926b;

    public i70(LaunchActivity launchActivity, int i7) {
        this.f47925a = i7;
        this.f47926b = launchActivity;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        int i7 = this.f47925a;
        LaunchActivity launchActivity = this.f47926b;
        switch (i7) {
            case 0:
                launchActivity.f42664w1 = false;
                return;
            case 1:
                String str = LaunchActivity.C1;
                org.telegram.messenger.g0.i3(new q60(launchActivity, 7), 30000L);
                return;
            default:
                String str2 = LaunchActivity.C1;
                org.telegram.messenger.g0.i3(new q60(launchActivity, 10), 30000L);
                return;
        }
    }
}
