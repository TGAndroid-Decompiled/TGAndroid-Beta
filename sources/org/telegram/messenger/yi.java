package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class yi implements Runnable {
    public final int f20166a;
    public final SendMessagesHelper f20167b;
    public final TLRPC.Message f20168c;
    public final boolean d;

    public yi(SendMessagesHelper sendMessagesHelper, TLRPC.Message message, boolean z10, int i10) {
        this.f20166a = i10;
        this.f20167b = sendMessagesHelper;
        this.f20168c = message;
        this.d = z10;
    }

    @Override
    public final void run() {
        switch (this.f20166a) {
            case 0:
                this.f20167b.lambda$putToSendingMessages$64(this.f20168c, this.d);
                return;
            case 1:
                this.f20167b.lambda$performSendMessageRequest$90(this.f20168c, this.d);
                return;
            default:
                this.f20167b.lambda$performSendMessageRequest$87(this.f20168c, this.d);
                return;
        }
    }
}
