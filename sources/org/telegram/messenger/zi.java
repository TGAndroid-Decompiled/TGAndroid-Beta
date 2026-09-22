package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_update;
public final class zi implements Runnable {
    public final int f18089a;
    public final SendMessagesHelper f18090b;
    public final TL_update.TL_updateNewChannelMessage f18091c;

    public zi(SendMessagesHelper sendMessagesHelper, TL_update.TL_updateNewChannelMessage tL_updateNewChannelMessage, int i10) {
        this.f18089a = i10;
        this.f18090b = sendMessagesHelper;
        this.f18091c = tL_updateNewChannelMessage;
    }

    @Override
    public final void run() {
        switch (this.f18089a) {
            case 0:
                this.f18090b.lambda$performSendMessageRequest$92(this.f18091c);
                return;
            default:
                this.f18090b.lambda$performSendMessageRequestMulti$67(this.f18091c);
                return;
        }
    }
}
