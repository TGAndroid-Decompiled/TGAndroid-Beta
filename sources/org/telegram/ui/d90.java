package org.telegram.ui;

import android.content.DialogInterface;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
public final class d90 implements DialogInterface.OnDismissListener {
    public final int f33060a;
    public final LaunchActivity f33061b;

    public d90(LaunchActivity launchActivity, int i10) {
        this.f33060a = i10;
        this.f33061b = launchActivity;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        int i10 = this.f33060a;
        LaunchActivity launchActivity = this.f33061b;
        switch (i10) {
            case 0:
                launchActivity.f31140v1 = false;
                return;
            case 1:
                Pattern pattern = LaunchActivity.B1;
                AndroidUtilities.runOnUIThread(new b90(launchActivity, 9), 30000L);
                return;
            default:
                Pattern pattern2 = LaunchActivity.B1;
                AndroidUtilities.runOnUIThread(new b90(launchActivity, 10), 30000L);
                return;
        }
    }
}
