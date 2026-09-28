package org.telegram.ui.Components;
public final class cq implements fw0 {
    public final aq f23363a;
    public final eq f23364b;

    public cq(eq eqVar, aq aqVar) {
        this.f23364b = eqVar;
        this.f23363a = aqVar;
    }

    @Override
    public final void h(int i10) {
        eq eqVar = this.f23364b;
        eqVar.f24045r = i10;
        eqVar.p(true);
    }

    @Override
    public final void n() {
        int measuredHeight = this.f23364b.f24042c.getMeasuredHeight();
        aq aqVar = this.f23363a;
        aqVar.y(0 - aqVar.getScrollX(), measuredHeight - aqVar.getScrollY(), false);
    }
}
