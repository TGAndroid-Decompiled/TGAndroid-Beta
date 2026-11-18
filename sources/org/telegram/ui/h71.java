package org.telegram.ui;
public final class h71 implements p71 {
    public boolean f48274a;
    public final bn f48275b;

    public h71(bn bnVar, boolean z10) {
        this.f48275b = bnVar;
        this.f48274a = z10;
    }

    @Override
    public final boolean Y0() {
        return true;
    }

    @Override
    public final boolean d() {
        return this.f48274a;
    }

    @Override
    public final void l1(boolean z10) {
        boolean z11 = !this.f48274a;
        this.f48274a = z11;
        zm zmVar = this.f48275b.Ba;
        zmVar.r(zmVar.f54537f, zmVar.f54538g, z10, Boolean.valueOf(z11), false);
    }
}
