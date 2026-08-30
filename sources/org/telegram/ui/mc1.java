package org.telegram.ui;
public final class mc1 implements tc1 {
    public boolean f36267a;
    public final xn f36268b;

    public mc1(xn xnVar, boolean z4) {
        this.f36268b = xnVar;
        this.f36267a = z4;
    }

    @Override
    public final boolean V0() {
        return true;
    }

    @Override
    public final boolean a() {
        return this.f36267a;
    }

    @Override
    public final void n1(boolean z4) {
        boolean z10 = !this.f36267a;
        this.f36267a = z10;
        vn vnVar = this.f36268b.f39968ba;
        vnVar.i(vnVar.f39218f, vnVar.h, z4, Boolean.valueOf(z10), false);
    }
}
