package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class e10 implements org.telegram.messenger.v10 {
    public final int f45091a;
    public final f40 f45092b;

    public e10(f40 f40Var, int i7) {
        this.f45091a = i7;
        this.f45092b = f40Var;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        TLRPC.Updates updates = (TLRPC.Updates) obj;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
        switch (this.f45091a) {
            case 0:
                f40 f40Var = this.f45092b;
                if (updates != null) {
                    org.telegram.messenger.qp.s1(f40Var.n1.f21770a).O3(updates, false);
                }
                org.telegram.messenger.g0.h3(new v00(f40Var, 9));
                return;
            default:
                f40 f40Var2 = this.f45092b;
                if (updates != null) {
                    org.telegram.messenger.qp.s1(f40Var2.n1.f21770a).O3(updates, false);
                    return;
                } else {
                    f40Var2.getClass();
                    return;
                }
        }
    }
}
