package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class yi implements Runnable {
    public final int f20189a;
    public final SendMessagesHelper f20190b;
    public final TLRPC.Message f20191c;
    public final boolean d;

    public yi(SendMessagesHelper sendMessagesHelper, TLRPC.Message message, boolean z10, int i10) {
        this.f20189a = i10;
        this.f20190b = sendMessagesHelper;
        this.f20191c = message;
        this.d = z10;
    }

    @Override
    public final void run() {
        switch (this.f20189a) {
            case 0:
                this.f20190b.lambda$putToSendingMessages$64(this.f20191c, this.d);
                return;
            case 1:
                this.f20190b.lambda$performSendMessageRequest$90(this.f20191c, this.d);
                return;
            default:
                this.f20190b.lambda$performSendMessageRequest$87(this.f20191c, this.d);
                return;
        }
    }
}
