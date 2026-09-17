package org.telegram.ui.Components;
public final class zp implements rv0 {
    public final xp f33227a;
    public final bq f33228b;

    public zp(bq bqVar, xp xpVar) {
        this.f33228b = bqVar;
        this.f33227a = xpVar;
    }

    @Override
    public final void i(int i10) {
        bq bqVar = this.f33228b;
        bqVar.f24814r = i10;
        bqVar.p(true);
    }

    @Override
    public final void l() {
        int measuredHeight = this.f33228b.f24810c.getMeasuredHeight();
        xp xpVar = this.f33227a;
        xpVar.y(0 - xpVar.getScrollX(), measuredHeight - xpVar.getScrollY(), false);
    }
}
