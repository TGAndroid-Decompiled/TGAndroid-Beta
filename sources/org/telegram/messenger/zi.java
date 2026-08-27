package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;

public final class zi implements Runnable {

    public final int f22357a;

    public final SendMessagesHelper f22358b;

    public final TLRPC.Message f22359c;
    public final boolean d;

    public zi(SendMessagesHelper sendMessagesHelper, TLRPC.Message message, boolean z10, int i10) {
        this.f22357a = i10;
        this.f22358b = sendMessagesHelper;
        this.f22359c = message;
        this.d = z10;
    }

    @Override
    public final void run() {
        switch (this.f22357a) {
            case 0:
                this.f22358b.lambda$putToSendingMessages$61(this.f22359c, this.d);
                break;
            case 1:
                this.f22358b.lambda$performSendMessageRequest$84(this.f22359c, this.d);
                break;
            default:
                this.f22358b.lambda$performSendMessageRequest$87(this.f22359c, this.d);
                break;
        }
    }
}
