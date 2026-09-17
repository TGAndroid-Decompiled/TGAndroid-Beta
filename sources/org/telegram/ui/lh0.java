package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class lh0 implements Runnable {
    public final int f38359a;
    public final yh0 f38360b;
    public final TLRPC.TL_chatInviteExported f38361c;
    public final TLRPC.TL_error d;
    public final TLObject f38362e;
    public final boolean f38363f;

    public lh0(yh0 yh0Var, TLRPC.TL_chatInviteExported tL_chatInviteExported, TLRPC.TL_error tL_error, TLObject tLObject, boolean z10, int i10) {
        this.f38359a = i10;
        this.f38360b = yh0Var;
        this.f38361c = tL_chatInviteExported;
        this.d = tL_error;
        this.f38362e = tLObject;
        this.f38363f = z10;
    }

    @Override
    public final void run() {
        switch (this.f38359a) {
            case 0:
                yh0 yh0Var = this.f38360b;
                yh0Var.getNotificationCenter().doOnIdle(new lh0(yh0Var, this.f38361c, this.d, this.f38362e, this.f38363f, 1));
                return;
            default:
                yh0.U(this.f38360b, this.f38361c, this.d, this.f38362e, this.f38363f);
                return;
        }
    }
}
