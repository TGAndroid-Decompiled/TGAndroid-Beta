package org.telegram.ui.Components;
public final class aq implements gu0 {
    public final yp f33584a;
    public final cq f33585b;

    public aq(cq cqVar, yp ypVar) {
        this.f33585b = cqVar;
        this.f33584a = ypVar;
    }

    @Override
    public final void k(int i7) {
        cq cqVar = this.f33585b;
        cqVar.f34245u1 = i7;
        cqVar.K0(true);
    }

    @Override
    public final void o() {
        int measuredHeight = this.f33585b.f34239o1.getMeasuredHeight();
        yp ypVar = this.f33584a;
        ypVar.z(0 - ypVar.getScrollX(), measuredHeight - ypVar.getScrollY(), false);
    }
}
