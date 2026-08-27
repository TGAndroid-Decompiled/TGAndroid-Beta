package org.telegram.ui;

import android.content.DialogInterface;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;

public final class q80 implements DialogInterface.OnDismissListener {

    public final int f41538a;

    public final LaunchActivity f41539b;

    public q80(LaunchActivity launchActivity, int i10) {
        this.f41538a = i10;
        this.f41539b = launchActivity;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        int i10 = this.f41538a;
        LaunchActivity launchActivity = this.f41539b;
        switch (i10) {
            case 0:
                launchActivity.f35532r1 = false;
                break;
            case 1:
                Pattern pattern = LaunchActivity.f35496x1;
                AndroidUtilities.runOnUIThread(new p80(launchActivity, 9), 30000L);
                break;
            default:
                Pattern pattern2 = LaunchActivity.f35496x1;
                AndroidUtilities.runOnUIThread(new p80(launchActivity, 10), 30000L);
                break;
        }
    }
}
