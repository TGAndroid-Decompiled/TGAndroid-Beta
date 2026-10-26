package org.telegram.ui.Components;
public final class mq implements yw0 {
    public final kq f30684a;
    public final oq f30685b;

    public mq(oq oqVar, kq kqVar) {
        this.f30685b = oqVar;
        this.f30684a = kqVar;
    }

    @Override
    public final void j(int i10) {
        oq oqVar = this.f30685b;
        oqVar.f31360s = i10;
        oqVar.p(true);
    }

    @Override
    public final void m() {
        int measuredHeight = this.f30685b.d.getMeasuredHeight();
        kq kqVar = this.f30684a;
        kqVar.z(0 - kqVar.getScrollX(), measuredHeight - kqVar.getScrollY(), false);
    }
}
