package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_update;
public final class zi implements Runnable {
    public final int f18314a;
    public final SendMessagesHelper f18315b;
    public final TL_update.TL_updateNewChannelMessage f18316c;
    public final long d;

    public zi(SendMessagesHelper sendMessagesHelper, TL_update.TL_updateNewChannelMessage tL_updateNewChannelMessage, long j3, int i10) {
        this.f18314a = i10;
        this.f18315b = sendMessagesHelper;
        this.f18316c = tL_updateNewChannelMessage;
        this.d = j3;
    }

    @Override
    public final void run() {
        switch (this.f18314a) {
            case 0:
                this.f18315b.lambda$performSendMessageRequest$93(this.f18316c, this.d);
                return;
            default:
                this.f18315b.lambda$performSendMessageRequestMulti$68(this.f18316c, this.d);
                return;
        }
    }
}
