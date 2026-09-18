package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_update;
public final class yi implements Runnable {
    public final int f18006a;
    public final SendMessagesHelper f18007b;
    public final TL_update.TL_updateNewMessage f18008c;

    public yi(SendMessagesHelper sendMessagesHelper, TL_update.TL_updateNewMessage tL_updateNewMessage, int i10) {
        this.f18006a = i10;
        this.f18007b = sendMessagesHelper;
        this.f18008c = tL_updateNewMessage;
    }

    @Override
    public final void run() {
        switch (this.f18006a) {
            case 0:
                this.f18007b.lambda$performSendMessageRequest$91(this.f18008c);
                return;
            default:
                this.f18007b.lambda$performSendMessageRequestMulti$66(this.f18008c);
                return;
        }
    }
}
