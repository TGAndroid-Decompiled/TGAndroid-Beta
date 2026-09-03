package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class ye implements Runnable {
    public final int f19032a;
    public final MessagesStorage f19033b;
    public final TLRPC.Message f19034c;
    public final long d;

    public ye(int i10, long j10, MessagesStorage messagesStorage, TLRPC.Message message) {
        this.f19032a = i10;
        this.f19033b = messagesStorage;
        this.f19034c = message;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f19032a) {
            case 0:
                this.f19033b.lambda$updateMessageCustomParams$110(this.f19034c, this.d);
                return;
            default:
                this.f19033b.lambda$markMessageAsSendErrorWithParams$210(this.f19034c, this.d);
                return;
        }
    }
}
