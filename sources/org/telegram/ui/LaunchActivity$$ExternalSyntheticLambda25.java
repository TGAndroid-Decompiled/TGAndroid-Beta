package org.telegram.ui;

import android.content.DialogInterface;

public final class LaunchActivity$$ExternalSyntheticLambda25 implements DialogInterface.OnDismissListener {
    public final int $r8$classId;
    public final LaunchActivity f$0;

    public LaunchActivity$$ExternalSyntheticLambda25(LaunchActivity launchActivity, int i) {
        this.$r8$classId = i;
        this.f$0 = launchActivity;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$didReceivedNotification$163(dialogInterface);
                break;
            case 1:
                this.f$0.lambda$checkFreeDiscSpace$167(dialogInterface);
                break;
            default:
                this.f$0.lambda$didReceivedNotification$165(dialogInterface);
                break;
        }
    }
}
