package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.UsersSelectActivity;

public final class InviteMembersBottomSheet$$ExternalSyntheticLambda1 implements Runnable {
    public final int $r8$classId;
    public final UsersSelectActivity.AnonymousClass4 f$0;

    public InviteMembersBottomSheet$$ExternalSyntheticLambda1(UsersSelectActivity.AnonymousClass4 anonymousClass4, int i) {
        this.$r8$classId = i;
        this.f$0 = anonymousClass4;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                AndroidUtilities.showKeyboard(this.f$0);
                break;
            case 1:
                AndroidUtilities.showKeyboard(this.f$0);
                break;
            case 2:
                AndroidUtilities.showKeyboard(this.f$0);
                break;
            default:
                AndroidUtilities.showKeyboard(this.f$0);
                break;
        }
    }
}
