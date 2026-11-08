package org.telegram.ui;
public final class g71 implements n71 {
    public boolean f45892a;
    public final an f45893b;

    public g71(an anVar, boolean z9) {
        this.f45893b = anVar;
        this.f45892a = z9;
    }

    @Override
    public final boolean a() {
        return this.f45892a;
    }

    @Override
    public final boolean a1() {
        return true;
    }

    @Override
    public final void t1(boolean z9) {
        boolean z10 = !this.f45892a;
        this.f45892a = z10;
        ym ymVar = this.f45893b.f44028xa;
        ymVar.r(ymVar.f52250f, ymVar.f52251g, z9, Boolean.valueOf(z10), false);
    }
}
