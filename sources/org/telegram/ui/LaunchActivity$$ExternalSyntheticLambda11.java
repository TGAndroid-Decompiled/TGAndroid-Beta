package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.messenger.AndroidUtilities;

public final class LaunchActivity$$ExternalSyntheticLambda11 implements DialogInterface.OnDismissListener {
    public final int $r8$classId;
    public final LaunchActivity f$0;

    public LaunchActivity$$ExternalSyntheticLambda11(LaunchActivity launchActivity, int i) {
        this.$r8$classId = i;
        this.f$0 = launchActivity;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.$r8$classId) {
            case 0:
                AndroidUtilities.runOnUIThread(new LaunchActivity$$ExternalSyntheticLambda20(this.f$0, 8), 30000L);
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new LaunchActivity$$ExternalSyntheticLambda20(this.f$0, 9), 30000L);
                break;
            default:
                this.f$0.checkFreeDiscSpaceShown = false;
                break;
        }
    }
}
