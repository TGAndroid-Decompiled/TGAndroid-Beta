package org.telegram.ui.Components;
public final class sq implements bx0 {
    public final qq f30615a;
    public final uq f30616b;

    public sq(uq uqVar, qq qqVar) {
        this.f30616b = uqVar;
        this.f30615a = qqVar;
    }

    @Override
    public final void g(int i10) {
        uq uqVar = this.f30616b;
        uqVar.f31242r = i10;
        uqVar.r(true);
    }

    @Override
    public final void l() {
        int measuredHeight = this.f30616b.f31238c.getMeasuredHeight();
        qq qqVar = this.f30615a;
        qqVar.y(0 - qqVar.getScrollX(), measuredHeight - qqVar.getScrollY(), false);
    }
}
