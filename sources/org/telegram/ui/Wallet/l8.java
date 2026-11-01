package org.telegram.ui.Wallet;

import org.telegram.messenger.dd;
import org.telegram.messenger.r20;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.wb;
public final class l8 implements r20 {
    public final int f34872a;
    public final t8 f34873b;

    public l8(t8 t8Var, int i10) {
        this.f34872a = i10;
        this.f34873b = t8Var;
    }

    @Override
    public final void a(Object obj) {
        int i10 = this.f34872a;
        t8 t8Var = this.f34873b;
        switch (i10) {
            case 0:
                k0.x(t8Var.currentAccount).z(new ih.s(26, t8Var, (r20) obj), true, false);
                return;
            case 1:
                String str = (String) obj;
                if (str != null) {
                    cc.a0(t8Var).e0(str, false);
                    return;
                }
                wb I = cc.a0(t8Var).I(2131623989, dd.L0(2131743214, null), dd.L0(2131743212, null));
                I.f32201j = 5000;
                I.j();
                t8Var.f30217a.f31183f3.O(true);
                return;
            default:
                t8.f0(t8Var, (Boolean) obj);
                return;
        }
    }
}
