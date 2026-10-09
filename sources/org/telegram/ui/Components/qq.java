package org.telegram.ui.Components;
public final class qq implements vw0 {
    public final oq f30247a;
    public final sq f30248b;

    public qq(sq sqVar, oq oqVar) {
        this.f30248b = sqVar;
        this.f30247a = oqVar;
    }

    @Override
    public final void g(int i10) {
        sq sqVar = this.f30248b;
        sqVar.f30874r = i10;
        sqVar.r(true);
    }

    @Override
    public final void l() {
        int measuredHeight = this.f30248b.f30870c.getMeasuredHeight();
        oq oqVar = this.f30247a;
        oqVar.y(0 - oqVar.getScrollX(), measuredHeight - oqVar.getScrollY(), false);
    }
}
