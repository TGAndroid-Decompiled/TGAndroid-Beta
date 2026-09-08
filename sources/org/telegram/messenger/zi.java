package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_update;
public final class zi implements Runnable {
    public final int f19875a;
    public final SendMessagesHelper f19876b;
    public final TL_update.TL_updateNewChannelMessage f19877c;

    public zi(SendMessagesHelper sendMessagesHelper, TL_update.TL_updateNewChannelMessage tL_updateNewChannelMessage, int i10) {
        this.f19875a = i10;
        this.f19876b = sendMessagesHelper;
        this.f19877c = tL_updateNewChannelMessage;
    }

    @Override
    public final void run() {
        switch (this.f19875a) {
            case 0:
                this.f19876b.lambda$performSendMessageRequest$92(this.f19877c);
                return;
            default:
                this.f19876b.lambda$performSendMessageRequestMulti$67(this.f19877c);
                return;
        }
    }
}
