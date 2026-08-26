package org.telegram.ui;

import org.telegram.ui.ActionBar.AlertDialog;

public final class ChatLinkActivity$$ExternalSyntheticLambda7 implements Runnable {
    public final int $r8$classId;
    public final ChatLinkActivity f$0;
    public final AlertDialog[] f$1;
    public final int f$2;

    public ChatLinkActivity$$ExternalSyntheticLambda7(ChatLinkActivity chatLinkActivity, AlertDialog[] alertDialogArr, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = chatLinkActivity;
        this.f$1 = alertDialogArr;
        this.f$2 = i;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$linkChat$15(this.f$1, this.f$2);
                break;
            default:
                this.f$0.lambda$createView$4(this.f$1, this.f$2);
                break;
        }
    }
}
