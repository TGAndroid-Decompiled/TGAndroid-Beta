package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class yi implements Runnable {
    public final int f19682a;
    public final SendMessagesHelper f19683b;
    public final TLRPC.Message f19684c;
    public final int d;

    public yi(SendMessagesHelper sendMessagesHelper, TLRPC.Message message, int i10, int i11) {
        this.f19682a = i11;
        this.f19683b = sendMessagesHelper;
        this.f19684c = message;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f19682a) {
            case 0:
                this.f19683b.lambda$performSendMessageRequest$105(this.f19684c, this.d);
                return;
            default:
                this.f19683b.lambda$sendMessage$18(this.f19684c, this.d);
                return;
        }
    }
}
