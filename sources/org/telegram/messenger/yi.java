package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_update;
public final class yi implements Runnable {
    public final int f19934a;
    public final SendMessagesHelper f19935b;
    public final TL_update.TL_updateNewChannelMessage f19936c;

    public yi(SendMessagesHelper sendMessagesHelper, TL_update.TL_updateNewChannelMessage tL_updateNewChannelMessage, int i10) {
        this.f19934a = i10;
        this.f19935b = sendMessagesHelper;
        this.f19936c = tL_updateNewChannelMessage;
    }

    @Override
    public final void run() {
        switch (this.f19934a) {
            case 0:
                this.f19935b.lambda$performSendMessageRequest$92(this.f19936c);
                return;
            default:
                this.f19935b.lambda$performSendMessageRequestMulti$67(this.f19936c);
                return;
        }
    }
}
