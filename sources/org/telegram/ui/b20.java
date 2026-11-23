package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class b20 extends q4 {
    public final e40 V;

    public b20(e40 e40Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.V = e40Var;
    }

    @Override
    public final void c() {
        e40 e40Var = this.V;
        org.telegram.messenger.c cVar = e40Var.f47376o1;
        c20 c20Var = e40Var.f47367m1;
        long dialogId = c20Var.getDialogId();
        if (dialogId > 0) {
            TLRPC.User c22 = org.telegram.messenger.mp.u1(cVar.f23343a).c2(Long.valueOf(dialogId));
            c20Var.H(null, org.telegram.messenger.fc.m(cVar.f23343a, 0, c22), org.telegram.messenger.fc.m(cVar.f23343a, 1, c22), false);
        }
    }
}
