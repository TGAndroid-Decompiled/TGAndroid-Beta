package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_update;
public final class zi implements Runnable {
    public final int f18337a;
    public final SendMessagesHelper f18338b;
    public final TL_update.TL_updateNewChannelMessage f18339c;
    public final long d;

    public zi(SendMessagesHelper sendMessagesHelper, TL_update.TL_updateNewChannelMessage tL_updateNewChannelMessage, long j3, int i10) {
        this.f18337a = i10;
        this.f18338b = sendMessagesHelper;
        this.f18339c = tL_updateNewChannelMessage;
        this.d = j3;
    }

    @Override
    public final void run() {
        switch (this.f18337a) {
            case 0:
                this.f18338b.lambda$performSendMessageRequest$93(this.f18339c, this.d);
                return;
            default:
                this.f18338b.lambda$performSendMessageRequestMulti$68(this.f18339c, this.d);
                return;
        }
    }
}
