package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_update;
public final class zi implements Runnable {
    public final int f20030a;
    public final SendMessagesHelper f20031b;
    public final TL_update.TL_updateNewChannelMessage f20032c;

    public zi(SendMessagesHelper sendMessagesHelper, TL_update.TL_updateNewChannelMessage tL_updateNewChannelMessage, int i10) {
        this.f20030a = i10;
        this.f20031b = sendMessagesHelper;
        this.f20032c = tL_updateNewChannelMessage;
    }

    @Override
    public final void run() {
        switch (this.f20030a) {
            case 0:
                this.f20031b.lambda$performSendMessageRequest$92(this.f20032c);
                return;
            default:
                this.f20031b.lambda$performSendMessageRequestMulti$67(this.f20032c);
                return;
        }
    }
}
