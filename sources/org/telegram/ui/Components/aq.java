package org.telegram.ui.Components;
public final class aq implements fw0 {
    public final yp f22709a;
    public final cq f22710b;

    public aq(cq cqVar, yp ypVar) {
        this.f22710b = cqVar;
        this.f22709a = ypVar;
    }

    @Override
    public final void g(int i10) {
        cq cqVar = this.f22710b;
        cqVar.f23426r = i10;
        cqVar.p(true);
    }

    @Override
    public final void l() {
        int measuredHeight = this.f22710b.f23423c.getMeasuredHeight();
        yp ypVar = this.f22709a;
        ypVar.y(0 - ypVar.getScrollX(), measuredHeight - ypVar.getScrollY(), false);
    }
}
