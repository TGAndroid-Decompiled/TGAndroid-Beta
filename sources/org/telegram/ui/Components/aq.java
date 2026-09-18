package org.telegram.ui.Components;
public final class aq implements tv0 {
    public final yp f22460a;
    public final cq f22461b;

    public aq(cq cqVar, yp ypVar) {
        this.f22461b = cqVar;
        this.f22460a = ypVar;
    }

    @Override
    public final void g(int i10) {
        cq cqVar = this.f22461b;
        cqVar.f23123r = i10;
        cqVar.p(true);
    }

    @Override
    public final void l() {
        int measuredHeight = this.f22461b.f23120c.getMeasuredHeight();
        yp ypVar = this.f22460a;
        ypVar.y(0 - ypVar.getScrollX(), measuredHeight - ypVar.getScrollY(), false);
    }
}
