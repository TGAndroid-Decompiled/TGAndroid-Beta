package org.telegram.ui;

import org.telegram.ui.ActionBar.AlertDialog;

public final class ChatActivity$$ExternalSyntheticLambda29 implements Runnable {
    public final int $r8$classId;
    public final AlertDialog[] f$0;

    public ChatActivity$$ExternalSyntheticLambda29(AlertDialog[] alertDialogArr, int i) {
        this.$r8$classId = i;
        this.f$0 = alertDialogArr;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                ChatActivity.lambda$processSelectedOption$341(this.f$0);
                break;
            case 1:
                ChatActivity.lambda$processSelectedOption$336(this.f$0);
                break;
            case 2:
                ChatRightsEditActivity.lambda$setGuardBotImpl$9(this.f$0);
                break;
            case 3:
                ChatRightsEditActivity.lambda$setGuardBotImpl$11(this.f$0);
                break;
            case 4:
                ChatRightsEditActivity.lambda$setGuardBotImpl$10(this.f$0);
                break;
            default:
                ChatRightsEditActivity.lambda$setGuardBotImpl$12(this.f$0);
                break;
        }
    }
}
