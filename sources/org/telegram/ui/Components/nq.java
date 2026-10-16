package org.telegram.ui.Components;
public final class nq implements rw0 {
    public final lq f27383a;
    public final pq f27384b;

    public nq(pq pqVar, lq lqVar) {
        this.f27384b = pqVar;
        this.f27383a = lqVar;
    }

    @Override
    public final void h(int i10) {
        pq pqVar = this.f27384b;
        pqVar.f28093r = i10;
        pqVar.r(true);
    }

    @Override
    public final void m() {
        int measuredHeight = this.f27384b.f28090c.getMeasuredHeight();
        lq lqVar = this.f27383a;
        lqVar.y(0 - lqVar.getScrollX(), measuredHeight - lqVar.getScrollY(), false);
    }
}
