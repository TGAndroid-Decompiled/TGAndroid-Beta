package org.telegram.ui.Components;
public final class bq implements dw0 {
    public final zp f23038a;
    public final dq f23039b;

    public bq(dq dqVar, zp zpVar) {
        this.f23039b = dqVar;
        this.f23038a = zpVar;
    }

    @Override
    public final void h(int i10) {
        dq dqVar = this.f23039b;
        dqVar.f23695r = i10;
        dqVar.p(true);
    }

    @Override
    public final void n() {
        int measuredHeight = this.f23039b.f23692c.getMeasuredHeight();
        zp zpVar = this.f23038a;
        zpVar.y(0 - zpVar.getScrollX(), measuredHeight - zpVar.getScrollY(), false);
    }
}
