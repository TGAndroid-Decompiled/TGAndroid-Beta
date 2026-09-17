package org.telegram.ui.Components;
public final class zp implements rv0 {
    public final xp f33200a;
    public final bq f33201b;

    public zp(bq bqVar, xp xpVar) {
        this.f33201b = bqVar;
        this.f33200a = xpVar;
    }

    @Override
    public final void i(int i10) {
        bq bqVar = this.f33201b;
        bqVar.f24787r = i10;
        bqVar.p(true);
    }

    @Override
    public final void l() {
        int measuredHeight = this.f33201b.f24783c.getMeasuredHeight();
        xp xpVar = this.f33200a;
        xpVar.y(0 - xpVar.getScrollX(), measuredHeight - xpVar.getScrollY(), false);
    }
}
