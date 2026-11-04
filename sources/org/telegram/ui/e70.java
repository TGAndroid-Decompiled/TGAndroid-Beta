package org.telegram.ui;

import android.content.DialogInterface;
public final class e70 implements DialogInterface.OnDismissListener {
    public final int f44914a;
    public final LaunchActivity f44915b;

    public e70(LaunchActivity launchActivity, int i3) {
        this.f44914a = i3;
        this.f44915b = launchActivity;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        int i3 = this.f44914a;
        LaunchActivity launchActivity = this.f44915b;
        switch (i3) {
            case 0:
                launchActivity.f41329y1 = false;
                return;
            case 1:
                String str = LaunchActivity.E1;
                org.telegram.messenger.g0.i3(new m60(launchActivity, 7), 30000L);
                return;
            default:
                String str2 = LaunchActivity.E1;
                org.telegram.messenger.g0.i3(new m60(launchActivity, 10), 30000L);
                return;
        }
    }
}
