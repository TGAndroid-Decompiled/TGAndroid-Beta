package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class ye implements Runnable {
    public final int f20707a;
    public final MessagesStorage f20708b;
    public final TLRPC.Message f20709c;
    public final long d;

    public ye(int i10, long j10, MessagesStorage messagesStorage, TLRPC.Message message) {
        this.f20707a = i10;
        this.f20708b = messagesStorage;
        this.f20709c = message;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f20707a) {
            case 0:
                this.f20708b.lambda$updateMessageCustomParams$110(this.f20709c, this.d);
                return;
            default:
                this.f20708b.lambda$markMessageAsSendErrorWithParams$210(this.f20709c, this.d);
                return;
        }
    }
}
