package org.telegram.ui.Components;
public final class bq implements dw0 {
    public final zp f23065a;
    public final dq f23066b;

    public bq(dq dqVar, zp zpVar) {
        this.f23066b = dqVar;
        this.f23065a = zpVar;
    }

    @Override
    public final void h(int i10) {
        dq dqVar = this.f23066b;
        dqVar.f23715r = i10;
        dqVar.p(true);
    }

    @Override
    public final void n() {
        int measuredHeight = this.f23066b.f23712c.getMeasuredHeight();
        zp zpVar = this.f23065a;
        zpVar.y(0 - zpVar.getScrollX(), measuredHeight - zpVar.getScrollY(), false);
    }
}
