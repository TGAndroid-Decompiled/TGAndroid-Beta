package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class yi implements Runnable {
    public final int f20169a;
    public final SendMessagesHelper f20170b;
    public final TLRPC.Message f20171c;
    public final boolean d;

    public yi(SendMessagesHelper sendMessagesHelper, TLRPC.Message message, boolean z10, int i10) {
        this.f20169a = i10;
        this.f20170b = sendMessagesHelper;
        this.f20171c = message;
        this.d = z10;
    }

    @Override
    public final void run() {
        switch (this.f20169a) {
            case 0:
                this.f20170b.lambda$putToSendingMessages$64(this.f20171c, this.d);
                return;
            case 1:
                this.f20170b.lambda$performSendMessageRequest$90(this.f20171c, this.d);
                return;
            default:
                this.f20170b.lambda$performSendMessageRequest$87(this.f20171c, this.d);
                return;
        }
    }
}
