package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class zi implements Runnable {
    public final int f17174a;
    public final SendMessagesHelper f17175b;
    public final TLRPC.TL_error f17176c;
    public final org.telegram.ui.ActionBar.p2 d;
    public final TLRPC.TL_messages_editMessage e;

    public zi(SendMessagesHelper sendMessagesHelper, TLRPC.TL_error tL_error, org.telegram.ui.ActionBar.p2 p2Var, TLRPC.TL_messages_editMessage tL_messages_editMessage, int i10) {
        this.f17174a = i10;
        this.f17175b = sendMessagesHelper;
        this.f17176c = tL_error;
        this.d = p2Var;
        this.e = tL_messages_editMessage;
    }

    @Override
    public final void run() {
        switch (this.f17174a) {
            case 0:
                this.f17175b.lambda$sendEditRichMessageRequest$25(this.f17176c, this.d, this.e);
                return;
            default:
                this.f17175b.lambda$editMessage$20(this.f17176c, this.d, this.e);
                return;
        }
    }
}
