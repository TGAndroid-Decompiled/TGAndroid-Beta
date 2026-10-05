package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class jh0 implements Runnable {
    public final int f37703a;
    public final wh0 f37704b;
    public final TLRPC.TL_chatInviteExported f37705c;
    public final TLRPC.TL_error d;
    public final TLObject f37706e;
    public final boolean f37707f;

    public jh0(wh0 wh0Var, TLRPC.TL_chatInviteExported tL_chatInviteExported, TLRPC.TL_error tL_error, TLObject tLObject, boolean z10, int i10) {
        this.f37703a = i10;
        this.f37704b = wh0Var;
        this.f37705c = tL_chatInviteExported;
        this.d = tL_error;
        this.f37706e = tLObject;
        this.f37707f = z10;
    }

    @Override
    public final void run() {
        switch (this.f37703a) {
            case 0:
                wh0 wh0Var = this.f37704b;
                wh0Var.getNotificationCenter().doOnIdle(new jh0(wh0Var, this.f37705c, this.d, this.f37706e, this.f37707f, 1));
                return;
            default:
                wh0.S(this.f37704b, this.f37705c, this.d, this.f37706e, this.f37707f);
                return;
        }
    }
}
