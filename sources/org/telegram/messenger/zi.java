package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_update;
public final class zi implements Runnable {
    public final int f18072a;
    public final SendMessagesHelper f18073b;
    public final TL_update.TL_updateNewChannelMessage f18074c;
    public final long d;

    public zi(SendMessagesHelper sendMessagesHelper, TL_update.TL_updateNewChannelMessage tL_updateNewChannelMessage, long j3, int i10) {
        this.f18072a = i10;
        this.f18073b = sendMessagesHelper;
        this.f18074c = tL_updateNewChannelMessage;
        this.d = j3;
    }

    @Override
    public final void run() {
        switch (this.f18072a) {
            case 0:
                this.f18073b.lambda$performSendMessageRequest$93(this.f18074c, this.d);
                return;
            default:
                this.f18073b.lambda$performSendMessageRequestMulti$68(this.f18074c, this.d);
                return;
        }
    }
}
