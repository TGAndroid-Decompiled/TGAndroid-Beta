package org.telegram.ui.Components;
public final class jp implements ut0 {
    public final hp f35060a;
    public final lp f35061b;

    public jp(lp lpVar, hp hpVar) {
        this.f35061b = lpVar;
        this.f35060a = hpVar;
    }

    @Override
    public final void m(int i7) {
        lp lpVar = this.f35061b;
        lpVar.f35735q1 = i7;
        lpVar.J0(true);
    }

    @Override
    public final void n() {
        int measuredHeight = this.f35061b.f35731k1.getMeasuredHeight();
        hp hpVar = this.f35060a;
        hpVar.z(0 - hpVar.getScrollX(), measuredHeight - hpVar.getScrollY(), false);
    }
}
