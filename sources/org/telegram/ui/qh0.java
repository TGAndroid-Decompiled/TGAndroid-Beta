package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class qh0 implements Runnable {
    public final int f39167a;
    public final di0 f39168b;
    public final TLRPC.TL_chatInviteExported f39169c;
    public final TLRPC.TL_error d;
    public final TLObject e;
    public final boolean f39170f;

    public qh0(di0 di0Var, TLRPC.TL_chatInviteExported tL_chatInviteExported, TLRPC.TL_error tL_error, TLObject tLObject, boolean z10, int i10) {
        this.f39167a = i10;
        this.f39168b = di0Var;
        this.f39169c = tL_chatInviteExported;
        this.d = tL_error;
        this.e = tLObject;
        this.f39170f = z10;
    }

    @Override
    public final void run() {
        switch (this.f39167a) {
            case 0:
                di0 di0Var = this.f39168b;
                di0Var.getNotificationCenter().doOnIdle(new qh0(di0Var, this.f39169c, this.d, this.e, this.f39170f, 1));
                return;
            default:
                di0.U(this.f39168b, this.f39169c, this.d, this.e, this.f39170f);
                return;
        }
    }
}
