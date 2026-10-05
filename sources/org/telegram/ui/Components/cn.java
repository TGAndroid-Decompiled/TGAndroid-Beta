package org.telegram.ui.Components;
public final class cn extends org.telegram.ui.ou0 {
    public boolean f25470a;
    public final int f25471b;
    public final xn f25472c;

    public cn(xn xnVar, int i10) {
        this.f25472c = xnVar;
        this.f25471b = i10;
    }

    @Override
    public final void D() {
        if (this.f25470a) {
            this.f25472c.b0(this.f25471b);
        }
    }

    @Override
    public final void I() {
        this.f25472c.e0(this.f25471b, null);
    }

    @Override
    public final void V() {
        this.f25470a = true;
    }

    @Override
    public final boolean z() {
        return false;
    }
}
