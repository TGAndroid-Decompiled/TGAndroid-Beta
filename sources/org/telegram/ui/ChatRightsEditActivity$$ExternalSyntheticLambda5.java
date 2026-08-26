package org.telegram.ui;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog;

public final class ChatRightsEditActivity$$ExternalSyntheticLambda5 implements AlertDialog.OnButtonClickListener, MessagesStorage.LongCallback, MessagesController.ErrorDelegate {
    public final int $r8$classId;
    public final ChatRightsEditActivity f$0;

    public ChatRightsEditActivity$$ExternalSyntheticLambda5(ChatRightsEditActivity chatRightsEditActivity, int i) {
        this.$r8$classId = i;
        this.f$0 = chatRightsEditActivity;
    }

    @Override
    public void onClick(AlertDialog alertDialog, int i) {
        switch (this.$r8$classId) {
            case 1:
                this.f$0.lambda$initTransfer$15(alertDialog, i);
                break;
            case 2:
                this.f$0.lambda$initTransfer$16(alertDialog, i);
                break;
            case 3:
            case 4:
            case 6:
            default:
                this.f$0.lambda$checkDiscard$31(alertDialog, i);
                break;
            case 5:
                this.f$0.lambda$onDonePressed$28(alertDialog, i);
                break;
            case 7:
                this.f$0.lambda$checkDiscard$30(alertDialog, i);
                break;
        }
    }

    @Override
    public void run(long j) {
        this.f$0.lambda$onDonePressed$21(j);
    }

    @Override
    public boolean run(TLRPC.TL_error tL_error) {
        switch (this.$r8$classId) {
            case 0:
                return this.f$0.lambda$onDonePressed$27(tL_error);
            case 4:
                return this.f$0.lambda$onDonePressed$24(tL_error);
            default:
                return this.f$0.lambda$onDonePressed$26(tL_error);
        }
    }
}
