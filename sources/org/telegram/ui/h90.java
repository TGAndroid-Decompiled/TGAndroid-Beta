package org.telegram.ui;

import android.content.DialogInterface;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
public final class h90 implements DialogInterface.OnDismissListener {
    public final int f38232a;
    public final LaunchActivity f38233b;

    public h90(LaunchActivity launchActivity, int i10) {
        this.f38232a = i10;
        this.f38233b = launchActivity;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        int i10 = this.f38232a;
        LaunchActivity launchActivity = this.f38233b;
        switch (i10) {
            case 0:
                launchActivity.f33818v1 = false;
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
