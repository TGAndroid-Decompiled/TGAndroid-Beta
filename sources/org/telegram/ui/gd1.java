package org.telegram.ui;
public final class gd1 implements nd1 {
    public boolean f36659a;
    public final co f36660b;

    public gd1(co coVar, boolean z10) {
        this.f36660b = coVar;
        this.f36659a = z10;
    }

    @Override
    public final boolean Z0() {
        return true;
    }

    @Override
    public final boolean a() {
        return this.f36659a;
    }

    @Override
    public final void p1(boolean z10) {
        boolean z11 = !this.f36659a;
        this.f36659a = z11;
        ao aoVar = this.f36660b.f35274ea;
        aoVar.i(aoVar.f34517f, aoVar.h, z10, Boolean.valueOf(z11), false);
    }
}
