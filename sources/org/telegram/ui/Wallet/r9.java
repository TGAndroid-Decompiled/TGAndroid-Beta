package org.telegram.ui.Wallet;

import org.telegram.messenger.c20;
import org.telegram.tgnet.TLRPC;
public final class r9 implements c20 {
    public final int f43087a;
    public final x9 f43088b;

    public r9(x9 x9Var, int i7) {
        this.f43087a = i7;
        this.f43088b = x9Var;
    }

    @Override
    public final void a(Object obj) {
        ah.i iVar;
        switch (this.f43087a) {
            case 0:
                x9.e0(this.f43088b, (String) obj);
                return;
            default:
                TLRPC.User user = (TLRPC.User) obj;
                x9 x9Var = this.f43088b;
                if (!x9Var.isFinished && (iVar = x9Var.N) != null) {
                    if (user == null) {
                        org.telegram.messenger.g0.h3(new s9(x9Var, 1));
                        return;
                    }
                    org.telegram.messenger.g0.v1(iVar);
                    x9Var.m0(null, user);
                    return;
                }
                return;
        }
    }
}
