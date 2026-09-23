package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_update;
public final class yi implements Runnable {
    public final int f17987a;
    public final SendMessagesHelper f17988b;
    public final TL_update.TL_updateNewChannelMessage f17989c;

    public yi(SendMessagesHelper sendMessagesHelper, TL_update.TL_updateNewChannelMessage tL_updateNewChannelMessage, int i10) {
        this.f17987a = i10;
        this.f17988b = sendMessagesHelper;
        this.f17989c = tL_updateNewChannelMessage;
    }

    @Override
    public final void run() {
        switch (this.f17987a) {
            case 0:
                this.f17988b.lambda$performSendMessageRequest$92(this.f17989c);
                return;
            default:
                this.f17988b.lambda$performSendMessageRequestMulti$67(this.f17989c);
                return;
        }
    }
}
