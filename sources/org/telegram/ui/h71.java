package org.telegram.ui;
public final class h71 implements p71 {
    public boolean f48211a;
    public final bn f48212b;

    public h71(bn bnVar, boolean z10) {
        this.f48212b = bnVar;
        this.f48211a = z10;
    }

    @Override
    public final boolean Y0() {
        return true;
    }

    @Override
    public final boolean d() {
        return this.f48211a;
    }

    @Override
    public final void l1(boolean z10) {
        boolean z11 = !this.f48211a;
        this.f48211a = z11;
        zm zmVar = this.f48212b.Ba;
        zmVar.r(zmVar.f54538f, zmVar.f54539g, z10, Boolean.valueOf(z11), false);
    }
}
