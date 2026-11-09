package org.telegram.ui;

import android.content.DialogInterface;
public final class m70 implements DialogInterface.OnDismissListener {
    public final int f47785a;
    public final LaunchActivity f47786b;

    public m70(LaunchActivity launchActivity, int i7) {
        this.f47785a = i7;
        this.f47786b = launchActivity;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        int i7 = this.f47785a;
        LaunchActivity launchActivity = this.f47786b;
        switch (i7) {
            case 0:
                launchActivity.f41301v1 = false;
                return;
            case 1:
                String str = LaunchActivity.B1;
                org.telegram.messenger.g0.i3(new u60(launchActivity, 7), 30000L);
                return;
            default:
                String str2 = LaunchActivity.B1;
                org.telegram.messenger.g0.i3(new u60(launchActivity, 10), 30000L);
                return;
        }
    }
}
