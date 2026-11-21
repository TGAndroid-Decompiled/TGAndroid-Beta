package org.telegram.ui.Wallet;

import org.telegram.messenger.gd;
import org.telegram.messenger.x10;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.lc;
public final class v8 implements x10 {
    public final int f45213a;
    public final d9 f45214b;

    public v8(d9 d9Var, int i7) {
        this.f45213a = i7;
        this.f45214b = d9Var;
    }

    @Override
    public final void a(Object obj) {
        int i7 = this.f45213a;
        d9 d9Var = this.f45214b;
        switch (i7) {
            case 0:
                d9.h0(d9Var, (x10) obj);
                return;
            case 1:
                String str = (String) obj;
                if (str != null) {
                    lc.b0(d9Var).f0(str, false);
                    return;
                }
                gc I = lc.b0(d9Var).I(2131623990, gd.N0(2131742944, null), gd.N0(2131742942, null));
                I.f35508j = 5000;
                I.j();
                d9Var.f34683a.f35796g3.O(true);
                return;
            default:
                d9.d0(d9Var, (Boolean) obj);
                return;
        }
    }
}
