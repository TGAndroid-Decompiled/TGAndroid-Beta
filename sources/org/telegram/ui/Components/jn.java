package org.telegram.ui.Components;
public final class jn extends org.telegram.ui.zt0 {
    public boolean f27608a;
    public final int f27609b;
    public final fo f27610c;

    public jn(fo foVar, int i10) {
        this.f27610c = foVar;
        this.f27609b = i10;
    }

    @Override
    public final void D() {
        if (this.f27608a) {
            this.f27610c.e0(this.f27609b);
        }
    }

    @Override
    public final void J() {
        this.f27610c.h0(this.f27609b, null);
    }

    @Override
    public final void W() {
        this.f27608a = true;
    }

    @Override
    public final boolean z() {
        return false;
    }
}
