package org.telegram.ui.Components;
public final class jp implements ut0 {
    public final hp f35039a;
    public final lp f35040b;

    public jp(lp lpVar, hp hpVar) {
        this.f35040b = lpVar;
        this.f35039a = hpVar;
    }

    @Override
    public final void m(int i7) {
        lp lpVar = this.f35040b;
        lpVar.f35717q1 = i7;
        lpVar.J0(true);
    }

    @Override
    public final void n() {
        int measuredHeight = this.f35040b.f35713k1.getMeasuredHeight();
        hp hpVar = this.f35039a;
        hpVar.z(0 - hpVar.getScrollX(), measuredHeight - hpVar.getScrollY(), false);
    }
}
