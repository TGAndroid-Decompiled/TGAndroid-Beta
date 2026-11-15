package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class c10 implements org.telegram.messenger.s10 {
    public final int f45870a;
    public final c40 f45871b;

    public c10(c40 c40Var, int i7) {
        this.f45870a = i7;
        this.f45871b = c40Var;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        TLRPC.Updates updates = (TLRPC.Updates) obj;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
        switch (this.f45870a) {
            case 0:
                c40 c40Var = this.f45871b;
                if (updates != null) {
                    org.telegram.messenger.np.s1(c40Var.f45940o1.f22782a).O3(updates, false);
                }
                org.telegram.messenger.g0.h3(new s00(c40Var, 10));
                return;
            default:
                c40 c40Var2 = this.f45871b;
                if (updates != null) {
                    org.telegram.messenger.np.s1(c40Var2.f45940o1.f22782a).O3(updates, false);
                    return;
                } else {
                    c40Var2.getClass();
                    return;
                }
        }
    }
}
