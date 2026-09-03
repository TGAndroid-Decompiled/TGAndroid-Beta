package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class yb implements RequestDelegate {
    public final int f20699a;
    public final MessagesController f20700b;
    public final long f20701c;
    public final long d;

    public yb(int i10, long j10, long j11, MessagesController messagesController) {
        this.f20699a = i10;
        this.f20700b = messagesController;
        this.f20701c = j10;
        this.d = j11;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f20699a) {
            case 0:
                this.f20700b.lambda$loadUnknownDialog$208(this.f20701c, this.d, tLObject, tL_error);
                return;
            default:
                this.f20700b.lambda$deleteMessages$124(this.f20701c, this.d, tLObject, tL_error);
                return;
        }
    }
}
