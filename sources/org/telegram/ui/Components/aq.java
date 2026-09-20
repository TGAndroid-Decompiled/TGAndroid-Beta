package org.telegram.ui.Components;
public final class aq implements dw0 {
    public final yp f22737a;
    public final cq f22738b;

    public aq(cq cqVar, yp ypVar) {
        this.f22738b = cqVar;
        this.f22737a = ypVar;
    }

    @Override
    public final void g(int i10) {
        cq cqVar = this.f22738b;
        cqVar.f23383r = i10;
        cqVar.p(true);
    }

    @Override
    public final void n() {
        int measuredHeight = this.f22738b.f23380c.getMeasuredHeight();
        yp ypVar = this.f22737a;
        ypVar.y(0 - ypVar.getScrollX(), measuredHeight - ypVar.getScrollY(), false);
    }
}
