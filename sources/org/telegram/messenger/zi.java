package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_update;
public final class zi implements Runnable {
    public final int f19857a;
    public final SendMessagesHelper f19858b;
    public final TL_update.TL_updateNewChannelMessage f19859c;
    public final long d;

    public zi(SendMessagesHelper sendMessagesHelper, TL_update.TL_updateNewChannelMessage tL_updateNewChannelMessage, long j3, int i10) {
        this.f19857a = i10;
        this.f19858b = sendMessagesHelper;
        this.f19859c = tL_updateNewChannelMessage;
        this.d = j3;
    }

    @Override
    public final void run() {
        switch (this.f19857a) {
            case 0:
                this.f19858b.lambda$performSendMessageRequest$93(this.f19859c, this.d);
                return;
            default:
                this.f19858b.lambda$performSendMessageRequestMulti$68(this.f19859c, this.d);
                return;
        }
    }
}
