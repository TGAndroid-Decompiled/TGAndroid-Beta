package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class d10 implements org.telegram.messenger.v10 {
    public final int f44793a;
    public final e40 f44794b;

    public d10(e40 e40Var, int i7) {
        this.f44793a = i7;
        this.f44794b = e40Var;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        TLRPC.Updates updates = (TLRPC.Updates) obj;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
        switch (this.f44793a) {
            case 0:
                e40 e40Var = this.f44794b;
                if (updates != null) {
                    org.telegram.messenger.qp.s1(e40Var.f45228k1.f21765a).O3(updates, false);
                }
                org.telegram.messenger.g0.h3(new u00(e40Var, 9));
                return;
            default:
                e40 e40Var2 = this.f44794b;
                if (updates != null) {
                    org.telegram.messenger.qp.s1(e40Var2.f45228k1.f21765a).O3(updates, false);
                    return;
                } else {
                    e40Var2.getClass();
                    return;
                }
        }
    }
}
