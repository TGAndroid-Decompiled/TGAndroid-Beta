package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class b10 implements org.telegram.messenger.v10 {
    public final int f44150a;
    public final c40 f44151b;

    public b10(c40 c40Var, int i7) {
        this.f44150a = i7;
        this.f44151b = c40Var;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        TLRPC.Updates updates = (TLRPC.Updates) obj;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
        switch (this.f44150a) {
            case 0:
                c40 c40Var = this.f44151b;
                if (updates != null) {
                    org.telegram.messenger.qp.s1(c40Var.f44586k1.f21723a).O3(updates, false);
                }
                org.telegram.messenger.g0.h3(new s00(c40Var, 9));
                return;
            default:
                c40 c40Var2 = this.f44151b;
                if (updates != null) {
                    org.telegram.messenger.qp.s1(c40Var2.f44586k1.f21723a).O3(updates, false);
                    return;
                } else {
                    c40Var2.getClass();
                    return;
                }
        }
    }
}
