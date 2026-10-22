package org.telegram.ui.Components;
public final class kq implements ow0 {
    public final iq f27915a;
    public final mq f27916b;

    public kq(mq mqVar, iq iqVar) {
        this.f27916b = mqVar;
        this.f27915a = iqVar;
    }

    @Override
    public final void h(int i10) {
        mq mqVar = this.f27916b;
        mqVar.f28589r = i10;
        mqVar.q(true);
    }

    @Override
    public final void m() {
        int measuredHeight = this.f27916b.f28586c.getMeasuredHeight();
        iq iqVar = this.f27915a;
        iqVar.y(0 - iqVar.getScrollX(), measuredHeight - iqVar.getScrollY(), false);
    }
}
