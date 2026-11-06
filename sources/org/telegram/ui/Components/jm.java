package org.telegram.ui.Components;
public final class jm extends org.telegram.ui.nq0 {
    public boolean f34970a;
    public final int f34971b;
    public final bn f34972c;

    public jm(bn bnVar, int i7) {
        this.f34972c = bnVar;
        this.f34971b = i7;
    }

    @Override
    public final void D() {
        if (this.f34970a) {
            this.f34972c.g0(this.f34971b);
        }
    }

    @Override
    public final void J() {
        this.f34972c.j0(this.f34971b, null);
    }

    @Override
    public final void W() {
        this.f34970a = true;
    }

    @Override
    public final boolean z() {
        return false;
    }
}
