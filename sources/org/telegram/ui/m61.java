package org.telegram.ui;

import org.telegram.tgnet.tl.TL_stories;
public final class m61 implements org.telegram.messenger.y10 {
    public final int f49778a;
    public final x71 f49779b;

    public m61(x71 x71Var, int i7) {
        this.f49778a = i7;
        this.f49779b = x71Var;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f49778a) {
            case 0:
                x71 x71Var = this.f49779b;
                x71Var.getClass();
                x71Var.f53760p1 = ((Float) obj).floatValue();
                x71Var.f53784z0.invalidate();
                x71Var.a1();
                return;
            case 1:
                x71 x71Var2 = this.f49779b;
                x71Var2.X1 = (TL_stories.TL_premium_boostsStatus) obj;
                x71Var2.W1 = true;
                x71Var2.m1(true);
                x71Var2.V1 = false;
                return;
            default:
                x71.Z(this.f49779b, (org.telegram.messenger.g3) obj);
                return;
        }
    }
}
