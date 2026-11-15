package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class qe0 implements Runnable {
    public final int f50597a;
    public final cf0 f50598b;
    public final TLRPC.TL_chatInviteExported f50599c;
    public final TLRPC.TL_error d;
    public final TLObject f50600e;
    public final boolean f50601f;

    public qe0(cf0 cf0Var, TLRPC.TL_chatInviteExported tL_chatInviteExported, TLRPC.TL_error tL_error, TLObject tLObject, boolean z10, int i7) {
        this.f50597a = i7;
        this.f50598b = cf0Var;
        this.f50599c = tL_chatInviteExported;
        this.d = tL_error;
        this.f50600e = tLObject;
        this.f50601f = z10;
    }

    @Override
    public final void run() {
        switch (this.f50597a) {
            case 0:
                cf0 cf0Var = this.f50598b;
                cf0Var.getNotificationCenter().d(new qe0(cf0Var, this.f50599c, this.d, this.f50600e, this.f50601f, 1));
                return;
            default:
                cf0.Z(this.f50598b, this.f50599c, this.d, this.f50600e, this.f50601f);
                return;
        }
    }
}
