package org.telegram.ui.Wallet;

import org.telegram.messenger.c20;
import org.telegram.messenger.id;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.hc;
public final class e8 implements c20 {
    public final int f42426a;
    public final m8 f42427b;

    public e8(m8 m8Var, int i7) {
        this.f42426a = i7;
        this.f42427b = m8Var;
    }

    @Override
    public final void a(Object obj) {
        int i7 = this.f42426a;
        m8 m8Var = this.f42427b;
        switch (i7) {
            case 0:
                m8.h0(m8Var, (c20) obj);
                return;
            case 1:
                String str = (String) obj;
                if (str != null) {
                    hc.a0(m8Var).e0(str, false);
                    return;
                }
                cc I = hc.a0(m8Var).I(2131623989, id.M0(2131743188, null), id.M0(2131743186, null));
                I.f32627j = 5000;
                I.j();
                m8Var.f36649a.f37556f3.O(true);
                return;
            default:
                m8.f0(m8Var, (Boolean) obj);
                return;
        }
    }
}
