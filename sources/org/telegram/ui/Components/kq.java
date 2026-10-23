package org.telegram.ui.Components;
public final class kq implements ow0 {
    public final iq f27916a;
    public final mq f27917b;

    public kq(mq mqVar, iq iqVar) {
        this.f27917b = mqVar;
        this.f27916a = iqVar;
    }

    @Override
    public final void h(int i10) {
        mq mqVar = this.f27917b;
        mqVar.f28590r = i10;
        mqVar.q(true);
    }

    @Override
    public final void m() {
        int measuredHeight = this.f27917b.f28587c.getMeasuredHeight();
        iq iqVar = this.f27916a;
        iqVar.y(0 - iqVar.getScrollX(), measuredHeight - iqVar.getScrollY(), false);
    }
}
