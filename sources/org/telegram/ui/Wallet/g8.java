package org.telegram.ui.Wallet;

import org.telegram.messenger.hd;
import org.telegram.messenger.z10;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.xb;
public final class g8 implements z10 {
    public final int f43881a;
    public final p8 f43882b;

    public g8(p8 p8Var, int i7) {
        this.f43881a = i7;
        this.f43882b = p8Var;
    }

    @Override
    public final void a(Object obj) {
        int i7 = this.f43881a;
        p8 p8Var = this.f43882b;
        switch (i7) {
            case 0:
                l0.x(p8Var.currentAccount).z(new t1(3, p8Var, (z10) obj), true, false);
                return;
            case 1:
                String str = (String) obj;
                if (str != null) {
                    cc.a0(p8Var).e0(str, false);
                    return;
                }
                xb I = cc.a0(p8Var).I(2131623990, hd.M0(2131743188, null), hd.M0(2131743186, null));
                I.f41643j = 5000;
                I.j();
                p8Var.f38882a.f39895g3.O(true);
                return;
            default:
                p8.f0(p8Var, (Boolean) obj);
                return;
        }
    }
}
