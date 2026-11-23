package org.telegram.ui;
public final class h71 implements p71 {
    public boolean f48291a;
    public final bn f48292b;

    public h71(bn bnVar, boolean z10) {
        this.f48292b = bnVar;
        this.f48291a = z10;
    }

    @Override
    public final boolean Y0() {
        return true;
    }

    @Override
    public final boolean d() {
        return this.f48291a;
    }

    @Override
    public final void l1(boolean z10) {
        boolean z11 = !this.f48291a;
        this.f48291a = z11;
        zm zmVar = this.f48292b.Ba;
        zmVar.r(zmVar.f54589f, zmVar.f54590g, z10, Boolean.valueOf(z11), false);
    }
}
