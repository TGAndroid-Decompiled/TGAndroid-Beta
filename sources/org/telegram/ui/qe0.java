package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class qe0 implements Runnable {
    public final int f49210a;
    public final cf0 f49211b;
    public final TLRPC.TL_chatInviteExported f49212c;
    public final TLRPC.TL_error d;
    public final TLObject f49213e;
    public final boolean f49214f;

    public qe0(cf0 cf0Var, TLRPC.TL_chatInviteExported tL_chatInviteExported, TLRPC.TL_error tL_error, TLObject tLObject, boolean z9, int i7) {
        this.f49210a = i7;
        this.f49211b = cf0Var;
        this.f49212c = tL_chatInviteExported;
        this.d = tL_error;
        this.f49213e = tLObject;
        this.f49214f = z9;
    }

    @Override
    public final void run() {
        switch (this.f49210a) {
            case 0:
                cf0 cf0Var = this.f49211b;
                cf0Var.getNotificationCenter().d(new qe0(cf0Var, this.f49212c, this.d, this.f49213e, this.f49214f, 1));
                return;
            default:
                cf0.Z(this.f49211b, this.f49212c, this.d, this.f49213e, this.f49214f);
                return;
        }
    }
}
