package org.telegram.ui.Wallet;

import org.telegram.messenger.c20;
import org.telegram.tgnet.TLRPC;
public final class p9 implements c20 {
    public final int f42998a;
    public final v9 f42999b;

    public p9(v9 v9Var, int i7) {
        this.f42998a = i7;
        this.f42999b = v9Var;
    }

    @Override
    public final void a(Object obj) {
        ah.i iVar;
        switch (this.f42998a) {
            case 0:
                v9.e0(this.f42999b, (String) obj);
                return;
            default:
                TLRPC.User user = (TLRPC.User) obj;
                v9 v9Var = this.f42999b;
                if (!v9Var.isFinished && (iVar = v9Var.N) != null) {
                    if (user == null) {
                        org.telegram.messenger.g0.h3(new q9(v9Var, 1));
                        return;
                    }
                    org.telegram.messenger.g0.v1(iVar);
                    v9Var.m0(null, user);
                    return;
                }
                return;
        }
    }
}
