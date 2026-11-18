package org.telegram.ui.Wallet;

import org.telegram.messenger.gd;
import org.telegram.messenger.x10;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.lc;
public final class v8 implements x10 {
    public final int f45172a;
    public final d9 f45173b;

    public v8(d9 d9Var, int i7) {
        this.f45172a = i7;
        this.f45173b = d9Var;
    }

    @Override
    public final void a(Object obj) {
        int i7 = this.f45172a;
        d9 d9Var = this.f45173b;
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
                gc I = lc.b0(d9Var).I(2131623990, gd.M0(2131742950, null), gd.M0(2131742948, null));
                I.f35461j = 5000;
                I.j();
                d9Var.f33530a.f34607g3.O(true);
                return;
            default:
                d9.d0(d9Var, (Boolean) obj);
                return;
        }
    }
}
