package org.telegram.ui.Components;
public final class cn extends org.telegram.ui.ou0 {
    public boolean f25416a;
    public final int f25417b;
    public final xn f25418c;

    public cn(xn xnVar, int i10) {
        this.f25418c = xnVar;
        this.f25417b = i10;
    }

    @Override
    public final void D() {
        if (this.f25416a) {
            this.f25418c.b0(this.f25417b);
        }
    }

    @Override
    public final void I() {
        this.f25418c.e0(this.f25417b, null);
    }

    @Override
    public final void V() {
        this.f25416a = true;
    }

    @Override
    public final boolean z() {
        return false;
    }
}
