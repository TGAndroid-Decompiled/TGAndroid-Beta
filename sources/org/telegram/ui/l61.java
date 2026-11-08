package org.telegram.ui;

import org.telegram.tgnet.tl.TL_stories;
public final class l61 implements org.telegram.messenger.c20 {
    public final int f47459a;
    public final v71 f47460b;

    public l61(v71 v71Var, int i7) {
        this.f47459a = i7;
        this.f47460b = v71Var;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f47459a) {
            case 0:
                v71 v71Var = this.f47460b;
                v71Var.getClass();
                v71Var.f50562o1 = ((Float) obj).floatValue();
                v71Var.f50586y0.invalidate();
                v71Var.a1();
                return;
            case 1:
                v71 v71Var2 = this.f47460b;
                v71Var2.W1 = (TL_stories.TL_premium_boostsStatus) obj;
                v71Var2.V1 = true;
                v71Var2.m1(true);
                v71Var2.U1 = false;
                return;
            default:
                v71.Z(this.f47460b, (org.telegram.messenger.e3) obj);
                return;
        }
    }
}
