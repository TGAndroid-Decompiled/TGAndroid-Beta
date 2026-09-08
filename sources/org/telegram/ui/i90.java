package org.telegram.ui;

import android.content.DialogInterface;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
public final class i90 implements DialogInterface.OnDismissListener {
    public final int f37289a;
    public final LaunchActivity f37290b;

    public i90(LaunchActivity launchActivity, int i10) {
        this.f37289a = i10;
        this.f37290b = launchActivity;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        int i10 = this.f37289a;
        LaunchActivity launchActivity = this.f37290b;
        switch (i10) {
            case 0:
                launchActivity.f33491v1 = false;
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
