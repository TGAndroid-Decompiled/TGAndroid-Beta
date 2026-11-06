package org.telegram.ui.Components;
public final class jp implements ut0 {
    public final hp f35052a;
    public final lp f35053b;

    public jp(lp lpVar, hp hpVar) {
        this.f35053b = lpVar;
        this.f35052a = hpVar;
    }

    @Override
    public final void m(int i7) {
        lp lpVar = this.f35053b;
        lpVar.f35692q1 = i7;
        lpVar.J0(true);
    }

    @Override
    public final void n() {
        int measuredHeight = this.f35053b.f35688k1.getMeasuredHeight();
        hp hpVar = this.f35052a;
        hpVar.z(0 - hpVar.getScrollX(), measuredHeight - hpVar.getScrollY(), false);
    }
}
