package org.telegram.ui.Components;
public final class aq implements sv0 {
    public final yp f22455a;
    public final cq f22456b;

    public aq(cq cqVar, yp ypVar) {
        this.f22456b = cqVar;
        this.f22455a = ypVar;
    }

    @Override
    public final void g(int i10) {
        cq cqVar = this.f22456b;
        cqVar.f23124r = i10;
        cqVar.p(true);
    }

    @Override
    public final void l() {
        int measuredHeight = this.f22456b.f23121c.getMeasuredHeight();
        yp ypVar = this.f22455a;
        ypVar.y(0 - ypVar.getScrollX(), measuredHeight - ypVar.getScrollY(), false);
    }
}
