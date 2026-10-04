package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_update;
public final class yi implements Runnable {
    public final int f19936a;
    public final SendMessagesHelper f19937b;
    public final TL_update.TL_updateNewMessage f19938c;

    public yi(SendMessagesHelper sendMessagesHelper, TL_update.TL_updateNewMessage tL_updateNewMessage, int i10) {
        this.f19936a = i10;
        this.f19937b = sendMessagesHelper;
        this.f19938c = tL_updateNewMessage;
    }

    @Override
    public final void run() {
        switch (this.f19936a) {
            case 0:
                this.f19937b.lambda$performSendMessageRequest$91(this.f19938c);
                return;
            default:
                this.f19937b.lambda$performSendMessageRequestMulti$66(this.f19938c);
                return;
        }
    }
}
