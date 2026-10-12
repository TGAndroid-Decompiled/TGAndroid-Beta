package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class nh0 implements Runnable {
    public final int f40419a;
    public final ai0 f40420b;
    public final TLRPC.TL_chatInviteExported f40421c;
    public final TLRPC.TL_error d;
    public final TLObject f40422e;
    public final boolean f40423f;

    public nh0(ai0 ai0Var, TLRPC.TL_chatInviteExported tL_chatInviteExported, TLRPC.TL_error tL_error, TLObject tLObject, boolean z10, int i10) {
        this.f40419a = i10;
        this.f40420b = ai0Var;
        this.f40421c = tL_chatInviteExported;
        this.d = tL_error;
        this.f40422e = tLObject;
        this.f40423f = z10;
    }

    @Override
    public final void run() {
        switch (this.f40419a) {
            case 0:
                ai0 ai0Var = this.f40420b;
                ai0Var.getNotificationCenter().doOnIdle(new nh0(ai0Var, this.f40421c, this.d, this.f40422e, this.f40423f, 1));
                return;
            default:
                ai0.U(this.f40420b, this.f40421c, this.d, this.f40422e, this.f40423f);
                return;
        }
    }
}
