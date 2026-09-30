package org.telegram.ui.Components;
public final class cn extends org.telegram.ui.lu0 {
    public boolean f23365a;
    public final int f23366b;
    public final xn f23367c;

    public cn(xn xnVar, int i10) {
        this.f23367c = xnVar;
        this.f23366b = i10;
    }

    @Override
    public final void D() {
        if (this.f23365a) {
            this.f23367c.b0(this.f23366b);
        }
    }

    @Override
    public final void I() {
        this.f23367c.e0(this.f23366b, null);
    }

    @Override
    public final void V() {
        this.f23365a = true;
    }

    @Override
    public final boolean z() {
        return false;
    }
}
