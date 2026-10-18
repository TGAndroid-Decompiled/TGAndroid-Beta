package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class zi implements Runnable {
    public final int f20259a;
    public final SendMessagesHelper f20260b;
    public final TLRPC.TL_error f20261c;
    public final org.telegram.ui.ActionBar.n2 d;
    public final TLRPC.TL_messages_editMessage e;

    public zi(SendMessagesHelper sendMessagesHelper, TLRPC.TL_error tL_error, org.telegram.ui.ActionBar.n2 n2Var, TLRPC.TL_messages_editMessage tL_messages_editMessage, int i10) {
        this.f20259a = i10;
        this.f20260b = sendMessagesHelper;
        this.f20261c = tL_error;
        this.d = n2Var;
        this.e = tL_messages_editMessage;
    }

    @Override
    public final void run() {
        switch (this.f20259a) {
            case 0:
                this.f20260b.lambda$sendEditRichMessageRequest$28(this.f20261c, this.d, this.e);
                return;
            default:
                this.f20260b.lambda$editMessage$23(this.f20261c, this.d, this.e);
                return;
        }
    }
}
