package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_update;
public final class zi implements Runnable {
    public final int f20021a;
    public final SendMessagesHelper f20022b;
    public final TL_update.TL_updateNewChannelMessage f20023c;
    public final long d;

    public zi(SendMessagesHelper sendMessagesHelper, TL_update.TL_updateNewChannelMessage tL_updateNewChannelMessage, long j3, int i10) {
        this.f20021a = i10;
        this.f20022b = sendMessagesHelper;
        this.f20023c = tL_updateNewChannelMessage;
        this.d = j3;
    }

    @Override
    public final void run() {
        switch (this.f20021a) {
            case 0:
                this.f20022b.lambda$performSendMessageRequest$93(this.f20023c, this.d);
                return;
            default:
                this.f20022b.lambda$performSendMessageRequestMulti$68(this.f20023c, this.d);
                return;
        }
    }
}
