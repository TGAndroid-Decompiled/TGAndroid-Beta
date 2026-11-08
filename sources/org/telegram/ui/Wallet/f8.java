package org.telegram.ui.Wallet;

import org.telegram.messenger.c20;
import org.telegram.messenger.id;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.hc;
public final class f8 implements c20 {
    public final int f42510a;
    public final n8 f42511b;

    public f8(n8 n8Var, int i7) {
        this.f42510a = i7;
        this.f42511b = n8Var;
    }

    @Override
    public final void a(Object obj) {
        int i7 = this.f42510a;
        n8 n8Var = this.f42511b;
        switch (i7) {
            case 0:
                n8.h0(n8Var, (c20) obj);
                return;
            case 1:
                String str = (String) obj;
                if (str != null) {
                    hc.a0(n8Var).e0(str, false);
                    return;
                }
                cc I = hc.a0(n8Var).I(2131623989, id.M0(2131743191, null), id.M0(2131743189, null));
                I.f32545j = 5000;
                I.j();
                n8Var.f36243a.f37190f3.O(true);
                return;
            default:
                n8.f0(n8Var, (Boolean) obj);
                return;
        }
    }
}
