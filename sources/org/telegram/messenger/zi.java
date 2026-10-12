package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_update;
public final class zi implements Runnable {
    public final int f19195a;
    public final SendMessagesHelper f19196b;
    public final TL_update.TL_updateNewChannelMessage f19197c;
    public final long d;

    public zi(SendMessagesHelper sendMessagesHelper, TL_update.TL_updateNewChannelMessage tL_updateNewChannelMessage, long j10, int i10) {
        this.f19195a = i10;
        this.f19196b = sendMessagesHelper;
        this.f19197c = tL_updateNewChannelMessage;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f19195a) {
            case 0:
                this.f19196b.lambda$performSendMessageRequest$96(this.f19197c, this.d);
                return;
            default:
                this.f19196b.lambda$performSendMessageRequestMulti$71(this.f19197c, this.d);
                return;
        }
    }
}
