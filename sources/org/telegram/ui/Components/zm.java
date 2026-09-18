package org.telegram.ui.Components;
public final class zm extends org.telegram.ui.vu0 {
    public boolean f30544a;
    public final int f30545b;
    public final un f30546c;

    public zm(un unVar, int i10) {
        this.f30546c = unVar;
        this.f30545b = i10;
    }

    @Override
    public final void D() {
        if (this.f30544a) {
            this.f30546c.b0(this.f30545b);
        }
    }

    @Override
    public final void I() {
        this.f30546c.e0(this.f30545b, null);
    }

    @Override
    public final void V() {
        this.f30544a = true;
    }

    @Override
    public final boolean z() {
        return false;
    }
}
