package org.telegram.ui.Components;
public final class kq implements ow0 {
    public final iq f27912a;
    public final mq f27913b;

    public kq(mq mqVar, iq iqVar) {
        this.f27913b = mqVar;
        this.f27912a = iqVar;
    }

    @Override
    public final void h(int i10) {
        mq mqVar = this.f27913b;
        mqVar.f28585r = i10;
        mqVar.q(true);
    }

    @Override
    public final void m() {
        int measuredHeight = this.f27913b.f28582c.getMeasuredHeight();
        iq iqVar = this.f27912a;
        iqVar.y(0 - iqVar.getScrollX(), measuredHeight - iqVar.getScrollY(), false);
    }
}
