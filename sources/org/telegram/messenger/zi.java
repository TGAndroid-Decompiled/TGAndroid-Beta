package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_update;
public final class zi implements Runnable {
    public final int f20035a;
    public final SendMessagesHelper f20036b;
    public final TL_update.TL_updateNewChannelMessage f20037c;

    public zi(SendMessagesHelper sendMessagesHelper, TL_update.TL_updateNewChannelMessage tL_updateNewChannelMessage, int i10) {
        this.f20035a = i10;
        this.f20036b = sendMessagesHelper;
        this.f20037c = tL_updateNewChannelMessage;
    }

    @Override
    public final void run() {
        switch (this.f20035a) {
            case 0:
                this.f20036b.lambda$performSendMessageRequest$92(this.f20037c);
                return;
            default:
                this.f20036b.lambda$performSendMessageRequestMulti$67(this.f20037c);
                return;
        }
    }
}
