package org.telegram.ui;

import android.content.DialogInterface;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
public final class h90 implements DialogInterface.OnDismissListener {
    public final int f34204a;
    public final LaunchActivity f34205b;

    public h90(LaunchActivity launchActivity, int i10) {
        this.f34204a = i10;
        this.f34205b = launchActivity;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        int i10 = this.f34204a;
        LaunchActivity launchActivity = this.f34205b;
        switch (i10) {
            case 0:
                launchActivity.f30852v1 = false;
                return;
            case 1:
                Pattern pattern = LaunchActivity.B1;
                AndroidUtilities.runOnUIThread(new f90(launchActivity, 9), 30000L);
                return;
            default:
                Pattern pattern2 = LaunchActivity.B1;
                AndroidUtilities.runOnUIThread(new f90(launchActivity, 10), 30000L);
                return;
        }
    }
}
