package org.telegram.ui.Components;
public final class aq implements ew0 {
    public final yp f22691a;
    public final cq f22692b;

    public aq(cq cqVar, yp ypVar) {
        this.f22692b = cqVar;
        this.f22691a = ypVar;
    }

    @Override
    public final void h(int i10) {
        cq cqVar = this.f22692b;
        cqVar.f23313r = i10;
        cqVar.p(true);
    }

    @Override
    public final void n() {
        int measuredHeight = this.f22692b.f23310c.getMeasuredHeight();
        yp ypVar = this.f22691a;
        ypVar.y(0 - ypVar.getScrollX(), measuredHeight - ypVar.getScrollY(), false);
    }
}
