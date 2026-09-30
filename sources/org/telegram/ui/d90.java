package org.telegram.ui;

import android.content.DialogInterface;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
public final class d90 implements DialogInterface.OnDismissListener {
    public final int f33139a;
    public final LaunchActivity f33140b;

    public d90(LaunchActivity launchActivity, int i10) {
        this.f33139a = i10;
        this.f33140b = launchActivity;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        int i10 = this.f33139a;
        LaunchActivity launchActivity = this.f33140b;
        switch (i10) {
            case 0:
                launchActivity.f31215v1 = false;
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
