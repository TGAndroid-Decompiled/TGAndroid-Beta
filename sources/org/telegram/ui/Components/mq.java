package org.telegram.ui.Components;
public final class mq implements yw0 {
    public final kq f30682a;
    public final oq f30683b;

    public mq(oq oqVar, kq kqVar) {
        this.f30683b = oqVar;
        this.f30682a = kqVar;
    }

    @Override
    public final void j(int i10) {
        oq oqVar = this.f30683b;
        oqVar.f31358s = i10;
        oqVar.p(true);
    }

    @Override
    public final void m() {
        int measuredHeight = this.f30683b.d.getMeasuredHeight();
        kq kqVar = this.f30682a;
        kqVar.z(0 - kqVar.getScrollX(), measuredHeight - kqVar.getScrollY(), false);
    }
}
