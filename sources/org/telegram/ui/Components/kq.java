package org.telegram.ui.Components;
public final class kq implements rw0 {
    public final iq f28124a;
    public final mq f28125b;

    public kq(mq mqVar, iq iqVar) {
        this.f28125b = mqVar;
        this.f28124a = iqVar;
    }

    @Override
    public final void i(int i10) {
        mq mqVar = this.f28125b;
        mqVar.f28742s = i10;
        mqVar.q(true);
    }

    @Override
    public final void m() {
        int measuredHeight = this.f28125b.d.getMeasuredHeight();
        iq iqVar = this.f28124a;
        iqVar.y(0 - iqVar.getScrollX(), measuredHeight - iqVar.getScrollY(), false);
    }
}
