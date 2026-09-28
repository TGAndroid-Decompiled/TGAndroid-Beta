package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_update;
public final class yi implements Runnable {
    public final int f18243a;
    public final SendMessagesHelper f18244b;
    public final TL_update.TL_updateNewChannelMessage f18245c;

    public yi(SendMessagesHelper sendMessagesHelper, TL_update.TL_updateNewChannelMessage tL_updateNewChannelMessage, int i10) {
        this.f18243a = i10;
        this.f18244b = sendMessagesHelper;
        this.f18245c = tL_updateNewChannelMessage;
    }

    @Override
    public final void run() {
        switch (this.f18243a) {
            case 0:
                this.f18244b.lambda$performSendMessageRequest$92(this.f18245c);
                return;
            default:
                this.f18244b.lambda$performSendMessageRequestMulti$67(this.f18245c);
                return;
        }
    }
}
