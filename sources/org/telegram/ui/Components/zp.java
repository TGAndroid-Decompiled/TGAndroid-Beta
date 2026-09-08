package org.telegram.ui.Components;
public final class zp implements rv0 {
    public final xp f33226a;
    public final bq f33227b;

    public zp(bq bqVar, xp xpVar) {
        this.f33227b = bqVar;
        this.f33226a = xpVar;
    }

    @Override
    public final void i(int i10) {
        bq bqVar = this.f33227b;
        bqVar.f24813r = i10;
        bqVar.p(true);
    }

    @Override
    public final void l() {
        int measuredHeight = this.f33227b.f24809c.getMeasuredHeight();
        xp xpVar = this.f33226a;
        xpVar.y(0 - xpVar.getScrollX(), measuredHeight - xpVar.getScrollY(), false);
    }
}
