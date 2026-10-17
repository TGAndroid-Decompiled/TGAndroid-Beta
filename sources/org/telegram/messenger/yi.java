package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class yi implements Runnable {
    public final int f20174a;
    public final SendMessagesHelper f20175b;
    public final TLRPC.Message f20176c;
    public final boolean d;

    public yi(SendMessagesHelper sendMessagesHelper, TLRPC.Message message, boolean z10, int i10) {
        this.f20174a = i10;
        this.f20175b = sendMessagesHelper;
        this.f20176c = message;
        this.d = z10;
    }

    @Override
    public final void run() {
        switch (this.f20174a) {
            case 0:
                this.f20175b.lambda$putToSendingMessages$64(this.f20176c, this.d);
                return;
            case 1:
                this.f20175b.lambda$performSendMessageRequest$90(this.f20176c, this.d);
                return;
            default:
                this.f20175b.lambda$performSendMessageRequest$87(this.f20176c, this.d);
                return;
        }
    }
}
