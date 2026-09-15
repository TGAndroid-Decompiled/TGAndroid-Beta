package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_update;
public final class zi implements Runnable {
    public final int f18092a;
    public final SendMessagesHelper f18093b;
    public final TL_update.TL_updateNewChannelMessage f18094c;

    public zi(SendMessagesHelper sendMessagesHelper, TL_update.TL_updateNewChannelMessage tL_updateNewChannelMessage, int i10) {
        this.f18092a = i10;
        this.f18093b = sendMessagesHelper;
        this.f18094c = tL_updateNewChannelMessage;
    }

    @Override
    public final void run() {
        switch (this.f18092a) {
            case 0:
                this.f18093b.lambda$performSendMessageRequest$92(this.f18094c);
                return;
            default:
                this.f18093b.lambda$performSendMessageRequestMulti$67(this.f18094c);
                return;
        }
    }
}
