package org.telegram.ui.Components;
public final class qq implements ww0 {
    public final oq f30297a;
    public final sq f30298b;

    public qq(sq sqVar, oq oqVar) {
        this.f30298b = sqVar;
        this.f30297a = oqVar;
    }

    @Override
    public final void g(int i10) {
        sq sqVar = this.f30298b;
        sqVar.f30912r = i10;
        sqVar.r(true);
    }

    @Override
    public final void l() {
        int measuredHeight = this.f30298b.f30908c.getMeasuredHeight();
        oq oqVar = this.f30297a;
        oqVar.y(0 - oqVar.getScrollX(), measuredHeight - oqVar.getScrollY(), false);
    }
}
