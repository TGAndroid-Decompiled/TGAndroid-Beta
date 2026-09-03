package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class eh0 implements Runnable {
    public final int f33813a;
    public final rh0 f33814b;
    public final TLRPC.TL_chatInviteExported f33815c;
    public final TLRPC.TL_error d;
    public final TLObject e;
    public final boolean f33816f;

    public eh0(rh0 rh0Var, TLRPC.TL_chatInviteExported tL_chatInviteExported, TLRPC.TL_error tL_error, TLObject tLObject, boolean z4, int i10) {
        this.f33813a = i10;
        this.f33814b = rh0Var;
        this.f33815c = tL_chatInviteExported;
        this.d = tL_error;
        this.e = tLObject;
        this.f33816f = z4;
    }

    @Override
    public final void run() {
        switch (this.f33813a) {
            case 0:
                rh0 rh0Var = this.f33814b;
                rh0Var.getNotificationCenter().doOnIdle(new eh0(rh0Var, this.f33815c, this.d, this.e, this.f33816f, 1));
                return;
            default:
                rh0.U(this.f33814b, this.f33815c, this.d, this.e, this.f33816f);
                return;
        }
    }
}
