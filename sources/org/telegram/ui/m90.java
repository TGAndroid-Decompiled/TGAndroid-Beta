package org.telegram.ui;

import android.content.DialogInterface;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
public final class m90 implements DialogInterface.OnDismissListener {
    public final int f38194a;
    public final LaunchActivity f38195b;

    public m90(LaunchActivity launchActivity, int i10) {
        this.f38194a = i10;
        this.f38195b = launchActivity;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        int i10 = this.f38194a;
        LaunchActivity launchActivity = this.f38195b;
        switch (i10) {
            case 0:
                launchActivity.f32144v1 = false;
                return;
            case 1:
                Pattern pattern = LaunchActivity.B1;
                AndroidUtilities.runOnUIThread(new k90(launchActivity, 9), 30000L);
                return;
            default:
                Pattern pattern2 = LaunchActivity.B1;
                AndroidUtilities.runOnUIThread(new k90(launchActivity, 10), 30000L);
                return;
        }
    }
}
