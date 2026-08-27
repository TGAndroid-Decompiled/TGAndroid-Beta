package org.telegram.ui.Components;

public final class op implements cv0 {

    public final mp f31372a;

    public final qp f31373b;

    public op(qp qpVar, mp mpVar) {
        this.f31373b = qpVar;
        this.f31372a = mpVar;
    }

    @Override
    public final void j(int i10) {
        qp qpVar = this.f31373b;
        qpVar.f31958r = i10;
        qpVar.q(true);
    }

    @Override
    public final void m() {
        int measuredHeight = this.f31373b.f31954c.getMeasuredHeight();
        mp mpVar = this.f31372a;
        mpVar.y(0 - mpVar.getScrollX(), measuredHeight - mpVar.getScrollY(), false);
    }
}
