package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class yi implements Runnable {
    public final int f21927a;
    public final SendMessagesHelper f21928b;
    public final TLRPC.Updates f21929c;

    public yi(SendMessagesHelper sendMessagesHelper, TLRPC.Updates updates, int i10) {
        this.f21927a = i10;
        this.f21928b = sendMessagesHelper;
        this.f21929c = updates;
    }

    @Override
    public final void run() {
        switch (this.f21927a) {
            case 0:
                this.f21928b.lambda$performSendMessageRequest$97(this.f21929c);
                return;
            default:
                this.f21928b.lambda$performSendMessageRequestMulti$75(this.f21929c);
                return;
        }
    }
}
