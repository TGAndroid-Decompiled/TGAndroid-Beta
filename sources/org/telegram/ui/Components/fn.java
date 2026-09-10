package org.telegram.ui.Components;
public final class fn extends org.telegram.ui.tu0 {
    public boolean f23036a;
    public final int f23037b;
    public final zn f23038c;

    public fn(zn znVar, int i10) {
        this.f23038c = znVar;
        this.f23037b = i10;
    }

    @Override
    public final void D() {
        if (this.f23036a) {
            this.f23038c.b0(this.f23037b);
        }
    }

    @Override
    public final void I() {
        this.f23038c.e0(this.f23037b, null);
    }

    @Override
    public final void V() {
        this.f23036a = true;
    }

    @Override
    public final boolean z() {
        return false;
    }
}
