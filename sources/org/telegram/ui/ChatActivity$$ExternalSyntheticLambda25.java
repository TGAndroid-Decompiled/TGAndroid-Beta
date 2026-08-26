package org.telegram.ui;

import org.telegram.ui.ActionBar.AlertDialog;

public final class ChatActivity$$ExternalSyntheticLambda25 implements Runnable {
    public final int $r8$classId;
    public final ChatActivity f$0;
    public final AlertDialog[] f$1;
    public final int f$2;

    public ChatActivity$$ExternalSyntheticLambda25(ChatActivity chatActivity, AlertDialog[] alertDialogArr, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = chatActivity;
        this.f$1 = alertDialogArr;
        this.f$2 = i;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$processSelectedOption$345(this.f$1, this.f$2);
                break;
            case 1:
                this.f$0.lambda$showRequestUrlAlert$388(this.f$1, this.f$2);
                break;
            case 2:
                this.f$0.lambda$processSelectedOption$338(this.f$1, this.f$2);
                break;
            default:
                this.f$0.lambda$processSelectedOption$335(this.f$1, this.f$2);
                break;
        }
    }
}
