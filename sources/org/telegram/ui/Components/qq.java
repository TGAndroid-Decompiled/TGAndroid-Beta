package org.telegram.ui.Components;
public final class qq implements ww0 {
    public final oq f30263a;
    public final sq f30264b;

    public qq(sq sqVar, oq oqVar) {
        this.f30264b = sqVar;
        this.f30263a = oqVar;
    }

    @Override
    public final void g(int i10) {
        sq sqVar = this.f30264b;
        sqVar.f30832r = i10;
        sqVar.r(true);
    }

    @Override
    public final void l() {
        int measuredHeight = this.f30264b.f30828c.getMeasuredHeight();
        oq oqVar = this.f30263a;
        oqVar.y(0 - oqVar.getScrollX(), measuredHeight - oqVar.getScrollY(), false);
    }
}
