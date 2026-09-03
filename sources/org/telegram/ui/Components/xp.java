package org.telegram.ui.Components;
public final class xp implements tv0 {
    public final vp f30685a;
    public final zp f30686b;

    public xp(zp zpVar, vp vpVar) {
        this.f30686b = zpVar;
        this.f30685a = vpVar;
    }

    @Override
    public final void g(int i10) {
        zp zpVar = this.f30686b;
        zpVar.f31451r = i10;
        zpVar.p(true);
    }

    @Override
    public final void j() {
        int measuredHeight = this.f30686b.f31448c.getMeasuredHeight();
        vp vpVar = this.f30685a;
        vpVar.y(0 - vpVar.getScrollX(), measuredHeight - vpVar.getScrollY(), false);
    }
}
