package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ch0 implements Runnable {
    public final int f33374a;
    public final ph0 f33375b;
    public final TLRPC.TL_chatInviteExported f33376c;
    public final TLRPC.TL_error d;
    public final TLObject e;
    public final boolean f33377f;

    public ch0(ph0 ph0Var, TLRPC.TL_chatInviteExported tL_chatInviteExported, TLRPC.TL_error tL_error, TLObject tLObject, boolean z4, int i10) {
        this.f33374a = i10;
        this.f33375b = ph0Var;
        this.f33376c = tL_chatInviteExported;
        this.d = tL_error;
        this.e = tLObject;
        this.f33377f = z4;
    }

    @Override
    public final void run() {
        switch (this.f33374a) {
            case 0:
                ph0 ph0Var = this.f33375b;
                ph0Var.getNotificationCenter().doOnIdle(new ch0(ph0Var, this.f33376c, this.d, this.e, this.f33377f, 1));
                return;
            default:
                ph0.U(this.f33375b, this.f33376c, this.d, this.e, this.f33377f);
                return;
        }
    }
}
