package org.telegram.ui.Components;
public final class cq implements ew0 {
    public final aq f23374a;
    public final eq f23375b;

    public cq(eq eqVar, aq aqVar) {
        this.f23375b = eqVar;
        this.f23374a = aqVar;
    }

    @Override
    public final void h(int i10) {
        eq eqVar = this.f23375b;
        eqVar.f24036r = i10;
        eqVar.p(true);
    }

    @Override
    public final void n() {
        int measuredHeight = this.f23375b.f24033c.getMeasuredHeight();
        aq aqVar = this.f23374a;
        aqVar.y(0 - aqVar.getScrollX(), measuredHeight - aqVar.getScrollY(), false);
    }
}
