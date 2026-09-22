package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_update;
public final class yi implements Runnable {
    public final int f18237a;
    public final SendMessagesHelper f18238b;
    public final TL_update.TL_updateNewMessage f18239c;

    public yi(SendMessagesHelper sendMessagesHelper, TL_update.TL_updateNewMessage tL_updateNewMessage, int i10) {
        this.f18237a = i10;
        this.f18238b = sendMessagesHelper;
        this.f18239c = tL_updateNewMessage;
    }

    @Override
    public final void run() {
        switch (this.f18237a) {
            case 0:
                this.f18238b.lambda$performSendMessageRequest$91(this.f18239c);
                return;
            default:
                this.f18238b.lambda$performSendMessageRequestMulti$66(this.f18239c);
                return;
        }
    }
}
