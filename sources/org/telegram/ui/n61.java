package org.telegram.ui;

import org.telegram.tgnet.tl.TL_stories;
public final class n61 implements org.telegram.messenger.c20 {
    public final int f48151a;
    public final x71 f48152b;

    public n61(x71 x71Var, int i7) {
        this.f48151a = i7;
        this.f48152b = x71Var;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f48151a) {
            case 0:
                x71 x71Var = this.f48152b;
                x71Var.getClass();
                x71Var.f51603o1 = ((Float) obj).floatValue();
                x71Var.f51627y0.invalidate();
                x71Var.a1();
                return;
            case 1:
                x71 x71Var2 = this.f48152b;
                x71Var2.W1 = (TL_stories.TL_premium_boostsStatus) obj;
                x71Var2.V1 = true;
                x71Var2.m1(true);
                x71Var2.U1 = false;
                return;
            default:
                x71.Z(this.f48152b, (org.telegram.messenger.e3) obj);
                return;
        }
    }
}
