package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_update;
public final class zi implements Runnable {
    public final int f18101a;
    public final SendMessagesHelper f18102b;
    public final TL_update.TL_updateNewChannelMessage f18103c;

    public zi(SendMessagesHelper sendMessagesHelper, TL_update.TL_updateNewChannelMessage tL_updateNewChannelMessage, int i10) {
        this.f18101a = i10;
        this.f18102b = sendMessagesHelper;
        this.f18103c = tL_updateNewChannelMessage;
    }

    @Override
    public final void run() {
        switch (this.f18101a) {
            case 0:
                this.f18102b.lambda$performSendMessageRequest$92(this.f18103c);
                return;
            default:
                this.f18102b.lambda$performSendMessageRequestMulti$67(this.f18103c);
                return;
        }
    }
}
