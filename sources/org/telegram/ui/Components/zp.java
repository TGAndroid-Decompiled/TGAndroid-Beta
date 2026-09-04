package org.telegram.ui.Components;
public final class zp implements rv0 {
    public final xp f33199a;
    public final bq f33200b;

    public zp(bq bqVar, xp xpVar) {
        this.f33200b = bqVar;
        this.f33199a = xpVar;
    }

    @Override
    public final void i(int i10) {
        bq bqVar = this.f33200b;
        bqVar.f24786r = i10;
        bqVar.p(true);
    }

    @Override
    public final void l() {
        int measuredHeight = this.f33200b.f24782c.getMeasuredHeight();
        xp xpVar = this.f33199a;
        xpVar.y(0 - xpVar.getScrollX(), measuredHeight - xpVar.getScrollY(), false);
    }
}
