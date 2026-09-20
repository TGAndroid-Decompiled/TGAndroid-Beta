package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_update;
public final class zi implements Runnable {
    public final int f18318a;
    public final SendMessagesHelper f18319b;
    public final TL_update.TL_updateNewChannelMessage f18320c;

    public zi(SendMessagesHelper sendMessagesHelper, TL_update.TL_updateNewChannelMessage tL_updateNewChannelMessage, int i10) {
        this.f18318a = i10;
        this.f18319b = sendMessagesHelper;
        this.f18320c = tL_updateNewChannelMessage;
    }

    @Override
    public final void run() {
        switch (this.f18318a) {
            case 0:
                this.f18319b.lambda$performSendMessageRequest$92(this.f18320c);
                return;
            default:
                this.f18319b.lambda$performSendMessageRequestMulti$67(this.f18320c);
                return;
        }
    }
}
