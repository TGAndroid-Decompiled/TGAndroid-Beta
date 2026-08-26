package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.ui.ActionBar.BaseFragment;

public final class GroupCallActivity$$ExternalSyntheticLambda32 implements DialogInterface.OnDismissListener {
    public final int $r8$classId;
    public final GroupCallActivity f$0;

    public GroupCallActivity$$ExternalSyntheticLambda32(GroupCallActivity groupCallActivity, int i) {
        this.$r8$classId = i;
        this.f$0 = groupCallActivity;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.$r8$classId) {
            case 0:
                GroupCallActivity groupCallActivity = this.f$0;
                groupCallActivity.getClass();
                BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
                if (groupCallActivity.anyEnterEventSent && (safeLastFragment instanceof ChatActivity)) {
                    ((ChatActivity) safeLastFragment).onEditTextDialogClose(true, true);
                    break;
                }
                break;
            case 1:
                this.f$0.lambda$didReceivedNotification$2(dialogInterface);
                break;
            case 2:
                this.f$0.groupVoipInviteAlert = null;
                break;
            default:
                this.f$0.shareAlert = null;
                break;
        }
    }
}
