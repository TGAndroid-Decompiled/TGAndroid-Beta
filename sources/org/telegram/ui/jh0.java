package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class jh0 implements Runnable {
    public final int f37694a;
    public final wh0 f37695b;
    public final TLRPC.TL_chatInviteExported f37696c;
    public final TLRPC.TL_error d;
    public final TLObject f37697e;
    public final boolean f37698f;

    public jh0(wh0 wh0Var, TLRPC.TL_chatInviteExported tL_chatInviteExported, TLRPC.TL_error tL_error, TLObject tLObject, boolean z10, int i10) {
        this.f37694a = i10;
        this.f37695b = wh0Var;
        this.f37696c = tL_chatInviteExported;
        this.d = tL_error;
        this.f37697e = tLObject;
        this.f37698f = z10;
    }

    @Override
    public final void run() {
        switch (this.f37694a) {
            case 0:
                wh0 wh0Var = this.f37695b;
                wh0Var.getNotificationCenter().doOnIdle(new jh0(wh0Var, this.f37696c, this.d, this.f37697e, this.f37698f, 1));
                return;
            default:
                wh0.S(this.f37695b, this.f37696c, this.d, this.f37697e, this.f37698f);
                return;
        }
    }
}
