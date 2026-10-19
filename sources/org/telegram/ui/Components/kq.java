package org.telegram.ui.Components;
public final class kq implements nw0 {
    public final iq f27935a;
    public final mq f27936b;

    public kq(mq mqVar, iq iqVar) {
        this.f27936b = mqVar;
        this.f27935a = iqVar;
    }

    @Override
    public final void h(int i10) {
        mq mqVar = this.f27936b;
        mqVar.f28587r = i10;
        mqVar.q(true);
    }

    @Override
    public final void m() {
        int measuredHeight = this.f27936b.f28584c.getMeasuredHeight();
        iq iqVar = this.f27935a;
        iqVar.y(0 - iqVar.getScrollX(), measuredHeight - iqVar.getScrollY(), false);
    }
}
