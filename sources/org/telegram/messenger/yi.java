package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_update;
public final class yi implements Runnable {
    public final int f19941a;
    public final SendMessagesHelper f19942b;
    public final TL_update.TL_updateNewMessage f19943c;

    public yi(SendMessagesHelper sendMessagesHelper, TL_update.TL_updateNewMessage tL_updateNewMessage, int i10) {
        this.f19941a = i10;
        this.f19942b = sendMessagesHelper;
        this.f19943c = tL_updateNewMessage;
    }

    @Override
    public final void run() {
        switch (this.f19941a) {
            case 0:
                this.f19942b.lambda$performSendMessageRequest$91(this.f19943c);
                return;
            default:
                this.f19942b.lambda$performSendMessageRequestMulti$66(this.f19943c);
                return;
        }
    }
}
