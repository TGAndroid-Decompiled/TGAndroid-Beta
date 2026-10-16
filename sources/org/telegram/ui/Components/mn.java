package org.telegram.ui.Components;
public final class mn extends org.telegram.ui.zu0 {
    public boolean f27173a;
    public final int f27174b;
    public final io f27175c;

    public mn(io ioVar, int i10) {
        this.f27175c = ioVar;
        this.f27174b = i10;
    }

    @Override
    public final void D() {
        if (this.f27173a) {
            this.f27175c.e0(this.f27174b);
        }
    }

    @Override
    public final void J() {
        this.f27175c.h0(this.f27174b, null);
    }

    @Override
    public final void W() {
        this.f27173a = true;
    }

    @Override
    public final boolean z() {
        return false;
    }
}
