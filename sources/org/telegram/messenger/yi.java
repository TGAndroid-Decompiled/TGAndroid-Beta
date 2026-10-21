package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class yi implements Runnable {
    public final int f20183a;
    public final SendMessagesHelper f20184b;
    public final TLRPC.Message f20185c;
    public final boolean d;

    public yi(SendMessagesHelper sendMessagesHelper, TLRPC.Message message, boolean z10, int i10) {
        this.f20183a = i10;
        this.f20184b = sendMessagesHelper;
        this.f20185c = message;
        this.d = z10;
    }

    @Override
    public final void run() {
        switch (this.f20183a) {
            case 0:
                this.f20184b.lambda$putToSendingMessages$64(this.f20185c, this.d);
                return;
            case 1:
                this.f20184b.lambda$performSendMessageRequest$90(this.f20185c, this.d);
                return;
            default:
                this.f20184b.lambda$performSendMessageRequest$87(this.f20185c, this.d);
                return;
        }
    }
}
