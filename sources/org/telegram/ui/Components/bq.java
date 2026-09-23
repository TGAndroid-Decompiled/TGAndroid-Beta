package org.telegram.ui.Components;
public final class bq implements sv0 {
    public final zp f22820a;
    public final dq f22821b;

    public bq(dq dqVar, zp zpVar) {
        this.f22821b = dqVar;
        this.f22820a = zpVar;
    }

    @Override
    public final void g(int i10) {
        dq dqVar = this.f22821b;
        dqVar.f23439r = i10;
        dqVar.p(true);
    }

    @Override
    public final void l() {
        int measuredHeight = this.f22821b.f23436c.getMeasuredHeight();
        zp zpVar = this.f22820a;
        zpVar.y(0 - zpVar.getScrollX(), measuredHeight - zpVar.getScrollY(), false);
    }
}
