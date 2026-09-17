package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_update;
public final class zi implements Runnable {
    public final int f19884a;
    public final SendMessagesHelper f19885b;
    public final TL_update.TL_updateNewChannelMessage f19886c;
    public final long d;

    public zi(SendMessagesHelper sendMessagesHelper, TL_update.TL_updateNewChannelMessage tL_updateNewChannelMessage, long j3, int i10) {
        this.f19884a = i10;
        this.f19885b = sendMessagesHelper;
        this.f19886c = tL_updateNewChannelMessage;
        this.d = j3;
    }

    @Override
    public final void run() {
        switch (this.f19884a) {
            case 0:
                this.f19885b.lambda$performSendMessageRequest$93(this.f19886c, this.d);
                return;
            default:
                this.f19885b.lambda$performSendMessageRequestMulti$68(this.f19886c, this.d);
                return;
        }
    }
}
