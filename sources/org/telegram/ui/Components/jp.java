package org.telegram.ui.Components;
public final class jp implements ut0 {
    public final hp f35013a;
    public final lp f35014b;

    public jp(lp lpVar, hp hpVar) {
        this.f35014b = lpVar;
        this.f35013a = hpVar;
    }

    @Override
    public final void m(int i7) {
        lp lpVar = this.f35014b;
        lpVar.f35697q1 = i7;
        lpVar.J0(true);
    }

    @Override
    public final void n() {
        int measuredHeight = this.f35014b.f35693k1.getMeasuredHeight();
        hp hpVar = this.f35013a;
        hpVar.z(0 - hpVar.getScrollX(), measuredHeight - hpVar.getScrollY(), false);
    }
}
