package org.telegram.ui;
public final class f71 implements m71 {
    public boolean f45513a;
    public final an f45514b;

    public f71(an anVar, boolean z9) {
        this.f45514b = anVar;
        this.f45513a = z9;
    }

    @Override
    public final boolean a() {
        return this.f45513a;
    }

    @Override
    public final boolean a1() {
        return true;
    }

    @Override
    public final void t1(boolean z9) {
        boolean z10 = !this.f45513a;
        this.f45513a = z10;
        ym ymVar = this.f45514b.f44022xa;
        ymVar.r(ymVar.f52270f, ymVar.f52271g, z9, Boolean.valueOf(z10), false);
    }
}
