package org.telegram.ui;

import android.content.DialogInterface;
import java.util.regex.Pattern;
public final class j80 implements DialogInterface.OnDismissListener {
    public final int f38304a;
    public final LaunchActivity f38305b;

    public j80(LaunchActivity launchActivity, int i10) {
        this.f38304a = i10;
        this.f38305b = launchActivity;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        int i10 = this.f38304a;
        LaunchActivity launchActivity = this.f38305b;
        switch (i10) {
            case 0:
                launchActivity.f33399x1 = false;
                return;
            case 1:
                Pattern pattern = LaunchActivity.D1;
                org.telegram.messenger.i0.h3(new p70(launchActivity, 7), 30000L);
                return;
            default:
                Pattern pattern2 = LaunchActivity.D1;
                org.telegram.messenger.i0.h3(new p70(launchActivity, 10), 30000L);
                return;
        }
    }
}
