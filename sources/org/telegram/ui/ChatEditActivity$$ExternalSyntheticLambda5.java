package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
import org.telegram.ui.ActionBar.AlertDialog;

public final class ChatEditActivity$$ExternalSyntheticLambda5 implements MessagesStorage.LongCallback, AlertDialog.OnButtonClickListener, MessagesStorage.BooleanCallback {
    public final int $r8$classId;
    public final ChatEditActivity f$0;

    public ChatEditActivity$$ExternalSyntheticLambda5(ChatEditActivity chatEditActivity, int i) {
        this.$r8$classId = i;
        this.f$0 = chatEditActivity;
    }

    @Override
    public void onClick(AlertDialog alertDialog, int i) {
        switch (this.$r8$classId) {
            case 2:
                this.f$0.lambda$checkDiscard$60(alertDialog, i);
                break;
            case 3:
                this.f$0.lambda$checkDiscard$61(alertDialog, i);
                break;
            case 4:
                this.f$0.lambda$checkDiscard$62(alertDialog, i);
                break;
            default:
                this.f$0.lambda$checkDiscard$63(alertDialog, i);
                break;
        }
    }

    @Override
    public void run(long j) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$createView$10(j);
                break;
            default:
                this.f$0.lambda$processDone$67(j);
                break;
        }
    }

    @Override
    public void run(boolean z) {
        this.f$0.lambda$createView$51(z);
    }
}
