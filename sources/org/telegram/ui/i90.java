package org.telegram.ui;

import android.content.DialogInterface;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
public final class i90 implements DialogInterface.OnDismissListener {
    public final int f34520a;
    public final LaunchActivity f34521b;

    public i90(LaunchActivity launchActivity, int i10) {
        this.f34520a = i10;
        this.f34521b = launchActivity;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        int i10 = this.f34520a;
        LaunchActivity launchActivity = this.f34521b;
        switch (i10) {
            case 0:
                launchActivity.f31160v1 = false;
                return;
            case 1:
                Pattern pattern = LaunchActivity.B1;
                AndroidUtilities.runOnUIThread(new g90(launchActivity, 9), 30000L);
                return;
            default:
                Pattern pattern2 = LaunchActivity.B1;
                AndroidUtilities.runOnUIThread(new g90(launchActivity, 10), 30000L);
                return;
        }
    }
}
