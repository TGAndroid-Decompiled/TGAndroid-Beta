package org.telegram.ui.Components;
public final class yp implements tv0 {
    public final wp f31070a;
    public final aq f31071b;

    public yp(aq aqVar, wp wpVar) {
        this.f31071b = aqVar;
        this.f31070a = wpVar;
    }

    @Override
    public final void h(int i10) {
        aq aqVar = this.f31071b;
        aqVar.f23496r = i10;
        aqVar.p(true);
    }

    @Override
    public final void m() {
        int measuredHeight = this.f31071b.f23493c.getMeasuredHeight();
        wp wpVar = this.f31070a;
        wpVar.y(0 - wpVar.getScrollX(), measuredHeight - wpVar.getScrollY(), false);
    }
}
