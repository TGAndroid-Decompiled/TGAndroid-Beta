package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_update;
public final class yi implements Runnable {
    public final int f18260a;
    public final SendMessagesHelper f18261b;
    public final TL_update.TL_updateNewChannelMessage f18262c;

    public yi(SendMessagesHelper sendMessagesHelper, TL_update.TL_updateNewChannelMessage tL_updateNewChannelMessage, int i10) {
        this.f18260a = i10;
        this.f18261b = sendMessagesHelper;
        this.f18262c = tL_updateNewChannelMessage;
    }

    @Override
    public final void run() {
        switch (this.f18260a) {
            case 0:
                this.f18261b.lambda$performSendMessageRequest$92(this.f18262c);
                return;
            default:
                this.f18261b.lambda$performSendMessageRequestMulti$67(this.f18262c);
                return;
        }
    }
}
