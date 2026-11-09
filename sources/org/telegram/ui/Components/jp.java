package org.telegram.ui.Components;
public final class jp implements wt0 {
    public final hp f35106a;
    public final lp f35107b;

    public jp(lp lpVar, hp hpVar) {
        this.f35107b = lpVar;
        this.f35106a = hpVar;
    }

    @Override
    public final void m(int i7) {
        lp lpVar = this.f35107b;
        lpVar.f35787q1 = i7;
        lpVar.J0(true);
    }

    @Override
    public final void n() {
        int measuredHeight = this.f35107b.f35783k1.getMeasuredHeight();
        hp hpVar = this.f35106a;
        hpVar.z(0 - hpVar.getScrollX(), measuredHeight - hpVar.getScrollY(), false);
    }
}
