package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_update;
public final class yi implements Runnable {
    public final int f17993a;
    public final SendMessagesHelper f17994b;
    public final TL_update.TL_updateNewMessage f17995c;

    public yi(SendMessagesHelper sendMessagesHelper, TL_update.TL_updateNewMessage tL_updateNewMessage, int i10) {
        this.f17993a = i10;
        this.f17994b = sendMessagesHelper;
        this.f17995c = tL_updateNewMessage;
    }

    @Override
    public final void run() {
        switch (this.f17993a) {
            case 0:
                this.f17994b.lambda$performSendMessageRequest$91(this.f17995c);
                return;
            default:
                this.f17994b.lambda$performSendMessageRequestMulti$66(this.f17995c);
                return;
        }
    }
}
