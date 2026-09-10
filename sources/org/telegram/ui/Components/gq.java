package org.telegram.ui.Components;
public final class gq implements dw0 {
    public final eq f23398a;
    public final iq f23399b;

    public gq(iq iqVar, eq eqVar) {
        this.f23399b = iqVar;
        this.f23398a = eqVar;
    }

    @Override
    public final void h(int i10) {
        iq iqVar = this.f23399b;
        iqVar.f24066r = i10;
        iqVar.p(true);
    }

    @Override
    public final void l() {
        int measuredHeight = this.f23399b.f24063c.getMeasuredHeight();
        eq eqVar = this.f23398a;
        eqVar.y(0 - eqVar.getScrollX(), measuredHeight - eqVar.getScrollY(), false);
    }
}
