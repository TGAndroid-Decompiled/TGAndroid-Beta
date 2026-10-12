package org.telegram.ui;

import android.content.DialogInterface;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
public final class j90 implements DialogInterface.OnDismissListener {
    public final int f39159a;
    public final LaunchActivity f39160b;

    public j90(LaunchActivity launchActivity, int i10) {
        this.f39159a = i10;
        this.f39160b = launchActivity;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        int i10 = this.f39159a;
        LaunchActivity launchActivity = this.f39160b;
        switch (i10) {
            case 0:
                launchActivity.f33655v1 = false;
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
