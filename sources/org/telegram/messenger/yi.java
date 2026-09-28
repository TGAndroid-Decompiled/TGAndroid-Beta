package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_update;
public final class yi implements Runnable {
    public final int f18244a;
    public final SendMessagesHelper f18245b;
    public final TL_update.TL_updateNewChannelMessage f18246c;

    public yi(SendMessagesHelper sendMessagesHelper, TL_update.TL_updateNewChannelMessage tL_updateNewChannelMessage, int i10) {
        this.f18244a = i10;
        this.f18245b = sendMessagesHelper;
        this.f18246c = tL_updateNewChannelMessage;
    }

    @Override
    public final void run() {
        switch (this.f18244a) {
            case 0:
                this.f18245b.lambda$performSendMessageRequest$92(this.f18246c);
                return;
            default:
                this.f18245b.lambda$performSendMessageRequestMulti$67(this.f18246c);
                return;
        }
    }
}
