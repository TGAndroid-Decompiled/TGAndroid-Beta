package org.telegram.ui.Components;
public final class cq implements fw0 {
    public final aq f23380a;
    public final eq f23381b;

    public cq(eq eqVar, aq aqVar) {
        this.f23381b = eqVar;
        this.f23380a = aqVar;
    }

    @Override
    public final void h(int i10) {
        eq eqVar = this.f23381b;
        eqVar.f24106r = i10;
        eqVar.p(true);
    }

    @Override
    public final void n() {
        int measuredHeight = this.f23381b.f24103c.getMeasuredHeight();
        aq aqVar = this.f23380a;
        aqVar.y(0 - aqVar.getScrollX(), measuredHeight - aqVar.getScrollY(), false);
    }
}
