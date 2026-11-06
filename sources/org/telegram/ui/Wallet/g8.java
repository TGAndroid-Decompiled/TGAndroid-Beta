package org.telegram.ui.Wallet;

import org.telegram.messenger.c20;
import org.telegram.messenger.hd;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.hc;
public final class g8 implements c20 {
    public final int f42541a;
    public final o8 f42542b;

    public g8(o8 o8Var, int i7) {
        this.f42541a = i7;
        this.f42542b = o8Var;
    }

    @Override
    public final void a(Object obj) {
        int i7 = this.f42541a;
        o8 o8Var = this.f42542b;
        switch (i7) {
            case 0:
                o8.h0(o8Var, (c20) obj);
                return;
            case 1:
                String str = (String) obj;
                if (str != null) {
                    hc.a0(o8Var).e0(str, false);
                    return;
                }
                cc I = hc.a0(o8Var).I(2131623989, hd.M0(2131743189, null), hd.M0(2131743187, null));
                I.f32527j = 5000;
                I.j();
                o8Var.f35844a.f36781f3.O(true);
                return;
            default:
                o8.f0(o8Var, (Boolean) obj);
                return;
        }
    }
}
