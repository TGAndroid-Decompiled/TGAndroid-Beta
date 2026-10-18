package org.telegram.ui.Components;
public final class kq implements mw0 {
    public final iq f27955a;
    public final mq f27956b;

    public kq(mq mqVar, iq iqVar) {
        this.f27956b = mqVar;
        this.f27955a = iqVar;
    }

    @Override
    public final void h(int i10) {
        mq mqVar = this.f27956b;
        mqVar.f28572r = i10;
        mqVar.q(true);
    }

    @Override
    public final void m() {
        int measuredHeight = this.f27956b.f28569c.getMeasuredHeight();
        iq iqVar = this.f27955a;
        iqVar.y(0 - iqVar.getScrollX(), measuredHeight - iqVar.getScrollY(), false);
    }
}
