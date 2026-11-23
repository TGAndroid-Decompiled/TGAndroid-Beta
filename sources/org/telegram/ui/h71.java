package org.telegram.ui;
public final class h71 implements p71 {
    public boolean f48254a;
    public final bn f48255b;

    public h71(bn bnVar, boolean z10) {
        this.f48255b = bnVar;
        this.f48254a = z10;
    }

    @Override
    public final boolean Y0() {
        return true;
    }

    @Override
    public final boolean d() {
        return this.f48254a;
    }

    @Override
    public final void l1(boolean z10) {
        boolean z11 = !this.f48254a;
        this.f48254a = z11;
        zm zmVar = this.f48255b.Ba;
        zmVar.r(zmVar.f54552f, zmVar.f54553g, z10, Boolean.valueOf(z11), false);
    }
}
