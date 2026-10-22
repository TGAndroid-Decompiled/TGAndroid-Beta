package org.telegram.ui.Components;
public final class jn extends org.telegram.ui.zt0 {
    public boolean f27607a;
    public final int f27608b;
    public final fo f27609c;

    public jn(fo foVar, int i10) {
        this.f27609c = foVar;
        this.f27608b = i10;
    }

    @Override
    public final void D() {
        if (this.f27607a) {
            this.f27609c.e0(this.f27608b);
        }
    }

    @Override
    public final void J() {
        this.f27609c.h0(this.f27608b, null);
    }

    @Override
    public final void W() {
        this.f27607a = true;
    }

    @Override
    public final boolean z() {
        return false;
    }
}
