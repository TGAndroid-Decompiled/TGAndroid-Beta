package org.telegram.ui;
public final class f71 implements n71 {
    public boolean f47714a;
    public final bn f47715b;

    public f71(bn bnVar, boolean z10) {
        this.f47715b = bnVar;
        this.f47714a = z10;
    }

    @Override
    public final boolean O0() {
        return true;
    }

    @Override
    public final boolean b() {
        return this.f47714a;
    }

    @Override
    public final void b1(boolean z10) {
        boolean z11 = !this.f47714a;
        this.f47714a = z11;
        zm zmVar = this.f47715b.Ba;
        zmVar.r(zmVar.f54653f, zmVar.f54654g, z10, Boolean.valueOf(z11), false);
    }
}
