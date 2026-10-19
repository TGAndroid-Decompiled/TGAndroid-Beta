package org.telegram.ui.Components;
public final class kq implements nw0 {
    public final iq f27933a;
    public final mq f27934b;

    public kq(mq mqVar, iq iqVar) {
        this.f27934b = mqVar;
        this.f27933a = iqVar;
    }

    @Override
    public final void h(int i10) {
        mq mqVar = this.f27934b;
        mqVar.f28585r = i10;
        mqVar.q(true);
    }

    @Override
    public final void m() {
        int measuredHeight = this.f27934b.f28582c.getMeasuredHeight();
        iq iqVar = this.f27933a;
        iqVar.y(0 - iqVar.getScrollX(), measuredHeight - iqVar.getScrollY(), false);
    }
}
