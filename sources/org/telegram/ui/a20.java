package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class a20 extends q4 {
    public final c40 U;

    public a20(c40 c40Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.U = c40Var;
    }

    @Override
    public final void c() {
        c40 c40Var = this.U;
        org.telegram.messenger.c cVar = c40Var.f44585k1;
        b20 b20Var = c40Var.f44576i1;
        long dialogId = b20Var.getDialogId();
        if (dialogId > 0) {
            TLRPC.User a22 = org.telegram.messenger.qp.s1(cVar.f21729a).a2(Long.valueOf(dialogId));
            b20Var.H(null, org.telegram.messenger.hc.m(cVar.f21729a, 0, a22), org.telegram.messenger.hc.m(cVar.f21729a, 1, a22), false);
        }
    }
}
