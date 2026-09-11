package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_update;
public final class yi implements Runnable {
    public final int f19765a;
    public final SendMessagesHelper f19766b;
    public final TL_update.TL_updateNewChannelMessage f19767c;

    public yi(SendMessagesHelper sendMessagesHelper, TL_update.TL_updateNewChannelMessage tL_updateNewChannelMessage, int i10) {
        this.f19765a = i10;
        this.f19766b = sendMessagesHelper;
        this.f19767c = tL_updateNewChannelMessage;
    }

    @Override
    public final void run() {
        switch (this.f19765a) {
            case 0:
                this.f19766b.lambda$performSendMessageRequest$92(this.f19767c);
                return;
            default:
                this.f19766b.lambda$performSendMessageRequestMulti$67(this.f19767c);
                return;
        }
    }
}
