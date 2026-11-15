package org.telegram.ui.Components;
public final class rp implements vt0 {
    public final pp f39015a;
    public final tp f39016b;

    public rp(tp tpVar, pp ppVar) {
        this.f39016b = tpVar;
        this.f39015a = ppVar;
    }

    @Override
    public final void l(int i7) {
        tp tpVar = this.f39016b;
        tpVar.f39771u1 = i7;
        tpVar.J0(true);
    }

    @Override
    public final void p() {
        int measuredHeight = this.f39016b.f39765o1.getMeasuredHeight();
        pp ppVar = this.f39015a;
        ppVar.z(0 - ppVar.getScrollX(), measuredHeight - ppVar.getScrollY(), false);
    }
}
