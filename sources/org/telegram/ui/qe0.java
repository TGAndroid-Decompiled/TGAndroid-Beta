package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class qe0 implements Runnable {
    public final int f49184a;
    public final cf0 f49185b;
    public final TLRPC.TL_chatInviteExported f49186c;
    public final TLRPC.TL_error d;
    public final TLObject f49187e;
    public final boolean f49188f;

    public qe0(cf0 cf0Var, TLRPC.TL_chatInviteExported tL_chatInviteExported, TLRPC.TL_error tL_error, TLObject tLObject, boolean z9, int i7) {
        this.f49184a = i7;
        this.f49185b = cf0Var;
        this.f49186c = tL_chatInviteExported;
        this.d = tL_error;
        this.f49187e = tLObject;
        this.f49188f = z9;
    }

    @Override
    public final void run() {
        switch (this.f49184a) {
            case 0:
                cf0 cf0Var = this.f49185b;
                cf0Var.getNotificationCenter().d(new qe0(cf0Var, this.f49186c, this.d, this.f49187e, this.f49188f, 1));
                return;
            default:
                cf0.Z(this.f49185b, this.f49186c, this.d, this.f49187e, this.f49188f);
                return;
        }
    }
}
