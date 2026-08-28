package org.telegram.ui;

import android.content.DialogInterface;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
public final class m80 implements DialogInterface.OnDismissListener {
    public final int f40349a;
    public final LaunchActivity f40350b;

    public m80(LaunchActivity launchActivity, int i9) {
        this.f40349a = i9;
        this.f40350b = launchActivity;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        int i9 = this.f40349a;
        LaunchActivity launchActivity = this.f40350b;
        switch (i9) {
            case 0:
                launchActivity.f35529r1 = false;
                return;
            case 1:
                Pattern pattern = LaunchActivity.f35493x1;
                AndroidUtilities.runOnUIThread(new l80(launchActivity, 9), 30000L);
                return;
            default:
                Pattern pattern2 = LaunchActivity.f35493x1;
                AndroidUtilities.runOnUIThread(new l80(launchActivity, 10), 30000L);
                return;
        }
    }
}
