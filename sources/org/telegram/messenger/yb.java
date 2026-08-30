package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class yb implements RequestDelegate {
    public final int f19040a;
    public final MessagesController f19041b;
    public final long f19042c;
    public final long d;

    public yb(int i10, long j10, long j11, MessagesController messagesController) {
        this.f19040a = i10;
        this.f19041b = messagesController;
        this.f19042c = j10;
        this.d = j11;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19040a) {
            case 0:
                this.f19041b.lambda$loadUnknownDialog$208(this.f19042c, this.d, tLObject, tL_error);
                return;
            default:
                this.f19041b.lambda$deleteMessages$124(this.f19042c, this.d, tLObject, tL_error);
                return;
        }
    }
}
