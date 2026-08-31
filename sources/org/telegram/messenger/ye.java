package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class ye implements Runnable {
    public final int f20705a;
    public final MessagesStorage f20706b;
    public final TLRPC.Message f20707c;
    public final long d;

    public ye(int i10, long j10, MessagesStorage messagesStorage, TLRPC.Message message) {
        this.f20705a = i10;
        this.f20706b = messagesStorage;
        this.f20707c = message;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f20705a) {
            case 0:
                this.f20706b.lambda$updateMessageCustomParams$110(this.f20707c, this.d);
                return;
            default:
                this.f20706b.lambda$markMessageAsSendErrorWithParams$210(this.f20707c, this.d);
                return;
        }
    }
}
