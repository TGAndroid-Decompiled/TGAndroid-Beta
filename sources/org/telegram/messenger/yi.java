package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_update;
public final class yi implements Runnable {
    public final int f19935a;
    public final SendMessagesHelper f19936b;
    public final TL_update.TL_updateNewChannelMessage f19937c;

    public yi(SendMessagesHelper sendMessagesHelper, TL_update.TL_updateNewChannelMessage tL_updateNewChannelMessage, int i10) {
        this.f19935a = i10;
        this.f19936b = sendMessagesHelper;
        this.f19937c = tL_updateNewChannelMessage;
    }

    @Override
    public final void run() {
        switch (this.f19935a) {
            case 0:
                this.f19936b.lambda$performSendMessageRequest$92(this.f19937c);
                return;
            default:
                this.f19936b.lambda$performSendMessageRequestMulti$67(this.f19937c);
                return;
        }
    }
}
