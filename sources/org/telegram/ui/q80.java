package org.telegram.ui;

import android.content.DialogInterface;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
public final class q80 implements DialogInterface.OnDismissListener {
    public final int f40654a;
    public final LaunchActivity f40655b;

    public q80(LaunchActivity launchActivity, int i10) {
        this.f40654a = i10;
        this.f40655b = launchActivity;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        int i10 = this.f40654a;
        LaunchActivity launchActivity = this.f40655b;
        switch (i10) {
            case 0:
                launchActivity.f33504y1 = false;
                return;
            case 1:
                Pattern pattern = LaunchActivity.E1;
                AndroidUtilities.runOnUIThread(new p80(launchActivity, 6), 30000L);
                return;
            default:
                Pattern pattern2 = LaunchActivity.E1;
                AndroidUtilities.runOnUIThread(new p80(launchActivity, 7), 30000L);
                return;
        }
    }
}
