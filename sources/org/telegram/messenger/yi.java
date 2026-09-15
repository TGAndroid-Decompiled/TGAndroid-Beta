package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_update;
public final class yi implements Runnable {
    public final int f17997a;
    public final SendMessagesHelper f17998b;
    public final TL_update.TL_updateNewMessage f17999c;

    public yi(SendMessagesHelper sendMessagesHelper, TL_update.TL_updateNewMessage tL_updateNewMessage, int i10) {
        this.f17997a = i10;
        this.f17998b = sendMessagesHelper;
        this.f17999c = tL_updateNewMessage;
    }

    @Override
    public final void run() {
        switch (this.f17997a) {
            case 0:
                this.f17998b.lambda$performSendMessageRequest$91(this.f17999c);
                return;
            default:
                this.f17998b.lambda$performSendMessageRequestMulti$66(this.f17999c);
                return;
        }
    }
}
