package org.telegram.ui;
public final class h71 implements o71 {
    public boolean f46187a;
    public final cn f46188b;

    public h71(cn cnVar, boolean z9) {
        this.f46188b = cnVar;
        this.f46187a = z9;
    }

    @Override
    public final boolean a() {
        return this.f46187a;
    }

    @Override
    public final boolean a1() {
        return true;
    }

    @Override
    public final void t1(boolean z9) {
        boolean z10 = !this.f46187a;
        this.f46187a = z10;
        an anVar = this.f46188b.f44709za;
        anVar.r(anVar.f43729f, anVar.f43730g, z9, Boolean.valueOf(z10), false);
    }
}
