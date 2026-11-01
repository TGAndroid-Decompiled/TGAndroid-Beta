package org.telegram.ui.Components;
public final class qp implements yu0 {
    public final op f29766a;
    public final sp f29767b;

    public qp(sp spVar, op opVar) {
        this.f29767b = spVar;
        this.f29766a = opVar;
    }

    @Override
    public final void m(int i10) {
        sp spVar = this.f29767b;
        spVar.f30411q1 = i10;
        spVar.J0(true);
    }

    @Override
    public final void r() {
        int measuredHeight = this.f29767b.f30406k1.getMeasuredHeight();
        op opVar = this.f29766a;
        opVar.z(0 - opVar.getScrollX(), measuredHeight - opVar.getScrollY(), false);
    }
}
