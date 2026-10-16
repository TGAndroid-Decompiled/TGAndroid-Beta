package org.telegram.ui;

import android.content.DialogInterface;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
public final class m90 implements DialogInterface.OnDismissListener {
    public final int f37940a;
    public final LaunchActivity f37941b;

    public m90(LaunchActivity launchActivity, int i10) {
        this.f37940a = i10;
        this.f37941b = launchActivity;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        int i10 = this.f37940a;
        LaunchActivity launchActivity = this.f37941b;
        switch (i10) {
            case 0:
                launchActivity.f31846v1 = false;
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
