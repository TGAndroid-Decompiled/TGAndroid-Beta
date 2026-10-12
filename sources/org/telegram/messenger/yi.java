package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class yi implements Runnable {
    public final int f19683a;
    public final SendMessagesHelper f19684b;
    public final TLRPC.Message f19685c;
    public final int d;

    public yi(SendMessagesHelper sendMessagesHelper, TLRPC.Message message, int i10, int i11) {
        this.f19683a = i11;
        this.f19684b = sendMessagesHelper;
        this.f19685c = message;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f19683a) {
            case 0:
                this.f19684b.lambda$performSendMessageRequest$105(this.f19685c, this.d);
                return;
            default:
                this.f19684b.lambda$sendMessage$18(this.f19685c, this.d);
                return;
        }
    }
}
