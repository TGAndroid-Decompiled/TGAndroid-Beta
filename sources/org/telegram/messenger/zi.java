package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class zi implements Runnable {
    public final int f20266a;
    public final SendMessagesHelper f20267b;
    public final TLRPC.Message f20268c;
    public final boolean d;

    public zi(SendMessagesHelper sendMessagesHelper, TLRPC.Message message, boolean z10, int i10) {
        this.f20266a = i10;
        this.f20267b = sendMessagesHelper;
        this.f20268c = message;
        this.d = z10;
    }

    @Override
    public final void run() {
        switch (this.f20266a) {
            case 0:
                this.f20267b.lambda$putToSendingMessages$64(this.f20268c, this.d);
                return;
            case 1:
                this.f20267b.lambda$performSendMessageRequest$90(this.f20268c, this.d);
                return;
            default:
                this.f20267b.lambda$performSendMessageRequest$87(this.f20268c, this.d);
                return;
        }
    }
}
