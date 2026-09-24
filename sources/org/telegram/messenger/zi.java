package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_update;
public final class zi implements Runnable {
    public final int f18306a;
    public final SendMessagesHelper f18307b;
    public final TL_update.TL_updateNewChannelMessage f18308c;
    public final long d;

    public zi(SendMessagesHelper sendMessagesHelper, TL_update.TL_updateNewChannelMessage tL_updateNewChannelMessage, long j3, int i10) {
        this.f18306a = i10;
        this.f18307b = sendMessagesHelper;
        this.f18308c = tL_updateNewChannelMessage;
        this.d = j3;
    }

    @Override
    public final void run() {
        switch (this.f18306a) {
            case 0:
                this.f18307b.lambda$performSendMessageRequest$93(this.f18308c, this.d);
                return;
            default:
                this.f18307b.lambda$performSendMessageRequestMulti$68(this.f18308c, this.d);
                return;
        }
    }
}
