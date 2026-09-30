package org.telegram.ui.Components;
public final class cq implements fw0 {
    public final aq f23362a;
    public final eq f23363b;

    public cq(eq eqVar, aq aqVar) {
        this.f23363b = eqVar;
        this.f23362a = aqVar;
    }

    @Override
    public final void h(int i10) {
        eq eqVar = this.f23363b;
        eqVar.f24043r = i10;
        eqVar.p(true);
    }

    @Override
    public final void n() {
        int measuredHeight = this.f23363b.f24040c.getMeasuredHeight();
        aq aqVar = this.f23362a;
        aqVar.y(0 - aqVar.getScrollX(), measuredHeight - aqVar.getScrollY(), false);
    }
}
