package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class c20 extends q4 {
    public final e40 U;

    public c20(e40 e40Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.U = e40Var;
    }

    @Override
    public final void c() {
        e40 e40Var = this.U;
        org.telegram.messenger.c cVar = e40Var.f45228k1;
        d20 d20Var = e40Var.f45219i1;
        long dialogId = d20Var.getDialogId();
        if (dialogId > 0) {
            TLRPC.User a22 = org.telegram.messenger.qp.s1(cVar.f21765a).a2(Long.valueOf(dialogId));
            d20Var.H(null, org.telegram.messenger.hc.m(cVar.f21765a, 0, a22), org.telegram.messenger.hc.m(cVar.f21765a, 1, a22), false);
        }
    }
}
