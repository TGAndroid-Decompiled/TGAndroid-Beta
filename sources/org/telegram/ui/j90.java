package org.telegram.ui;

import android.content.DialogInterface;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
public final class j90 implements DialogInterface.OnDismissListener {
    public final int f39161a;
    public final LaunchActivity f39162b;

    public j90(LaunchActivity launchActivity, int i10) {
        this.f39161a = i10;
        this.f39162b = launchActivity;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        int i10 = this.f39161a;
        LaunchActivity launchActivity = this.f39162b;
        switch (i10) {
            case 0:
                launchActivity.f33657v1 = false;
                return;
            case 1:
                Pattern pattern = LaunchActivity.B1;
                AndroidUtilities.runOnUIThread(new h90(launchActivity, 9), 30000L);
                return;
            default:
                Pattern pattern2 = LaunchActivity.B1;
                AndroidUtilities.runOnUIThread(new h90(launchActivity, 10), 30000L);
                return;
        }
    }
}
