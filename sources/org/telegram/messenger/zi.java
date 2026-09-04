package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_update;
public final class zi implements Runnable {
    public final int f19848a;
    public final SendMessagesHelper f19849b;
    public final TL_update.TL_updateNewChannelMessage f19850c;

    public zi(SendMessagesHelper sendMessagesHelper, TL_update.TL_updateNewChannelMessage tL_updateNewChannelMessage, int i10) {
        this.f19848a = i10;
        this.f19849b = sendMessagesHelper;
        this.f19850c = tL_updateNewChannelMessage;
    }

    @Override
    public final void run() {
        switch (this.f19848a) {
            case 0:
                this.f19849b.lambda$performSendMessageRequest$92(this.f19850c);
                return;
            default:
                this.f19849b.lambda$performSendMessageRequestMulti$67(this.f19850c);
                return;
        }
    }
}
