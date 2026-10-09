package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class yi implements Runnable {
    public final int f19923a;
    public final SendMessagesHelper f19924b;
    public final TLRPC.Updates f19925c;

    public yi(SendMessagesHelper sendMessagesHelper, TLRPC.Updates updates, int i10) {
        this.f19923a = i10;
        this.f19924b = sendMessagesHelper;
        this.f19925c = updates;
    }

    @Override
    public final void run() {
        switch (this.f19923a) {
            case 0:
                this.f19924b.lambda$performSendMessageRequest$97(this.f19925c);
                return;
            default:
                this.f19924b.lambda$performSendMessageRequestMulti$75(this.f19925c);
                return;
        }
    }
}
