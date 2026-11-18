package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class f10 implements org.telegram.messenger.q10 {
    public final int f47378a;
    public final f40 f47379b;

    public f10(f40 f40Var, int i7) {
        this.f47378a = i7;
        this.f47379b = f40Var;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        TLRPC.Updates updates = (TLRPC.Updates) obj;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
        switch (this.f47378a) {
            case 0:
                f40 f40Var = this.f47379b;
                if (updates != null) {
                    org.telegram.messenger.mp.u1(f40Var.f47454o1.f23218a).V3(updates, false);
                }
                org.telegram.messenger.g0.g3(new v00(f40Var, 10));
                return;
            default:
                f40 f40Var2 = this.f47379b;
                if (updates != null) {
                    org.telegram.messenger.mp.u1(f40Var2.f47454o1.f23218a).V3(updates, false);
                    return;
                } else {
                    f40Var2.getClass();
                    return;
                }
        }
    }
}
