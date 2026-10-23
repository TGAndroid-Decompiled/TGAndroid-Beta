package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class zi implements Runnable {
    public final int f20330a;
    public final SendMessagesHelper f20331b;
    public final TLRPC.Message f20332c;
    public final boolean d;

    public zi(SendMessagesHelper sendMessagesHelper, TLRPC.Message message, boolean z10, int i10) {
        this.f20330a = i10;
        this.f20331b = sendMessagesHelper;
        this.f20332c = message;
        this.d = z10;
    }

    @Override
    public final void run() {
        switch (this.f20330a) {
            case 0:
                this.f20331b.lambda$putToSendingMessages$64(this.f20332c, this.d);
                return;
            case 1:
                this.f20331b.lambda$performSendMessageRequest$90(this.f20332c, this.d);
                return;
            default:
                this.f20331b.lambda$performSendMessageRequest$87(this.f20332c, this.d);
                return;
        }
    }
}
