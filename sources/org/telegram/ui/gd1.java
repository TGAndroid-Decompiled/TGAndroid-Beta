package org.telegram.ui;
public final class gd1 implements nd1 {
    public boolean f36660a;
    public final co f36661b;

    public gd1(co coVar, boolean z10) {
        this.f36661b = coVar;
        this.f36660a = z10;
    }

    @Override
    public final boolean Z0() {
        return true;
    }

    @Override
    public final boolean a() {
        return this.f36660a;
    }

    @Override
    public final void p1(boolean z10) {
        boolean z11 = !this.f36660a;
        this.f36660a = z11;
        ao aoVar = this.f36661b.f35275ea;
        aoVar.i(aoVar.f34518f, aoVar.h, z10, Boolean.valueOf(z11), false);
    }
}
