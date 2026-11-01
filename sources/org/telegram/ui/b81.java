package org.telegram.ui;

import org.telegram.tgnet.tl.TL_stories;
public final class b81 implements org.telegram.messenger.r20 {
    public final int f35997a;
    public final k91 f35998b;

    public b81(k91 k91Var, int i10) {
        this.f35997a = i10;
        this.f35998b = k91Var;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f35997a) {
            case 0:
                k91 k91Var = this.f35998b;
                k91Var.getClass();
                k91Var.f38754o1 = ((Float) obj).floatValue();
                k91Var.f38778y0.invalidate();
                k91Var.a1();
                return;
            case 1:
                k91 k91Var2 = this.f35998b;
                k91Var2.W1 = (TL_stories.TL_premium_boostsStatus) obj;
                k91Var2.V1 = true;
                k91Var2.m1(true);
                k91Var2.U1 = false;
                return;
            default:
                k91.Z(this.f35998b, (org.telegram.messenger.h3) obj);
                return;
        }
    }
}
