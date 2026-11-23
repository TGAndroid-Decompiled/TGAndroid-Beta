package org.telegram.ui.Components;
public final class an extends org.telegram.ui.pq0 {
    public boolean f33513a;
    public final int f33514b;
    public final tn f33515c;

    public an(tn tnVar, int i7) {
        this.f33515c = tnVar;
        this.f33514b = i7;
    }

    @Override
    public final void D() {
        if (this.f33513a) {
            this.f33515c.g0(this.f33514b);
        }
    }

    @Override
    public final void J() {
        this.f33515c.j0(this.f33514b, null);
    }

    @Override
    public final void W() {
        this.f33513a = true;
    }

    @Override
    public final boolean z() {
        return false;
    }
}
