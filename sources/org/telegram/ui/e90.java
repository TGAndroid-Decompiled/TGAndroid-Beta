package org.telegram.ui;

import android.content.DialogInterface;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
public final class e90 implements DialogInterface.OnDismissListener {
    public final int f32850a;
    public final LaunchActivity f32851b;

    public e90(LaunchActivity launchActivity, int i10) {
        this.f32850a = i10;
        this.f32851b = launchActivity;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        int i10 = this.f32850a;
        LaunchActivity launchActivity = this.f32851b;
        switch (i10) {
            case 0:
                launchActivity.f30826v1 = false;
                return;
            case 1:
                Pattern pattern = LaunchActivity.B1;
                AndroidUtilities.runOnUIThread(new c90(launchActivity, 9), 30000L);
                return;
            default:
                Pattern pattern2 = LaunchActivity.B1;
                AndroidUtilities.runOnUIThread(new c90(launchActivity, 10), 30000L);
                return;
        }
    }
}
