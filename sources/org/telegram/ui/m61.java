package org.telegram.ui;

import org.telegram.tgnet.tl.TL_stories;
public final class m61 implements org.telegram.messenger.c20 {
    public final int f47782a;
    public final w71 f47783b;

    public m61(w71 w71Var, int i7) {
        this.f47782a = i7;
        this.f47783b = w71Var;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f47782a) {
            case 0:
                w71 w71Var = this.f47783b;
                w71Var.getClass();
                w71Var.f50944o1 = ((Float) obj).floatValue();
                w71Var.f50968y0.invalidate();
                w71Var.a1();
                return;
            case 1:
                w71 w71Var2 = this.f47783b;
                w71Var2.W1 = (TL_stories.TL_premium_boostsStatus) obj;
                w71Var2.V1 = true;
                w71Var2.m1(true);
                w71Var2.U1 = false;
                return;
            default:
                w71.Z(this.f47783b, (org.telegram.messenger.e3) obj);
                return;
        }
    }
}
