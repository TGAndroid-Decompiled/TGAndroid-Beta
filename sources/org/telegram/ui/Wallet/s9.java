package org.telegram.ui.Wallet;

import org.telegram.messenger.c20;
import org.telegram.tgnet.TLRPC;
public final class s9 implements c20 {
    public final int f43170a;
    public final y9 f43171b;

    public s9(y9 y9Var, int i7) {
        this.f43170a = i7;
        this.f43171b = y9Var;
    }

    @Override
    public final void a(Object obj) {
        ah.i iVar;
        switch (this.f43170a) {
            case 0:
                y9.e0(this.f43171b, (String) obj);
                return;
            default:
                TLRPC.User user = (TLRPC.User) obj;
                y9 y9Var = this.f43171b;
                if (!y9Var.isFinished && (iVar = y9Var.N) != null) {
                    if (user == null) {
                        org.telegram.messenger.g0.h3(new t9(y9Var, 1));
                        return;
                    }
                    org.telegram.messenger.g0.v1(iVar);
                    y9Var.m0(null, user);
                    return;
                }
                return;
        }
    }
}
