package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class zi implements Runnable {
    public final int f22377a;
    public final SendMessagesHelper f22378b;
    public final TLRPC.Updates f22379c;

    public zi(SendMessagesHelper sendMessagesHelper, TLRPC.Updates updates, int i10) {
        this.f22377a = i10;
        this.f22378b = sendMessagesHelper;
        this.f22379c = updates;
    }

    @Override
    public final void run() {
        switch (this.f22377a) {
            case 0:
                this.f22378b.lambda$performSendMessageRequest$94(this.f22379c);
                return;
            default:
                this.f22378b.lambda$performSendMessageRequestMulti$72(this.f22379c);
                return;
        }
    }
}
