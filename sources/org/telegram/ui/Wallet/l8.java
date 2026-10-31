package org.telegram.ui.Wallet;

import org.telegram.messenger.cd;
import org.telegram.messenger.q20;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.wb;
public final class l8 implements q20 {
    public final int f34868a;
    public final t8 f34869b;

    public l8(t8 t8Var, int i10) {
        this.f34868a = i10;
        this.f34869b = t8Var;
    }

    @Override
    public final void a(Object obj) {
        int i10 = this.f34868a;
        t8 t8Var = this.f34869b;
        switch (i10) {
            case 0:
                k0.x(t8Var.currentAccount).z(new ih.s(26, t8Var, (q20) obj), true, false);
                return;
            case 1:
                String str = (String) obj;
                if (str != null) {
                    cc.a0(t8Var).e0(str, false);
                    return;
                }
                wb I = cc.a0(t8Var).I(2131623989, cd.L0(2131743214, null), cd.L0(2131743212, null));
                I.f32135j = 5000;
                I.j();
                t8Var.f29837a.f30819f3.O(true);
                return;
            default:
                t8.e0(t8Var, (Boolean) obj);
                return;
        }
    }
}
