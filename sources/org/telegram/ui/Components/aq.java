package org.telegram.ui.Components;
public final class aq implements gu0 {
    public final yp f33587a;
    public final cq f33588b;

    public aq(cq cqVar, yp ypVar) {
        this.f33588b = cqVar;
        this.f33587a = ypVar;
    }

    @Override
    public final void k(int i7) {
        cq cqVar = this.f33588b;
        cqVar.f34283u1 = i7;
        cqVar.K0(true);
    }

    @Override
    public final void o() {
        int measuredHeight = this.f33588b.f34277o1.getMeasuredHeight();
        yp ypVar = this.f33587a;
        ypVar.z(0 - ypVar.getScrollX(), measuredHeight - ypVar.getScrollY(), false);
    }
}
