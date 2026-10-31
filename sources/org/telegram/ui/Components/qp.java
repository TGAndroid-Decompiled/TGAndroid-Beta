package org.telegram.ui.Components;
public final class qp implements xu0 {
    public final op f29714a;
    public final sp f29715b;

    public qp(sp spVar, op opVar) {
        this.f29715b = spVar;
        this.f29714a = opVar;
    }

    @Override
    public final void m(int i10) {
        sp spVar = this.f29715b;
        spVar.f30314q1 = i10;
        spVar.J0(true);
    }

    @Override
    public final void s() {
        int measuredHeight = this.f29715b.f30309k1.getMeasuredHeight();
        op opVar = this.f29714a;
        opVar.z(0 - opVar.getScrollX(), measuredHeight - opVar.getScrollY(), false);
    }
}
