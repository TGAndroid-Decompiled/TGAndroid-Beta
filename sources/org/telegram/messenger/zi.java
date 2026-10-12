package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_update;
public final class zi implements Runnable {
    public final int f19780a;
    public final SendMessagesHelper f19781b;
    public final TL_update.TL_updateNewMessage f19782c;

    public zi(SendMessagesHelper sendMessagesHelper, TL_update.TL_updateNewMessage tL_updateNewMessage, int i10) {
        this.f19780a = i10;
        this.f19781b = sendMessagesHelper;
        this.f19782c = tL_updateNewMessage;
    }

    @Override
    public final void run() {
        switch (this.f19780a) {
            case 0:
                this.f19781b.lambda$performSendMessageRequest$94(this.f19782c);
                return;
            case 1:
                this.f19781b.lambda$performSendMessageRequestMulti$69(this.f19782c);
                return;
            default:
                this.f19781b.lambda$completeSendingGramTransfer$5(this.f19782c);
                return;
        }
    }
}
