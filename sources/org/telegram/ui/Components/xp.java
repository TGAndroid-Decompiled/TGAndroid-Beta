package org.telegram.ui.Components;
public final class xp implements fu0 {
    public final vp f42133a;
    public final zp f42134b;

    public xp(zp zpVar, vp vpVar) {
        this.f42134b = zpVar;
        this.f42133a = vpVar;
    }

    @Override
    public final void n(int i7) {
        zp zpVar = this.f42134b;
        zpVar.f43015u1 = i7;
        zpVar.K0(true);
    }

    @Override
    public final void o() {
        int measuredHeight = this.f42134b.f43009o1.getMeasuredHeight();
        vp vpVar = this.f42133a;
        vpVar.z(0 - vpVar.getScrollX(), measuredHeight - vpVar.getScrollY(), false);
    }
}
