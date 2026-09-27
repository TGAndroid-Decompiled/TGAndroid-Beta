package org.telegram.ui;

import android.content.DialogInterface;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
public final class f90 implements DialogInterface.OnDismissListener {
    public final int f33458a;
    public final LaunchActivity f33459b;

    public f90(LaunchActivity launchActivity, int i10) {
        this.f33458a = i10;
        this.f33459b = launchActivity;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        int i10 = this.f33458a;
        LaunchActivity launchActivity = this.f33459b;
        switch (i10) {
            case 0:
                launchActivity.f31143v1 = false;
                return;
            case 1:
                Pattern pattern = LaunchActivity.B1;
                AndroidUtilities.runOnUIThread(new d90(launchActivity, 9), 30000L);
                return;
            default:
                Pattern pattern2 = LaunchActivity.B1;
                AndroidUtilities.runOnUIThread(new d90(launchActivity, 10), 30000L);
                return;
        }
    }
}
