package org.telegram.ui.Components;
public final class jm extends org.telegram.ui.nq0 {
    public boolean f35017a;
    public final int f35018b;
    public final bn f35019c;

    public jm(bn bnVar, int i7) {
        this.f35019c = bnVar;
        this.f35018b = i7;
    }

    @Override
    public final void D() {
        if (this.f35017a) {
            this.f35019c.g0(this.f35018b);
        }
    }

    @Override
    public final void J() {
        this.f35019c.j0(this.f35018b, null);
    }

    @Override
    public final void W() {
        this.f35017a = true;
    }

    @Override
    public final boolean z() {
        return false;
    }
}
