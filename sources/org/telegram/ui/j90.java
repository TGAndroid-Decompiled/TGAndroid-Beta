package org.telegram.ui;

import android.content.DialogInterface;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
public final class j90 implements DialogInterface.OnDismissListener {
    public final int f34827a;
    public final LaunchActivity f34828b;

    public j90(LaunchActivity launchActivity, int i10) {
        this.f34827a = i10;
        this.f34828b = launchActivity;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        int i10 = this.f34827a;
        LaunchActivity launchActivity = this.f34828b;
        switch (i10) {
            case 0:
                launchActivity.f30872v1 = false;
                return;
            case 1:
                Pattern pattern = LaunchActivity.B1;
                AndroidUtilities.runOnUIThread(new h90(launchActivity, 9), 30000L);
                return;
            default:
                Pattern pattern2 = LaunchActivity.B1;
                AndroidUtilities.runOnUIThread(new h90(launchActivity, 10), 30000L);
                return;
        }
    }
}
