package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_update;
public final class zi implements Runnable {
    public final int f20020a;
    public final SendMessagesHelper f20021b;
    public final TL_update.TL_updateNewChannelMessage f20022c;
    public final long d;

    public zi(SendMessagesHelper sendMessagesHelper, TL_update.TL_updateNewChannelMessage tL_updateNewChannelMessage, long j3, int i10) {
        this.f20020a = i10;
        this.f20021b = sendMessagesHelper;
        this.f20022c = tL_updateNewChannelMessage;
        this.d = j3;
    }

    @Override
    public final void run() {
        switch (this.f20020a) {
            case 0:
                this.f20021b.lambda$performSendMessageRequest$93(this.f20022c, this.d);
                return;
            default:
                this.f20021b.lambda$performSendMessageRequestMulti$68(this.f20022c, this.d);
                return;
        }
    }
}
