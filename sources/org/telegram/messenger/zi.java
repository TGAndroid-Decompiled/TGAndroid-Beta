package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_update;
public final class zi implements Runnable {
    public final int f19779a;
    public final SendMessagesHelper f19780b;
    public final TL_update.TL_updateNewMessage f19781c;

    public zi(SendMessagesHelper sendMessagesHelper, TL_update.TL_updateNewMessage tL_updateNewMessage, int i10) {
        this.f19779a = i10;
        this.f19780b = sendMessagesHelper;
        this.f19781c = tL_updateNewMessage;
    }

    @Override
    public final void run() {
        switch (this.f19779a) {
            case 0:
                this.f19780b.lambda$performSendMessageRequest$94(this.f19781c);
                return;
            case 1:
                this.f19780b.lambda$performSendMessageRequestMulti$69(this.f19781c);
                return;
            default:
                this.f19780b.lambda$completeSendingGramTransfer$5(this.f19781c);
                return;
        }
    }
}
