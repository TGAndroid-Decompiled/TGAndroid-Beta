package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ih0 implements Runnable {
    public final int f34483a;
    public final vh0 f34484b;
    public final TLRPC.TL_chatInviteExported f34485c;
    public final TLRPC.TL_error d;
    public final TLObject e;
    public final boolean f34486f;

    public ih0(vh0 vh0Var, TLRPC.TL_chatInviteExported tL_chatInviteExported, TLRPC.TL_error tL_error, TLObject tLObject, boolean z10, int i10) {
        this.f34483a = i10;
        this.f34484b = vh0Var;
        this.f34485c = tL_chatInviteExported;
        this.d = tL_error;
        this.e = tLObject;
        this.f34486f = z10;
    }

    @Override
    public final void run() {
        switch (this.f34483a) {
            case 0:
                vh0 vh0Var = this.f34484b;
                vh0Var.getNotificationCenter().doOnIdle(new ih0(vh0Var, this.f34485c, this.d, this.e, this.f34486f, 1));
                return;
            default:
                vh0.U(this.f34484b, this.f34485c, this.d, this.e, this.f34486f);
                return;
        }
    }
}
