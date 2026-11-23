package org.telegram.ui;

import org.telegram.tgnet.tl.TL_stories;
public final class m61 implements org.telegram.messenger.y10 {
    public final int f49751a;
    public final x71 f49752b;

    public m61(x71 x71Var, int i7) {
        this.f49751a = i7;
        this.f49752b = x71Var;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f49751a) {
            case 0:
                x71 x71Var = this.f49752b;
                x71Var.getClass();
                x71Var.f53682p1 = ((Float) obj).floatValue();
                x71Var.f53706z0.invalidate();
                x71Var.a1();
                return;
            case 1:
                x71 x71Var2 = this.f49752b;
                x71Var2.X1 = (TL_stories.TL_premium_boostsStatus) obj;
                x71Var2.W1 = true;
                x71Var2.m1(true);
                x71Var2.V1 = false;
                return;
            default:
                x71.Z(this.f49752b, (org.telegram.messenger.g3) obj);
                return;
        }
    }
}
