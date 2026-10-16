package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class zi implements Runnable {
    public final int f18897a;
    public final SendMessagesHelper f18898b;
    public final TLRPC.Updates f18899c;

    public zi(SendMessagesHelper sendMessagesHelper, TLRPC.Updates updates, int i10) {
        this.f18897a = i10;
        this.f18898b = sendMessagesHelper;
        this.f18899c = updates;
    }

    @Override
    public final void run() {
        switch (this.f18897a) {
            case 0:
                this.f18898b.lambda$performSendMessageRequest$97(this.f18899c);
                return;
            default:
                this.f18898b.lambda$performSendMessageRequestMulti$75(this.f18899c);
                return;
        }
    }
}
