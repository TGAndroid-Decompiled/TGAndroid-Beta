package org.telegram.ui;

import android.content.DialogInterface;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
public final class i90 implements DialogInterface.OnDismissListener {
    public final int f34500a;
    public final LaunchActivity f34501b;

    public i90(LaunchActivity launchActivity, int i10) {
        this.f34500a = i10;
        this.f34501b = launchActivity;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        int i10 = this.f34500a;
        LaunchActivity launchActivity = this.f34501b;
        switch (i10) {
            case 0:
                launchActivity.f31139v1 = false;
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
