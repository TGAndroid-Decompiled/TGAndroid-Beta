package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class yb implements RequestDelegate {
    public final int f20697a;
    public final MessagesController f20698b;
    public final long f20699c;
    public final long d;

    public yb(int i10, long j10, long j11, MessagesController messagesController) {
        this.f20697a = i10;
        this.f20698b = messagesController;
        this.f20699c = j10;
        this.d = j11;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f20697a) {
            case 0:
                this.f20698b.lambda$loadUnknownDialog$208(this.f20699c, this.d, tLObject, tL_error);
                return;
            default:
                this.f20698b.lambda$deleteMessages$124(this.f20699c, this.d, tLObject, tL_error);
                return;
        }
    }
}
