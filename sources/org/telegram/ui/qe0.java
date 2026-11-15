package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class qe0 implements Runnable {
    public final int f50588a;
    public final cf0 f50589b;
    public final TLRPC.TL_chatInviteExported f50590c;
    public final TLRPC.TL_error d;
    public final TLObject f50591e;
    public final boolean f50592f;

    public qe0(cf0 cf0Var, TLRPC.TL_chatInviteExported tL_chatInviteExported, TLRPC.TL_error tL_error, TLObject tLObject, boolean z10, int i7) {
        this.f50588a = i7;
        this.f50589b = cf0Var;
        this.f50590c = tL_chatInviteExported;
        this.d = tL_error;
        this.f50591e = tLObject;
        this.f50592f = z10;
    }

    @Override
    public final void run() {
        switch (this.f50588a) {
            case 0:
                cf0 cf0Var = this.f50589b;
                cf0Var.getNotificationCenter().d(new qe0(cf0Var, this.f50590c, this.d, this.f50591e, this.f50592f, 1));
                return;
            default:
                cf0.Z(this.f50589b, this.f50590c, this.d, this.f50591e, this.f50592f);
                return;
        }
    }
}
