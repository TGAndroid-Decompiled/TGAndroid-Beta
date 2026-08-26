package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

public final class DialogsActivity$$ExternalSyntheticLambda120 implements Runnable {
    public final int $r8$classId;
    public final DialogsActivity f$0;
    public final TLRPC.TL_attachMenuBot f$1;
    public final LaunchActivity f$2;

    public DialogsActivity$$ExternalSyntheticLambda120(DialogsActivity dialogsActivity, TLRPC.TL_attachMenuBot tL_attachMenuBot, LaunchActivity launchActivity, int i) {
        this.$r8$classId = i;
        this.f$0 = dialogsActivity;
        this.f$1 = tL_attachMenuBot;
        this.f$2 = launchActivity;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$showItemOptions$171(this.f$1, this.f$2);
                break;
            default:
                this.f$0.lambda$showItemOptions$168(this.f$1, this.f$2);
                break;
        }
    }
}
