package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_update;
public final class zi implements Runnable {
    public final int f18333a;
    public final SendMessagesHelper f18334b;
    public final TL_update.TL_updateNewChannelMessage f18335c;

    public zi(SendMessagesHelper sendMessagesHelper, TL_update.TL_updateNewChannelMessage tL_updateNewChannelMessage, int i10) {
        this.f18333a = i10;
        this.f18334b = sendMessagesHelper;
        this.f18335c = tL_updateNewChannelMessage;
    }

    @Override
    public final void run() {
        switch (this.f18333a) {
            case 0:
                this.f18334b.lambda$performSendMessageRequest$92(this.f18335c);
                return;
            default:
                this.f18334b.lambda$performSendMessageRequestMulti$67(this.f18335c);
                return;
        }
    }
}
