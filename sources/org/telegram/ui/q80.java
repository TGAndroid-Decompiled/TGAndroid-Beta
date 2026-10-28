package org.telegram.ui;

import android.content.DialogInterface;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
public final class q80 implements DialogInterface.OnDismissListener {
    public final int f42633a;
    public final LaunchActivity f42634b;

    public q80(LaunchActivity launchActivity, int i10) {
        this.f42633a = i10;
        this.f42634b = launchActivity;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        int i10 = this.f42633a;
        LaunchActivity launchActivity = this.f42634b;
        switch (i10) {
            case 0:
                launchActivity.f35592x1 = false;
                return;
            case 1:
                Pattern pattern = LaunchActivity.D1;
                AndroidUtilities.runOnUIThread(new p80(launchActivity, 6), 30000L);
                return;
            default:
                Pattern pattern2 = LaunchActivity.D1;
                AndroidUtilities.runOnUIThread(new p80(launchActivity, 9), 30000L);
                return;
        }
    }
}
