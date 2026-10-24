package org.telegram.ui.Components;
public final class iq implements qw0 {
    public final gq f27470a;
    public final kq f27471b;

    public iq(kq kqVar, gq gqVar) {
        this.f27471b = kqVar;
        this.f27470a = gqVar;
    }

    @Override
    public final void i(int i10) {
        kq kqVar = this.f27471b;
        kqVar.f28070s = i10;
        kqVar.q(true);
    }

    @Override
    public final void m() {
        int measuredHeight = this.f27471b.d.getMeasuredHeight();
        gq gqVar = this.f27470a;
        gqVar.y(0 - gqVar.getScrollX(), measuredHeight - gqVar.getScrollY(), false);
    }
}
