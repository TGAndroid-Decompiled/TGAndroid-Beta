package org.telegram.ui.Components;
public final class aq implements gu0 {
    public final yp f33600a;
    public final cq f33601b;

    public aq(cq cqVar, yp ypVar) {
        this.f33601b = cqVar;
        this.f33600a = ypVar;
    }

    @Override
    public final void k(int i7) {
        cq cqVar = this.f33601b;
        cqVar.f34277u1 = i7;
        cqVar.K0(true);
    }

    @Override
    public final void o() {
        int measuredHeight = this.f33601b.f34271o1.getMeasuredHeight();
        yp ypVar = this.f33600a;
        ypVar.z(0 - ypVar.getScrollX(), measuredHeight - ypVar.getScrollY(), false);
    }
}
