package org.telegram.ui.Wallet;

import org.telegram.messenger.c20;
import org.telegram.tgnet.TLRPC;
public final class q9 implements c20 {
    public final int f43080a;
    public final w9 f43081b;

    public q9(w9 w9Var, int i7) {
        this.f43080a = i7;
        this.f43081b = w9Var;
    }

    @Override
    public final void a(Object obj) {
        ah.i iVar;
        switch (this.f43080a) {
            case 0:
                w9.e0(this.f43081b, (String) obj);
                return;
            default:
                TLRPC.User user = (TLRPC.User) obj;
                w9 w9Var = this.f43081b;
                if (!w9Var.isFinished && (iVar = w9Var.N) != null) {
                    if (user == null) {
                        org.telegram.messenger.g0.h3(new r9(w9Var, 1));
                        return;
                    }
                    org.telegram.messenger.g0.v1(iVar);
                    w9Var.m0(null, user);
                    return;
                }
                return;
        }
    }
}
