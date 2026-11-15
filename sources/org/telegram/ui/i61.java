package org.telegram.ui;

import org.telegram.tgnet.tl.TL_stories;
public final class i61 implements org.telegram.messenger.z10 {
    public final int f47923a;
    public final t71 f47924b;

    public i61(t71 t71Var, int i7) {
        this.f47923a = i7;
        this.f47924b = t71Var;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f47923a) {
            case 0:
                t71 t71Var = this.f47924b;
                t71Var.getClass();
                t71Var.f51454p1 = ((Float) obj).floatValue();
                t71Var.f51478z0.invalidate();
                t71Var.a1();
                return;
            case 1:
                t71 t71Var2 = this.f47924b;
                t71Var2.X1 = (TL_stories.TL_premium_boostsStatus) obj;
                t71Var2.W1 = true;
                t71Var2.m1(true);
                t71Var2.V1 = false;
                return;
            default:
                t71.Z(this.f47924b, (org.telegram.messenger.e3) obj);
                return;
        }
    }
}
