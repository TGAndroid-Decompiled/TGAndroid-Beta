package org.telegram.ui;

import android.content.DialogInterface;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
public final class k80 implements DialogInterface.OnDismissListener {
    public final int f38462a;
    public final LaunchActivity f38463b;

    public k80(LaunchActivity launchActivity, int i10) {
        this.f38462a = i10;
        this.f38463b = launchActivity;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        int i10 = this.f38462a;
        LaunchActivity launchActivity = this.f38463b;
        switch (i10) {
            case 0:
                launchActivity.f33199w1 = false;
                return;
            case 1:
                Pattern pattern = LaunchActivity.C1;
                AndroidUtilities.runOnUIThread(new j80(launchActivity, 6), 30000L);
                return;
            default:
                Pattern pattern2 = LaunchActivity.C1;
                AndroidUtilities.runOnUIThread(new j80(launchActivity, 7), 30000L);
                return;
        }
    }
}
