package org.telegram.ui.Components;
public final class qq implements xw0 {
    public final oq f30222a;
    public final sq f30223b;

    public qq(sq sqVar, oq oqVar) {
        this.f30223b = sqVar;
        this.f30222a = oqVar;
    }

    @Override
    public final void g(int i10) {
        sq sqVar = this.f30223b;
        sqVar.f30842r = i10;
        sqVar.r(true);
    }

    @Override
    public final void l() {
        int measuredHeight = this.f30223b.f30838c.getMeasuredHeight();
        oq oqVar = this.f30222a;
        oqVar.y(0 - oqVar.getScrollX(), measuredHeight - oqVar.getScrollY(), false);
    }
}
