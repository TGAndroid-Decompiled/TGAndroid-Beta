package org.telegram.ui.Wallet;

import org.telegram.messenger.z10;
import org.telegram.tgnet.TLRPC;
public final class t9 implements z10 {
    public final int f44528a;
    public final z9 f44529b;

    public t9(z9 z9Var, int i7) {
        this.f44528a = i7;
        this.f44529b = z9Var;
    }

    @Override
    public final void a(Object obj) {
        ah.i iVar;
        switch (this.f44528a) {
            case 0:
                z9.e0(this.f44529b, (String) obj);
                return;
            default:
                TLRPC.User user = (TLRPC.User) obj;
                z9 z9Var = this.f44529b;
                if (!z9Var.isFinished && (iVar = z9Var.O) != null) {
                    if (user == null) {
                        org.telegram.messenger.g0.h3(new u9(z9Var, 1));
                        return;
                    }
                    org.telegram.messenger.g0.v1(iVar);
                    z9Var.m0(null, user);
                    return;
                }
                return;
        }
    }
}
