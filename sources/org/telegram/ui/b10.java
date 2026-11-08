package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class b10 implements org.telegram.messenger.v10 {
    public final int f44155a;
    public final c40 f44156b;

    public b10(c40 c40Var, int i7) {
        this.f44155a = i7;
        this.f44156b = c40Var;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        TLRPC.Updates updates = (TLRPC.Updates) obj;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
        switch (this.f44155a) {
            case 0:
                c40 c40Var = this.f44156b;
                if (updates != null) {
                    org.telegram.messenger.qp.s1(c40Var.f44588k1.f21765a).O3(updates, false);
                }
                org.telegram.messenger.g0.h3(new s00(c40Var, 9));
                return;
            default:
                c40 c40Var2 = this.f44156b;
                if (updates != null) {
                    org.telegram.messenger.qp.s1(c40Var2.f44588k1.f21765a).O3(updates, false);
                    return;
                } else {
                    c40Var2.getClass();
                    return;
                }
        }
    }
}
