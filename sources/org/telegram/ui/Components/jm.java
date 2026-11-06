package org.telegram.ui.Components;
public final class jm extends org.telegram.ui.nq0 {
    public boolean f34996a;
    public final int f34997b;
    public final bn f34998c;

    public jm(bn bnVar, int i7) {
        this.f34998c = bnVar;
        this.f34997b = i7;
    }

    @Override
    public final void D() {
        if (this.f34996a) {
            this.f34998c.g0(this.f34997b);
        }
    }

    @Override
    public final void J() {
        this.f34998c.j0(this.f34997b, null);
    }

    @Override
    public final void W() {
        this.f34996a = true;
    }

    @Override
    public final boolean z() {
        return false;
    }
}
