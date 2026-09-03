package org.telegram.ui.Components;
public final class vm extends org.telegram.ui.fu0 {
    public boolean f29506a;
    public final int f29507b;
    public final pn f29508c;

    public vm(pn pnVar, int i10) {
        this.f29508c = pnVar;
        this.f29507b = i10;
    }

    @Override
    public final void D() {
        if (this.f29506a) {
            this.f29508c.b0(this.f29507b);
        }
    }

    @Override
    public final void I() {
        this.f29508c.e0(this.f29507b, null);
    }

    @Override
    public final void V() {
        this.f29506a = true;
    }

    @Override
    public final boolean z() {
        return false;
    }
}
