package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class yi implements Runnable {
    public final int f19927a;
    public final SendMessagesHelper f19928b;
    public final TLRPC.Updates f19929c;

    public yi(SendMessagesHelper sendMessagesHelper, TLRPC.Updates updates, int i10) {
        this.f19927a = i10;
        this.f19928b = sendMessagesHelper;
        this.f19929c = updates;
    }

    @Override
    public final void run() {
        switch (this.f19927a) {
            case 0:
                this.f19928b.lambda$performSendMessageRequest$97(this.f19929c);
                return;
            default:
                this.f19928b.lambda$performSendMessageRequestMulti$75(this.f19929c);
                return;
        }
    }
}
