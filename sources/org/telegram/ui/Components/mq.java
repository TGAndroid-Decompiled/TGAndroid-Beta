package org.telegram.ui.Components;
public final class mq implements zw0 {
    public final kq f30595a;
    public final oq f30596b;

    public mq(oq oqVar, kq kqVar) {
        this.f30596b = oqVar;
        this.f30595a = kqVar;
    }

    @Override
    public final void j(int i10) {
        oq oqVar = this.f30596b;
        oqVar.f31369s = i10;
        oqVar.p(true);
    }

    @Override
    public final void m() {
        int measuredHeight = this.f30596b.d.getMeasuredHeight();
        kq kqVar = this.f30595a;
        kqVar.z(0 - kqVar.getScrollX(), measuredHeight - kqVar.getScrollY(), false);
    }
}
