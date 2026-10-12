package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_update;
public final class yi implements Runnable {
    public final int f19104a;
    public final SendMessagesHelper f19105b;
    public final TL_update.TL_updateNewChannelMessage f19106c;

    public yi(SendMessagesHelper sendMessagesHelper, TL_update.TL_updateNewChannelMessage tL_updateNewChannelMessage, int i10) {
        this.f19104a = i10;
        this.f19105b = sendMessagesHelper;
        this.f19106c = tL_updateNewChannelMessage;
    }

    @Override
    public final void run() {
        switch (this.f19104a) {
            case 0:
                this.f19105b.lambda$performSendMessageRequest$95(this.f19106c);
                return;
            default:
                this.f19105b.lambda$performSendMessageRequestMulti$70(this.f19106c);
                return;
        }
    }
}
