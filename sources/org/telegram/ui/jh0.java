package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class jh0 implements Runnable {
    public final int f37699a;
    public final wh0 f37700b;
    public final TLRPC.TL_chatInviteExported f37701c;
    public final TLRPC.TL_error d;
    public final TLObject f37702e;
    public final boolean f37703f;

    public jh0(wh0 wh0Var, TLRPC.TL_chatInviteExported tL_chatInviteExported, TLRPC.TL_error tL_error, TLObject tLObject, boolean z10, int i10) {
        this.f37699a = i10;
        this.f37700b = wh0Var;
        this.f37701c = tL_chatInviteExported;
        this.d = tL_error;
        this.f37702e = tLObject;
        this.f37703f = z10;
    }

    @Override
    public final void run() {
        switch (this.f37699a) {
            case 0:
                wh0 wh0Var = this.f37700b;
                wh0Var.getNotificationCenter().doOnIdle(new jh0(wh0Var, this.f37701c, this.d, this.f37702e, this.f37703f, 1));
                return;
            default:
                wh0.S(this.f37700b, this.f37701c, this.d, this.f37702e, this.f37703f);
                return;
        }
    }
}
