package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class lh0 implements Runnable {
    public final int f38358a;
    public final yh0 f38359b;
    public final TLRPC.TL_chatInviteExported f38360c;
    public final TLRPC.TL_error d;
    public final TLObject f38361e;
    public final boolean f38362f;

    public lh0(yh0 yh0Var, TLRPC.TL_chatInviteExported tL_chatInviteExported, TLRPC.TL_error tL_error, TLObject tLObject, boolean z10, int i10) {
        this.f38358a = i10;
        this.f38359b = yh0Var;
        this.f38360c = tL_chatInviteExported;
        this.d = tL_error;
        this.f38361e = tLObject;
        this.f38362f = z10;
    }

    @Override
    public final void run() {
        switch (this.f38358a) {
            case 0:
                yh0 yh0Var = this.f38359b;
                yh0Var.getNotificationCenter().doOnIdle(new lh0(yh0Var, this.f38360c, this.d, this.f38361e, this.f38362f, 1));
                return;
            default:
                yh0.U(this.f38359b, this.f38360c, this.d, this.f38361e, this.f38362f);
                return;
        }
    }
}
