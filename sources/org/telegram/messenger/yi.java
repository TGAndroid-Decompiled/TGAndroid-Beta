package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_update;
public final class yi implements Runnable {
    public final int f18245a;
    public final SendMessagesHelper f18246b;
    public final TL_update.TL_updateNewChannelMessage f18247c;

    public yi(SendMessagesHelper sendMessagesHelper, TL_update.TL_updateNewChannelMessage tL_updateNewChannelMessage, int i10) {
        this.f18245a = i10;
        this.f18246b = sendMessagesHelper;
        this.f18247c = tL_updateNewChannelMessage;
    }

    @Override
    public final void run() {
        switch (this.f18245a) {
            case 0:
                this.f18246b.lambda$performSendMessageRequest$92(this.f18247c);
                return;
            default:
                this.f18246b.lambda$performSendMessageRequestMulti$67(this.f18247c);
                return;
        }
    }
}
