package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class fh0 implements Runnable {
    public final int f33678a;
    public final sh0 f33679b;
    public final TLRPC.TL_chatInviteExported f33680c;
    public final TLRPC.TL_error d;
    public final TLObject e;
    public final boolean f33681f;

    public fh0(sh0 sh0Var, TLRPC.TL_chatInviteExported tL_chatInviteExported, TLRPC.TL_error tL_error, TLObject tLObject, boolean z10, int i10) {
        this.f33678a = i10;
        this.f33679b = sh0Var;
        this.f33680c = tL_chatInviteExported;
        this.d = tL_error;
        this.e = tLObject;
        this.f33681f = z10;
    }

    @Override
    public final void run() {
        switch (this.f33678a) {
            case 0:
                sh0 sh0Var = this.f33679b;
                sh0Var.getNotificationCenter().doOnIdle(new fh0(sh0Var, this.f33680c, this.d, this.e, this.f33681f, 1));
                return;
            default:
                sh0.U(this.f33679b, this.f33680c, this.d, this.e, this.f33681f);
                return;
        }
    }
}
