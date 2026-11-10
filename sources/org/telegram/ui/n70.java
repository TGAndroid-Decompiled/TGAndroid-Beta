package org.telegram.ui;

import android.content.DialogInterface;
public final class n70 implements DialogInterface.OnDismissListener {
    public final int f48153a;
    public final LaunchActivity f48154b;

    public n70(LaunchActivity launchActivity, int i7) {
        this.f48153a = i7;
        this.f48154b = launchActivity;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        int i7 = this.f48153a;
        LaunchActivity launchActivity = this.f48154b;
        switch (i7) {
            case 0:
                launchActivity.f41292v1 = false;
                return;
            case 1:
                String str = LaunchActivity.B1;
                org.telegram.messenger.g0.i3(new v60(launchActivity, 7), 30000L);
                return;
            default:
                String str2 = LaunchActivity.B1;
                org.telegram.messenger.g0.i3(new v60(launchActivity, 10), 30000L);
                return;
        }
    }
}
