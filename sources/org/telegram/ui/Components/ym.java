package org.telegram.ui.Components;
public final class ym extends org.telegram.ui.au0 {
    public boolean f33544a;
    public final int f33545b;
    public final sn f33546c;

    public ym(sn snVar, int i10) {
        this.f33546c = snVar;
        this.f33545b = i10;
    }

    @Override
    public final void D() {
        if (this.f33544a) {
            this.f33546c.b0(this.f33545b);
        }
    }

    @Override
    public final void I() {
        this.f33546c.e0(this.f33545b, null);
    }

    @Override
    public final void V() {
        this.f33544a = true;
    }

    @Override
    public final boolean z() {
        return false;
    }
}
