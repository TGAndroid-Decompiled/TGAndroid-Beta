package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_update;
public final class yi implements Runnable {
    public final int f19741a;
    public final SendMessagesHelper f19742b;
    public final TL_update.TL_updateNewMessage f19743c;

    public yi(SendMessagesHelper sendMessagesHelper, TL_update.TL_updateNewMessage tL_updateNewMessage, int i10) {
        this.f19741a = i10;
        this.f19742b = sendMessagesHelper;
        this.f19743c = tL_updateNewMessage;
    }

    @Override
    public final void run() {
        switch (this.f19741a) {
            case 0:
                this.f19742b.lambda$performSendMessageRequest$91(this.f19743c);
                return;
            default:
                this.f19742b.lambda$performSendMessageRequestMulti$66(this.f19743c);
                return;
        }
    }
}
