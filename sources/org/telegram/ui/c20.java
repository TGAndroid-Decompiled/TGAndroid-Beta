package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class c20 extends q4 {
    public final f40 V;

    public c20(f40 f40Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.V = f40Var;
    }

    @Override
    public final void c() {
        f40 f40Var = this.V;
        org.telegram.messenger.c cVar = f40Var.f47526o1;
        d20 d20Var = f40Var.f47517m1;
        long dialogId = d20Var.getDialogId();
        if (dialogId > 0) {
            TLRPC.User c22 = org.telegram.messenger.np.u1(cVar.f23202a).c2(Long.valueOf(dialogId));
            d20Var.H(null, org.telegram.messenger.gc.m(cVar.f23202a, 0, c22), org.telegram.messenger.gc.m(cVar.f23202a, 1, c22), false);
        }
    }
}
