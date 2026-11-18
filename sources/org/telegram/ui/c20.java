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
        org.telegram.messenger.c cVar = f40Var.f47454o1;
        d20 d20Var = f40Var.f47445m1;
        long dialogId = d20Var.getDialogId();
        if (dialogId > 0) {
            TLRPC.User c22 = org.telegram.messenger.mp.u1(cVar.f23218a).c2(Long.valueOf(dialogId));
            d20Var.H(null, org.telegram.messenger.fc.m(cVar.f23218a, 0, c22), org.telegram.messenger.fc.m(cVar.f23218a, 1, c22), false);
        }
    }
}
