package org.telegram.ui;

import android.content.DialogInterface;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
public final class g90 implements DialogInterface.OnDismissListener {
    public final int f36534a;
    public final LaunchActivity f36535b;

    public g90(LaunchActivity launchActivity, int i10) {
        this.f36534a = i10;
        this.f36535b = launchActivity;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        int i10 = this.f36534a;
        LaunchActivity launchActivity = this.f36535b;
        switch (i10) {
            case 0:
                launchActivity.f33809v1 = false;
                return;
            case 1:
                Pattern pattern = LaunchActivity.B1;
                AndroidUtilities.runOnUIThread(new e90(launchActivity, 9), 30000L);
                return;
            default:
                Pattern pattern2 = LaunchActivity.B1;
                AndroidUtilities.runOnUIThread(new e90(launchActivity, 10), 30000L);
                return;
        }
    }
}
