package org.telegram.ui.Components;
public final class an extends org.telegram.ui.oq0 {
    public boolean f33552a;
    public final int f33553b;
    public final tn f33554c;

    public an(tn tnVar, int i7) {
        this.f33554c = tnVar;
        this.f33553b = i7;
    }

    @Override
    public final void D() {
        if (this.f33552a) {
            this.f33554c.g0(this.f33553b);
        }
    }

    @Override
    public final void J() {
        this.f33554c.j0(this.f33553b, null);
    }

    @Override
    public final void W() {
        this.f33552a = true;
    }

    @Override
    public final boolean z() {
        return false;
    }
}
