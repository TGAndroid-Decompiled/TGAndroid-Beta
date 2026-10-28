package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class zi implements Runnable {
    public final int f22006a;
    public final SendMessagesHelper f22007b;
    public final TLRPC.Updates f22008c;

    public zi(SendMessagesHelper sendMessagesHelper, TLRPC.Updates updates, int i10) {
        this.f22006a = i10;
        this.f22007b = sendMessagesHelper;
        this.f22008c = updates;
    }

    @Override
    public final void run() {
        switch (this.f22006a) {
            case 0:
                this.f22007b.lambda$performSendMessageRequest$97(this.f22008c);
                return;
            default:
                this.f22007b.lambda$performSendMessageRequestMulti$75(this.f22008c);
                return;
        }
    }
}
