package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class yb implements RequestDelegate {
    public final int f19024a;
    public final MessagesController f19025b;
    public final long f19026c;
    public final long d;

    public yb(int i10, long j10, long j11, MessagesController messagesController) {
        this.f19024a = i10;
        this.f19025b = messagesController;
        this.f19026c = j10;
        this.d = j11;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19024a) {
            case 0:
                this.f19025b.lambda$loadUnknownDialog$208(this.f19026c, this.d, tLObject, tL_error);
                return;
            default:
                this.f19025b.lambda$deleteMessages$124(this.f19026c, this.d, tLObject, tL_error);
                return;
        }
    }
}
