package org.telegram.ui;
public final class f71 implements m71 {
    public boolean f45509a;
    public final an f45510b;

    public f71(an anVar, boolean z9) {
        this.f45510b = anVar;
        this.f45509a = z9;
    }

    @Override
    public final boolean a() {
        return this.f45509a;
    }

    @Override
    public final boolean a1() {
        return true;
    }

    @Override
    public final void t1(boolean z9) {
        boolean z10 = !this.f45509a;
        this.f45509a = z10;
        ym ymVar = this.f45510b.f43998xa;
        ymVar.r(ymVar.f52251f, ymVar.f52252g, z9, Boolean.valueOf(z10), false);
    }
}
