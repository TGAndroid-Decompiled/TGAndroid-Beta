package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_update;
public final class yi implements Runnable {
    public final int f18228a;
    public final SendMessagesHelper f18229b;
    public final TL_update.TL_updateNewChannelMessage f18230c;

    public yi(SendMessagesHelper sendMessagesHelper, TL_update.TL_updateNewChannelMessage tL_updateNewChannelMessage, int i10) {
        this.f18228a = i10;
        this.f18229b = sendMessagesHelper;
        this.f18230c = tL_updateNewChannelMessage;
    }

    @Override
    public final void run() {
        switch (this.f18228a) {
            case 0:
                this.f18229b.lambda$performSendMessageRequest$92(this.f18230c);
                return;
            default:
                this.f18229b.lambda$performSendMessageRequestMulti$67(this.f18230c);
                return;
        }
    }
}
