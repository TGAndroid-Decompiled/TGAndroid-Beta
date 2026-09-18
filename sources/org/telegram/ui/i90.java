package org.telegram.ui;

import android.content.DialogInterface;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
public final class i90 implements DialogInterface.OnDismissListener {
    public final int f34473a;
    public final LaunchActivity f34474b;

    public i90(LaunchActivity launchActivity, int i10) {
        this.f34473a = i10;
        this.f34474b = launchActivity;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        int i10 = this.f34473a;
        LaunchActivity launchActivity = this.f34474b;
        switch (i10) {
            case 0:
                launchActivity.f31099v1 = false;
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
