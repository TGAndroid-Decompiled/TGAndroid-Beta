package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class e10 implements org.telegram.messenger.p10 {
    public final int f47291a;
    public final e40 f47292b;

    public e10(e40 e40Var, int i7) {
        this.f47291a = i7;
        this.f47292b = e40Var;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        TLRPC.Updates updates = (TLRPC.Updates) obj;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
        switch (this.f47291a) {
            case 0:
                e40 e40Var = this.f47292b;
                if (updates != null) {
                    org.telegram.messenger.mp.u1(e40Var.f47376o1.f23343a).V3(updates, false);
                }
                org.telegram.messenger.g0.g3(new u00(e40Var, 10));
                return;
            default:
                e40 e40Var2 = this.f47292b;
                if (updates != null) {
                    org.telegram.messenger.mp.u1(e40Var2.f47376o1.f23343a).V3(updates, false);
                    return;
                } else {
                    e40Var2.getClass();
                    return;
                }
        }
    }
}
