package org.telegram.ui;
public final class f71 implements m71 {
    public boolean f45514a;
    public final an f45515b;

    public f71(an anVar, boolean z9) {
        this.f45515b = anVar;
        this.f45514a = z9;
    }

    @Override
    public final boolean a() {
        return this.f45514a;
    }

    @Override
    public final boolean a1() {
        return true;
    }

    @Override
    public final void t1(boolean z9) {
        boolean z10 = !this.f45514a;
        this.f45514a = z10;
        ym ymVar = this.f45515b.f44023xa;
        ymVar.r(ymVar.f52272f, ymVar.f52273g, z9, Boolean.valueOf(z10), false);
    }
}
