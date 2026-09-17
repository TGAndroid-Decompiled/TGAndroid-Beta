package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_update;
public final class yi implements Runnable {
    public final int f19792a;
    public final SendMessagesHelper f19793b;
    public final TL_update.TL_updateNewChannelMessage f19794c;

    public yi(SendMessagesHelper sendMessagesHelper, TL_update.TL_updateNewChannelMessage tL_updateNewChannelMessage, int i10) {
        this.f19792a = i10;
        this.f19793b = sendMessagesHelper;
        this.f19794c = tL_updateNewChannelMessage;
    }

    @Override
    public final void run() {
        switch (this.f19792a) {
            case 0:
                this.f19793b.lambda$performSendMessageRequest$92(this.f19794c);
                return;
            default:
                this.f19793b.lambda$performSendMessageRequestMulti$67(this.f19794c);
                return;
        }
    }
}
