package org.telegram.ui.Components;
public final class aq implements tv0 {
    public final yp f22457a;
    public final cq f22458b;

    public aq(cq cqVar, yp ypVar) {
        this.f22458b = cqVar;
        this.f22457a = ypVar;
    }

    @Override
    public final void g(int i10) {
        cq cqVar = this.f22458b;
        cqVar.f23120r = i10;
        cqVar.p(true);
    }

    @Override
    public final void l() {
        int measuredHeight = this.f22458b.f23117c.getMeasuredHeight();
        yp ypVar = this.f22457a;
        ypVar.y(0 - ypVar.getScrollX(), measuredHeight - ypVar.getScrollY(), false);
    }
}
