package org.telegram.ui;
public final class h71 implements p71 {
    public boolean f48287a;
    public final bn f48288b;

    public h71(bn bnVar, boolean z10) {
        this.f48288b = bnVar;
        this.f48287a = z10;
    }

    @Override
    public final boolean Y0() {
        return true;
    }

    @Override
    public final boolean d() {
        return this.f48287a;
    }

    @Override
    public final void l1(boolean z10) {
        boolean z11 = !this.f48287a;
        this.f48287a = z11;
        zm zmVar = this.f48288b.Ba;
        zmVar.r(zmVar.f54585f, zmVar.f54586g, z10, Boolean.valueOf(z11), false);
    }
}
