package org.telegram.ui;

import android.content.DialogInterface;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
public final class m80 implements DialogInterface.OnDismissListener {
    public final int f39052a;
    public final LaunchActivity f39053b;

    public m80(LaunchActivity launchActivity, int i10) {
        this.f39052a = i10;
        this.f39053b = launchActivity;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        int i10 = this.f39052a;
        LaunchActivity launchActivity = this.f39053b;
        switch (i10) {
            case 0:
                launchActivity.f33193w1 = false;
                return;
            case 1:
                Pattern pattern = LaunchActivity.C1;
                AndroidUtilities.runOnUIThread(new l80(launchActivity, 6), 30000L);
                return;
            default:
                Pattern pattern2 = LaunchActivity.C1;
                AndroidUtilities.runOnUIThread(new l80(launchActivity, 7), 30000L);
                return;
        }
    }
}
