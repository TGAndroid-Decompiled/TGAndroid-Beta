package org.telegram.ui.Components;
public final class jn extends org.telegram.ui.zt0 {
    public boolean f27604a;
    public final int f27605b;
    public final fo f27606c;

    public jn(fo foVar, int i10) {
        this.f27606c = foVar;
        this.f27605b = i10;
    }

    @Override
    public final void D() {
        if (this.f27604a) {
            this.f27606c.e0(this.f27605b);
        }
    }

    @Override
    public final void J() {
        this.f27606c.h0(this.f27605b, null);
    }

    @Override
    public final void W() {
        this.f27604a = true;
    }

    @Override
    public final boolean z() {
        return false;
    }
}
