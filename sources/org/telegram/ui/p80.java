package org.telegram.ui;

import android.content.DialogInterface;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
public final class p80 implements DialogInterface.OnDismissListener {
    public final int f42396a;
    public final LaunchActivity f42397b;

    public p80(LaunchActivity launchActivity, int i10) {
        this.f42396a = i10;
        this.f42397b = launchActivity;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        int i10 = this.f42396a;
        LaunchActivity launchActivity = this.f42397b;
        switch (i10) {
            case 0:
                launchActivity.f35568x1 = false;
                return;
            case 1:
                Pattern pattern = LaunchActivity.D1;
                AndroidUtilities.runOnUIThread(new o80(launchActivity, 6), 30000L);
                return;
            default:
                Pattern pattern2 = LaunchActivity.D1;
                AndroidUtilities.runOnUIThread(new o80(launchActivity, 7), 30000L);
                return;
        }
    }
}
