package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class b20 implements org.telegram.messenger.k20 {
    public final int f35917a;
    public final a50 f35918b;

    public b20(a50 a50Var, int i10) {
        this.f35917a = i10;
        this.f35918b = a50Var;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        TLRPC.Updates updates = (TLRPC.Updates) obj;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
        switch (this.f35917a) {
            case 0:
                a50 a50Var = this.f35918b;
                if (updates != null) {
                    org.telegram.messenger.wp.r1(a50Var.f35620k1.f15043a).L3(updates, false);
                }
                org.telegram.messenger.i0.g3(new s10(a50Var, 10));
                return;
            default:
                a50 a50Var2 = this.f35918b;
                if (updates != null) {
                    org.telegram.messenger.wp.r1(a50Var2.f35620k1.f15043a).L3(updates, false);
                    return;
                } else {
                    a50Var2.getClass();
                    return;
                }
        }
    }
}
