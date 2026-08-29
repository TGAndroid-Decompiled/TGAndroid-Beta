package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_update;
public final class yi implements Runnable {
    public final int f22281a;
    public final SendMessagesHelper f22282b;
    public final TL_update.TL_updateNewChannelMessage f22283c;
    public final long d;

    public yi(SendMessagesHelper sendMessagesHelper, TL_update.TL_updateNewChannelMessage tL_updateNewChannelMessage, long j10, int i10) {
        this.f22281a = i10;
        this.f22282b = sendMessagesHelper;
        this.f22283c = tL_updateNewChannelMessage;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f22281a) {
            case 0:
                this.f22282b.lambda$performSendMessageRequest$93(this.f22283c, this.d);
                return;
            default:
                this.f22282b.lambda$performSendMessageRequestMulti$68(this.f22283c, this.d);
                return;
        }
    }
}
