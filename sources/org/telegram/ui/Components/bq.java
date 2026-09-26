package org.telegram.ui.Components;
public final class bq implements dw0 {
    public final zp f23064a;
    public final dq f23065b;

    public bq(dq dqVar, zp zpVar) {
        this.f23065b = dqVar;
        this.f23064a = zpVar;
    }

    @Override
    public final void h(int i10) {
        dq dqVar = this.f23065b;
        dqVar.f23714r = i10;
        dqVar.p(true);
    }

    @Override
    public final void n() {
        int measuredHeight = this.f23065b.f23711c.getMeasuredHeight();
        zp zpVar = this.f23064a;
        zpVar.y(0 - zpVar.getScrollX(), measuredHeight - zpVar.getScrollY(), false);
    }
}
