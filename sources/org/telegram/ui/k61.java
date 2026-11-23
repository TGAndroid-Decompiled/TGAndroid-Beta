package org.telegram.ui;

import org.telegram.tgnet.tl.TL_stories;
public final class k61 implements org.telegram.messenger.w10 {
    public final int f49352a;
    public final v71 f49353b;

    public k61(v71 v71Var, int i7) {
        this.f49352a = i7;
        this.f49353b = v71Var;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f49352a) {
            case 0:
                v71 v71Var = this.f49353b;
                v71Var.getClass();
                v71Var.f52890p1 = ((Float) obj).floatValue();
                v71Var.f52914z0.invalidate();
                v71Var.a1();
                return;
            case 1:
                v71 v71Var2 = this.f49353b;
                v71Var2.X1 = (TL_stories.TL_premium_boostsStatus) obj;
                v71Var2.W1 = true;
                v71Var2.m1(true);
                v71Var2.V1 = false;
                return;
            default:
                v71.Z(this.f49353b, (org.telegram.messenger.g3) obj);
                return;
        }
    }
}
