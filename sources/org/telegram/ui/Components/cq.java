package org.telegram.ui.Components;
public final class cq implements fw0 {
    public final aq f23364a;
    public final eq f23365b;

    public cq(eq eqVar, aq aqVar) {
        this.f23365b = eqVar;
        this.f23364a = aqVar;
    }

    @Override
    public final void h(int i10) {
        eq eqVar = this.f23365b;
        eqVar.f24046r = i10;
        eqVar.p(true);
    }

    @Override
    public final void n() {
        int measuredHeight = this.f23365b.f24043c.getMeasuredHeight();
        aq aqVar = this.f23364a;
        aqVar.y(0 - aqVar.getScrollX(), measuredHeight - aqVar.getScrollY(), false);
    }
}
