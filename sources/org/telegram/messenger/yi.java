package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_update;
public final class yi implements Runnable {
    public final int f18236a;
    public final SendMessagesHelper f18237b;
    public final TL_update.TL_updateNewChannelMessage f18238c;

    public yi(SendMessagesHelper sendMessagesHelper, TL_update.TL_updateNewChannelMessage tL_updateNewChannelMessage, int i10) {
        this.f18236a = i10;
        this.f18237b = sendMessagesHelper;
        this.f18238c = tL_updateNewChannelMessage;
    }

    @Override
    public final void run() {
        switch (this.f18236a) {
            case 0:
                this.f18237b.lambda$performSendMessageRequest$92(this.f18238c);
                return;
            default:
                this.f18237b.lambda$performSendMessageRequestMulti$67(this.f18238c);
                return;
        }
    }
}
