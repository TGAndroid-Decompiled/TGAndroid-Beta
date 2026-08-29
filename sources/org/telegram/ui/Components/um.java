package org.telegram.ui.Components;
public final class um extends org.telegram.ui.pt0 {
    public boolean f33267a;
    public final int f33268b;
    public final on f33269c;

    public um(on onVar, int i10) {
        this.f33269c = onVar;
        this.f33268b = i10;
    }

    @Override
    public final void D() {
        if (this.f33267a) {
            this.f33269c.b0(this.f33268b);
        }
    }

    @Override
    public final void I() {
        this.f33269c.e0(this.f33268b, null);
    }

    @Override
    public final void V() {
        this.f33267a = true;
    }

    @Override
    public final boolean z() {
        return false;
    }
}
