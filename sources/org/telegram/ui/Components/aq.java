package org.telegram.ui.Components;
public final class aq implements sv0 {
    public final yp f22451a;
    public final cq f22452b;

    public aq(cq cqVar, yp ypVar) {
        this.f22452b = cqVar;
        this.f22451a = ypVar;
    }

    @Override
    public final void g(int i10) {
        cq cqVar = this.f22452b;
        cqVar.f23123r = i10;
        cqVar.p(true);
    }

    @Override
    public final void l() {
        int measuredHeight = this.f22452b.f23120c.getMeasuredHeight();
        yp ypVar = this.f22451a;
        ypVar.y(0 - ypVar.getScrollX(), measuredHeight - ypVar.getScrollY(), false);
    }
}
