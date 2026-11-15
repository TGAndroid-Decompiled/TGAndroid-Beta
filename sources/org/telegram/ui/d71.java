package org.telegram.ui;
public final class d71 implements l71 {
    public boolean f46331a;
    public final an f46332b;

    public d71(an anVar, boolean z10) {
        this.f46332b = anVar;
        this.f46331a = z10;
    }

    @Override
    public final boolean Y0() {
        return true;
    }

    @Override
    public final boolean a() {
        return this.f46331a;
    }

    @Override
    public final void m1(boolean z10) {
        boolean z11 = !this.f46331a;
        this.f46331a = z11;
        ym ymVar = this.f46332b.Aa;
        ymVar.r(ymVar.f53545f, ymVar.f53546g, z10, Boolean.valueOf(z11), false);
    }
}
