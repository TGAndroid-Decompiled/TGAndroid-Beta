package org.telegram.ui;

import org.telegram.tgnet.tl.TL_stories;
public final class b61 implements org.telegram.messenger.u10 {
    public final int f43938a;
    public final l71 f43939b;

    public b61(l71 l71Var, int i3) {
        this.f43938a = i3;
        this.f43939b = l71Var;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f43938a) {
            case 0:
                l71 l71Var = this.f43939b;
                l71Var.getClass();
                l71Var.f47186p1 = ((Float) obj).floatValue();
                l71Var.f47210z0.invalidate();
                l71Var.a1();
                return;
            case 1:
                l71 l71Var2 = this.f43939b;
                l71Var2.X1 = (TL_stories.TL_premium_boostsStatus) obj;
                l71Var2.W1 = true;
                l71Var2.m1(true);
                l71Var2.V1 = false;
                return;
            default:
                l71.Z(this.f43939b, (org.telegram.messenger.e3) obj);
                return;
        }
    }
}
