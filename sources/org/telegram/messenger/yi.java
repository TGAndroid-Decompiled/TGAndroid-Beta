package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_update;
public final class yi implements Runnable {
    public final int f18808a;
    public final SendMessagesHelper f18809b;
    public final TL_update.TL_updateNewChannelMessage f18810c;
    public final long d;

    public yi(SendMessagesHelper sendMessagesHelper, TL_update.TL_updateNewChannelMessage tL_updateNewChannelMessage, long j10, int i10) {
        this.f18808a = i10;
        this.f18809b = sendMessagesHelper;
        this.f18810c = tL_updateNewChannelMessage;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f18808a) {
            case 0:
                this.f18809b.lambda$performSendMessageRequest$96(this.f18810c, this.d);
                return;
            default:
                this.f18809b.lambda$performSendMessageRequestMulti$71(this.f18810c, this.d);
                return;
        }
    }
}
