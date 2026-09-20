package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_update;
public final class yi implements Runnable {
    public final int f18222a;
    public final SendMessagesHelper f18223b;
    public final TL_update.TL_updateNewMessage f18224c;

    public yi(SendMessagesHelper sendMessagesHelper, TL_update.TL_updateNewMessage tL_updateNewMessage, int i10) {
        this.f18222a = i10;
        this.f18223b = sendMessagesHelper;
        this.f18224c = tL_updateNewMessage;
    }

    @Override
    public final void run() {
        switch (this.f18222a) {
            case 0:
                this.f18223b.lambda$performSendMessageRequest$91(this.f18224c);
                return;
            default:
                this.f18223b.lambda$performSendMessageRequestMulti$66(this.f18224c);
                return;
        }
    }
}
