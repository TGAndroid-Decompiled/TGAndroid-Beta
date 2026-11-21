package org.telegram.ui.Components;
public final class an extends org.telegram.ui.oq0 {
    public boolean f33539a;
    public final int f33540b;
    public final tn f33541c;

    public an(tn tnVar, int i7) {
        this.f33541c = tnVar;
        this.f33540b = i7;
    }

    @Override
    public final void D() {
        if (this.f33539a) {
            this.f33541c.g0(this.f33540b);
        }
    }

    @Override
    public final void J() {
        this.f33541c.j0(this.f33540b, null);
    }

    @Override
    public final void W() {
        this.f33539a = true;
    }

    @Override
    public final boolean z() {
        return false;
    }
}
