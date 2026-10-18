package org.telegram.ui.Components;
public final class jn extends org.telegram.ui.bu0 {
    public boolean f27558a;
    public final int f27559b;
    public final fo f27560c;

    public jn(fo foVar, int i10) {
        this.f27560c = foVar;
        this.f27559b = i10;
    }

    @Override
    public final void D() {
        if (this.f27558a) {
            this.f27560c.e0(this.f27559b);
        }
    }

    @Override
    public final void J() {
        this.f27560c.h0(this.f27559b, null);
    }

    @Override
    public final void W() {
        this.f27558a = true;
    }

    @Override
    public final boolean z() {
        return false;
    }
}
