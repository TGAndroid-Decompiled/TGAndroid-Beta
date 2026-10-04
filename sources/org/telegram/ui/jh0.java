package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class jh0 implements Runnable {
    public final int f37693a;
    public final wh0 f37694b;
    public final TLRPC.TL_chatInviteExported f37695c;
    public final TLRPC.TL_error d;
    public final TLObject f37696e;
    public final boolean f37697f;

    public jh0(wh0 wh0Var, TLRPC.TL_chatInviteExported tL_chatInviteExported, TLRPC.TL_error tL_error, TLObject tLObject, boolean z10, int i10) {
        this.f37693a = i10;
        this.f37694b = wh0Var;
        this.f37695c = tL_chatInviteExported;
        this.d = tL_error;
        this.f37696e = tLObject;
        this.f37697f = z10;
    }

    @Override
    public final void run() {
        switch (this.f37693a) {
            case 0:
                wh0 wh0Var = this.f37694b;
                wh0Var.getNotificationCenter().doOnIdle(new jh0(wh0Var, this.f37695c, this.d, this.f37696e, this.f37697f, 1));
                return;
            default:
                wh0.S(this.f37694b, this.f37695c, this.d, this.f37696e, this.f37697f);
                return;
        }
    }
}
