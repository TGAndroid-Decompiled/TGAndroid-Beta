package org.telegram.ui.Components;
public final class aq implements uv0 {
    public final yp f25317a;
    public final cq f25318b;

    public aq(cq cqVar, yp ypVar) {
        this.f25318b = cqVar;
        this.f25317a = ypVar;
    }

    @Override
    public final void i(int i10) {
        cq cqVar = this.f25318b;
        cqVar.f26074r = i10;
        cqVar.p(true);
    }

    @Override
    public final void m() {
        int measuredHeight = this.f25318b.f26070c.getMeasuredHeight();
        yp ypVar = this.f25317a;
        ypVar.y(0 - ypVar.getScrollX(), measuredHeight - ypVar.getScrollY(), false);
    }
}
