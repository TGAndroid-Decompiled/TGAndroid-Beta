package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class d20 extends q4 {
    public final f40 U;

    public d20(f40 f40Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.U = f40Var;
    }

    @Override
    public final void c() {
        f40 f40Var = this.U;
        org.telegram.messenger.c cVar = f40Var.n1;
        e20 e20Var = f40Var.l1;
        long dialogId = e20Var.getDialogId();
        if (dialogId > 0) {
            TLRPC.User a22 = org.telegram.messenger.qp.s1(cVar.f21770a).a2(Long.valueOf(dialogId));
            e20Var.H(null, org.telegram.messenger.hc.m(cVar.f21770a, 0, a22), org.telegram.messenger.hc.m(cVar.f21770a, 1, a22), false);
        }
    }
}
