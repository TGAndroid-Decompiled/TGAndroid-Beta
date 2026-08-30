package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class ye implements Runnable {
    public final int f19048a;
    public final MessagesStorage f19049b;
    public final TLRPC.Message f19050c;
    public final long d;

    public ye(int i10, long j10, MessagesStorage messagesStorage, TLRPC.Message message) {
        this.f19048a = i10;
        this.f19049b = messagesStorage;
        this.f19050c = message;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f19048a) {
            case 0:
                this.f19049b.lambda$updateMessageCustomParams$110(this.f19050c, this.d);
                return;
            default:
                this.f19049b.lambda$markMessageAsSendErrorWithParams$210(this.f19050c, this.d);
                return;
        }
    }
}
