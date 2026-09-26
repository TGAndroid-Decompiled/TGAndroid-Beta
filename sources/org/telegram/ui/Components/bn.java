package org.telegram.ui.Components;
public final class bn extends org.telegram.ui.lu0 {
    public boolean f23067a;
    public final int f23068b;
    public final wn f23069c;

    public bn(wn wnVar, int i10) {
        this.f23069c = wnVar;
        this.f23068b = i10;
    }

    @Override
    public final void D() {
        if (this.f23067a) {
            this.f23069c.b0(this.f23068b);
        }
    }

    @Override
    public final void I() {
        this.f23069c.e0(this.f23068b, null);
    }

    @Override
    public final void V() {
        this.f23067a = true;
    }

    @Override
    public final boolean z() {
        return false;
    }
}
