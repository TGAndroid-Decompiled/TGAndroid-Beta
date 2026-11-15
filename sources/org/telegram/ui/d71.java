package org.telegram.ui;
public final class d71 implements l71 {
    public boolean f46303a;
    public final an f46304b;

    public d71(an anVar, boolean z10) {
        this.f46304b = anVar;
        this.f46303a = z10;
    }

    @Override
    public final boolean Y0() {
        return true;
    }

    @Override
    public final boolean a() {
        return this.f46303a;
    }

    @Override
    public final void m1(boolean z10) {
        boolean z11 = !this.f46303a;
        this.f46303a = z11;
        ym ymVar = this.f46304b.Aa;
        ymVar.r(ymVar.f53545f, ymVar.f53546g, z10, Boolean.valueOf(z11), false);
    }
}
