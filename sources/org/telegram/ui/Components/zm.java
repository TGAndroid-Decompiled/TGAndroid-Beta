package org.telegram.ui.Components;
public final class zm extends org.telegram.ui.tu0 {
    public boolean f30905a;
    public final int f30906b;
    public final un f30907c;

    public zm(un unVar, int i10) {
        this.f30907c = unVar;
        this.f30906b = i10;
    }

    @Override
    public final void D() {
        if (this.f30905a) {
            this.f30907c.b0(this.f30906b);
        }
    }

    @Override
    public final void I() {
        this.f30907c.e0(this.f30906b, null);
    }

    @Override
    public final void V() {
        this.f30905a = true;
    }

    @Override
    public final boolean z() {
        return false;
    }
}
