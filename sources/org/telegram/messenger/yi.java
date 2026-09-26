package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_update;
public final class yi implements Runnable {
    public final int f18242a;
    public final SendMessagesHelper f18243b;
    public final TL_update.TL_updateNewChannelMessage f18244c;

    public yi(SendMessagesHelper sendMessagesHelper, TL_update.TL_updateNewChannelMessage tL_updateNewChannelMessage, int i10) {
        this.f18242a = i10;
        this.f18243b = sendMessagesHelper;
        this.f18244c = tL_updateNewChannelMessage;
    }

    @Override
    public final void run() {
        switch (this.f18242a) {
            case 0:
                this.f18243b.lambda$performSendMessageRequest$92(this.f18244c);
                return;
            default:
                this.f18243b.lambda$performSendMessageRequestMulti$67(this.f18244c);
                return;
        }
    }
}
