package org.telegram.ui.Components;
public final class jn extends org.telegram.ui.cu0 {
    public boolean f27714a;
    public final int f27715b;
    public final fo f27716c;

    public jn(fo foVar, int i10) {
        this.f27716c = foVar;
        this.f27715b = i10;
    }

    @Override
    public final void D() {
        if (this.f27714a) {
            this.f27716c.e0(this.f27715b);
        }
    }

    @Override
    public final void J() {
        this.f27716c.h0(this.f27715b, null);
    }

    @Override
    public final void W() {
        this.f27714a = true;
    }

    @Override
    public final boolean z() {
        return false;
    }
}
