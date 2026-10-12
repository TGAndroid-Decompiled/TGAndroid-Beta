package org.telegram.ui.Components;
public final class nq implements rw0 {
    public final lq f27695a;
    public final pq f27696b;

    public nq(pq pqVar, lq lqVar) {
        this.f27696b = pqVar;
        this.f27695a = lqVar;
    }

    @Override
    public final void f(int i10) {
        pq pqVar = this.f27696b;
        pqVar.f28404r = i10;
        pqVar.r(true);
    }

    @Override
    public final void m() {
        int measuredHeight = this.f27696b.f28401c.getMeasuredHeight();
        lq lqVar = this.f27695a;
        lqVar.y(0 - lqVar.getScrollX(), measuredHeight - lqVar.getScrollY(), false);
    }
}
