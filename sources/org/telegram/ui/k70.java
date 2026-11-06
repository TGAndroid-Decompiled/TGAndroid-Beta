package org.telegram.ui;

import android.content.DialogInterface;
public final class k70 implements DialogInterface.OnDismissListener {
    public final int f47136a;
    public final LaunchActivity f47137b;

    public k70(LaunchActivity launchActivity, int i7) {
        this.f47136a = i7;
        this.f47137b = launchActivity;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        int i7 = this.f47136a;
        LaunchActivity launchActivity = this.f47137b;
        switch (i7) {
            case 0:
                launchActivity.f41291v1 = false;
                return;
            case 1:
                String str = LaunchActivity.B1;
                org.telegram.messenger.g0.i3(new s60(launchActivity, 7), 30000L);
                return;
            default:
                String str2 = LaunchActivity.B1;
                org.telegram.messenger.g0.i3(new s60(launchActivity, 10), 30000L);
                return;
        }
    }
}
