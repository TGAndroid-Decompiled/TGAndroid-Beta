package org.telegram.ui;

import org.telegram.tgnet.tl.TL_stories;
public final class l61 implements org.telegram.messenger.c20 {
    public final int f47428a;
    public final u71 f47429b;

    public l61(u71 u71Var, int i7) {
        this.f47428a = i7;
        this.f47429b = u71Var;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f47428a) {
            case 0:
                u71 u71Var = this.f47429b;
                u71Var.getClass();
                u71Var.f50286o1 = ((Float) obj).floatValue();
                u71Var.f50310y0.invalidate();
                u71Var.a1();
                return;
            case 1:
                u71 u71Var2 = this.f47429b;
                u71Var2.W1 = (TL_stories.TL_premium_boostsStatus) obj;
                u71Var2.V1 = true;
                u71Var2.m1(true);
                u71Var2.U1 = false;
                return;
            default:
                u71.Z(this.f47429b, (org.telegram.messenger.e3) obj);
                return;
        }
    }
}
