package org.telegram.ui.Components;
public final class aq implements tv0 {
    public final yp f25345a;
    public final cq f25346b;

    public aq(cq cqVar, yp ypVar) {
        this.f25346b = cqVar;
        this.f25345a = ypVar;
    }

    @Override
    public final void i(int i10) {
        cq cqVar = this.f25346b;
        cqVar.f26029r = i10;
        cqVar.p(true);
    }

    @Override
    public final void m() {
        int measuredHeight = this.f25346b.f26025c.getMeasuredHeight();
        yp ypVar = this.f25345a;
        ypVar.y(0 - ypVar.getScrollX(), measuredHeight - ypVar.getScrollY(), false);
    }
}
