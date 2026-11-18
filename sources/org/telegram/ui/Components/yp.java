package org.telegram.ui.Components;
public final class yp implements du0 {
    public final wp f42591a;
    public final aq f42592b;

    public yp(aq aqVar, wp wpVar) {
        this.f42592b = aqVar;
        this.f42591a = wpVar;
    }

    @Override
    public final void k(int i7) {
        aq aqVar = this.f42592b;
        aqVar.f33424u1 = i7;
        aqVar.K0(true);
    }

    @Override
    public final void o() {
        int measuredHeight = this.f42592b.f33418o1.getMeasuredHeight();
        wp wpVar = this.f42591a;
        wpVar.z(0 - wpVar.getScrollX(), measuredHeight - wpVar.getScrollY(), false);
    }
}
