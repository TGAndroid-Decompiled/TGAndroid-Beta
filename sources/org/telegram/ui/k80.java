package org.telegram.ui;

import android.content.DialogInterface;
import java.util.regex.Pattern;
public final class k80 implements DialogInterface.OnDismissListener {
    public final int f38721a;
    public final LaunchActivity f38722b;

    public k80(LaunchActivity launchActivity, int i10) {
        this.f38721a = i10;
        this.f38722b = launchActivity;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        int i10 = this.f38721a;
        LaunchActivity launchActivity = this.f38722b;
        switch (i10) {
            case 0:
                launchActivity.f33392x1 = false;
                return;
            case 1:
                Pattern pattern = LaunchActivity.D1;
                org.telegram.messenger.i0.h3(new q70(launchActivity, 7), 30000L);
                return;
            default:
                Pattern pattern2 = LaunchActivity.D1;
                org.telegram.messenger.i0.h3(new q70(launchActivity, 10), 30000L);
                return;
        }
    }
}
