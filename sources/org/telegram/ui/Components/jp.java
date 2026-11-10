package org.telegram.ui.Components;
public final class jp implements vt0 {
    public final hp f35040a;
    public final lp f35041b;

    public jp(lp lpVar, hp hpVar) {
        this.f35041b = lpVar;
        this.f35040a = hpVar;
    }

    @Override
    public final void m(int i7) {
        lp lpVar = this.f35041b;
        lpVar.f35716t1 = i7;
        lpVar.J0(true);
    }

    @Override
    public final void n() {
        int measuredHeight = this.f35041b.n1.getMeasuredHeight();
        hp hpVar = this.f35040a;
        hpVar.z(0 - hpVar.getScrollX(), measuredHeight - hpVar.getScrollY(), false);
    }
}
