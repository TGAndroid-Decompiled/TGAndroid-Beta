package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_update;
public final class yi implements Runnable {
    public final int f21931a;
    public final SendMessagesHelper f21932b;
    public final TL_update.TL_updateNewChannelMessage f21933c;
    public final long d;

    public yi(SendMessagesHelper sendMessagesHelper, TL_update.TL_updateNewChannelMessage tL_updateNewChannelMessage, long j10, int i10) {
        this.f21931a = i10;
        this.f21932b = sendMessagesHelper;
        this.f21933c = tL_updateNewChannelMessage;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f21931a) {
            case 0:
                this.f21932b.lambda$performSendMessageRequest$96(this.f21933c, this.d);
                return;
            default:
                this.f21932b.lambda$performSendMessageRequestMulti$71(this.f21933c, this.d);
                return;
        }
    }
}
