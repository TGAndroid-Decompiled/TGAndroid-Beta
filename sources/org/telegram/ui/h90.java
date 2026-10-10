package org.telegram.ui;

import android.content.DialogInterface;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
public final class h90 implements DialogInterface.OnDismissListener {
    public final int f38278a;
    public final LaunchActivity f38279b;

    public h90(LaunchActivity launchActivity, int i10) {
        this.f38278a = i10;
        this.f38279b = launchActivity;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        int i10 = this.f38278a;
        LaunchActivity launchActivity = this.f38279b;
        switch (i10) {
            case 0:
                launchActivity.f33856v1 = false;
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
