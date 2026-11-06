package org.telegram.ui;

import android.content.DialogInterface;
public final class k70 implements DialogInterface.OnDismissListener {
    public final int f47135a;
    public final LaunchActivity f47136b;

    public k70(LaunchActivity launchActivity, int i7) {
        this.f47135a = i7;
        this.f47136b = launchActivity;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        int i7 = this.f47135a;
        LaunchActivity launchActivity = this.f47136b;
        switch (i7) {
            case 0:
                launchActivity.f41290v1 = false;
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
