package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_update;
public final class zi implements Runnable {
    public final int f18321a;
    public final SendMessagesHelper f18322b;
    public final TL_update.TL_updateNewChannelMessage f18323c;
    public final long d;

    public zi(SendMessagesHelper sendMessagesHelper, TL_update.TL_updateNewChannelMessage tL_updateNewChannelMessage, long j3, int i10) {
        this.f18321a = i10;
        this.f18322b = sendMessagesHelper;
        this.f18323c = tL_updateNewChannelMessage;
        this.d = j3;
    }

    @Override
    public final void run() {
        switch (this.f18321a) {
            case 0:
                this.f18322b.lambda$performSendMessageRequest$93(this.f18323c, this.d);
                return;
            default:
                this.f18322b.lambda$performSendMessageRequestMulti$68(this.f18323c, this.d);
                return;
        }
    }
}
