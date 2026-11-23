package org.telegram.ui.Wallet;

import org.telegram.messenger.hd;
import org.telegram.messenger.y10;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.lc;
public final class v8 implements y10 {
    public final int f45182a;
    public final d9 f45183b;

    public v8(d9 d9Var, int i7) {
        this.f45182a = i7;
        this.f45183b = d9Var;
    }

    @Override
    public final void a(Object obj) {
        int i7 = this.f45182a;
        d9 d9Var = this.f45183b;
        switch (i7) {
            case 0:
                d9.h0(d9Var, (y10) obj);
                return;
            case 1:
                String str = (String) obj;
                if (str != null) {
                    lc.b0(d9Var).f0(str, false);
                    return;
                }
                gc I = lc.b0(d9Var).I(2131623990, hd.N0(2131742944, null), hd.N0(2131742942, null));
                I.f35489j = 5000;
                I.j();
                d9Var.f34671a.f35742g3.O(true);
                return;
            default:
                d9.d0(d9Var, (Boolean) obj);
                return;
        }
    }
}
