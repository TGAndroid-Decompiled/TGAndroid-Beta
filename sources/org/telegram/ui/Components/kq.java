package org.telegram.ui.Components;
public final class kq implements mw0 {
    public final iq f27962a;
    public final mq f27963b;

    public kq(mq mqVar, iq iqVar) {
        this.f27963b = mqVar;
        this.f27962a = iqVar;
    }

    @Override
    public final void h(int i10) {
        mq mqVar = this.f27963b;
        mqVar.f28579r = i10;
        mqVar.q(true);
    }

    @Override
    public final void m() {
        int measuredHeight = this.f27963b.f28576c.getMeasuredHeight();
        iq iqVar = this.f27962a;
        iqVar.y(0 - iqVar.getScrollX(), measuredHeight - iqVar.getScrollY(), false);
    }
}
