package org.telegram.ui;
public final class i71 implements p71 {
    public boolean f46525a;
    public final cn f46526b;

    public i71(cn cnVar, boolean z9) {
        this.f46526b = cnVar;
        this.f46525a = z9;
    }

    @Override
    public final boolean a() {
        return this.f46525a;
    }

    @Override
    public final boolean a1() {
        return true;
    }

    @Override
    public final void t1(boolean z9) {
        boolean z10 = !this.f46525a;
        this.f46525a = z10;
        an anVar = this.f46526b.f44750za;
        anVar.r(anVar.f43729f, anVar.f43730g, z9, Boolean.valueOf(z10), false);
    }
}
