package org.telegram.ui.Components;
public final class jn extends org.telegram.ui.zt0 {
    public boolean f27561a;
    public final int f27562b;
    public final fo f27563c;

    public jn(fo foVar, int i10) {
        this.f27563c = foVar;
        this.f27562b = i10;
    }

    @Override
    public final void D() {
        if (this.f27561a) {
            this.f27563c.e0(this.f27562b);
        }
    }

    @Override
    public final void J() {
        this.f27563c.h0(this.f27562b, null);
    }

    @Override
    public final void W() {
        this.f27561a = true;
    }

    @Override
    public final boolean z() {
        return false;
    }
}
