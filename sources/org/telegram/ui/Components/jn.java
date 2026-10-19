package org.telegram.ui.Components;
public final class jn extends org.telegram.ui.zt0 {
    public boolean f27559a;
    public final int f27560b;
    public final fo f27561c;

    public jn(fo foVar, int i10) {
        this.f27561c = foVar;
        this.f27560b = i10;
    }

    @Override
    public final void D() {
        if (this.f27559a) {
            this.f27561c.e0(this.f27560b);
        }
    }

    @Override
    public final void J() {
        this.f27561c.h0(this.f27560b, null);
    }

    @Override
    public final void W() {
        this.f27559a = true;
    }

    @Override
    public final boolean z() {
        return false;
    }
}
