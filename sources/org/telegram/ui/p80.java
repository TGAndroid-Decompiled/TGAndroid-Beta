package org.telegram.ui;

import android.content.DialogInterface;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
public final class p80 implements DialogInterface.OnDismissListener {
    public final int f41319a;
    public final LaunchActivity f41320b;

    public p80(LaunchActivity launchActivity, int i10) {
        this.f41319a = i10;
        this.f41320b = launchActivity;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        int i10 = this.f41319a;
        LaunchActivity launchActivity = this.f41320b;
        switch (i10) {
            case 0:
                launchActivity.f35596r1 = false;
                return;
            case 1:
                Pattern pattern = LaunchActivity.f35560x1;
                AndroidUtilities.runOnUIThread(new o80(launchActivity, 9), 30000L);
                return;
            default:
                Pattern pattern2 = LaunchActivity.f35560x1;
                AndroidUtilities.runOnUIThread(new o80(launchActivity, 10), 30000L);
                return;
        }
    }
}
