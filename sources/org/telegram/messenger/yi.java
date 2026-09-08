package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_update;
public final class yi implements Runnable {
    public final int f19768a;
    public final SendMessagesHelper f19769b;
    public final TL_update.TL_updateNewMessage f19770c;

    public yi(SendMessagesHelper sendMessagesHelper, TL_update.TL_updateNewMessage tL_updateNewMessage, int i10) {
        this.f19768a = i10;
        this.f19769b = sendMessagesHelper;
        this.f19770c = tL_updateNewMessage;
    }

    @Override
    public final void run() {
        switch (this.f19768a) {
            case 0:
                this.f19769b.lambda$performSendMessageRequest$91(this.f19770c);
                return;
            default:
                this.f19769b.lambda$performSendMessageRequestMulti$66(this.f19770c);
                return;
        }
    }
}
