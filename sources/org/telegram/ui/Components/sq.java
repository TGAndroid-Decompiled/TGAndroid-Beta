package org.telegram.ui.Components;
public final class sq implements bx0 {
    public final qq f30613a;
    public final uq f30614b;

    public sq(uq uqVar, qq qqVar) {
        this.f30614b = uqVar;
        this.f30613a = qqVar;
    }

    @Override
    public final void g(int i10) {
        uq uqVar = this.f30614b;
        uqVar.f31250r = i10;
        uqVar.r(true);
    }

    @Override
    public final void l() {
        int measuredHeight = this.f30614b.f31246c.getMeasuredHeight();
        qq qqVar = this.f30613a;
        qqVar.y(0 - qqVar.getScrollX(), measuredHeight - qqVar.getScrollY(), false);
    }
}
