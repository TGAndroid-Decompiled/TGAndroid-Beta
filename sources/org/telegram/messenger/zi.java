package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_update;
public final class zi implements Runnable {
    public final int f18322a;
    public final SendMessagesHelper f18323b;
    public final TL_update.TL_updateNewChannelMessage f18324c;
    public final long d;

    public zi(SendMessagesHelper sendMessagesHelper, TL_update.TL_updateNewChannelMessage tL_updateNewChannelMessage, long j3, int i10) {
        this.f18322a = i10;
        this.f18323b = sendMessagesHelper;
        this.f18324c = tL_updateNewChannelMessage;
        this.d = j3;
    }

    @Override
    public final void run() {
        switch (this.f18322a) {
            case 0:
                this.f18323b.lambda$performSendMessageRequest$93(this.f18324c, this.d);
                return;
            default:
                this.f18323b.lambda$performSendMessageRequestMulti$68(this.f18324c, this.d);
                return;
        }
    }
}
