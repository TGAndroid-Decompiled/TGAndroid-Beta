package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_update;
public final class zi implements Runnable {
    public final int f18276a;
    public final SendMessagesHelper f18277b;
    public final TL_update.TL_updateNewMessage f18278c;

    public zi(SendMessagesHelper sendMessagesHelper, TL_update.TL_updateNewMessage tL_updateNewMessage, int i10) {
        this.f18276a = i10;
        this.f18277b = sendMessagesHelper;
        this.f18278c = tL_updateNewMessage;
    }

    @Override
    public final void run() {
        switch (this.f18276a) {
            case 0:
                this.f18277b.lambda$performSendMessageRequest$91(this.f18278c);
                return;
            default:
                this.f18277b.lambda$performSendMessageRequestMulti$66(this.f18278c);
                return;
        }
    }
}
