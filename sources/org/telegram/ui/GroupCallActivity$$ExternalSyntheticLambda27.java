package org.telegram.ui;

import android.content.DialogInterface;

public final class GroupCallActivity$$ExternalSyntheticLambda27 implements DialogInterface.OnDismissListener {
    public final int $r8$classId;
    public final GroupCallActivity f$0;

    public GroupCallActivity$$ExternalSyntheticLambda27(GroupCallActivity groupCallActivity, int i) {
        this.$r8$classId = i;
        this.f$0 = groupCallActivity;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$openShareAlert$59(dialogInterface);
                break;
            case 1:
                this.f$0.lambda$new$9(dialogInterface);
                break;
            case 2:
                this.f$0.lambda$new$15(dialogInterface);
                break;
            default:
                this.f$0.lambda$didReceivedNotification$2(dialogInterface);
                break;
        }
    }
}
