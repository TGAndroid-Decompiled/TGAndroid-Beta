package org.telegram.ui.Components;
public final class pm extends org.telegram.ui.rt0 {
    public boolean f31690a;
    public final int f31691b;
    public final jn f31692c;

    public pm(jn jnVar, int i9) {
        this.f31692c = jnVar;
        this.f31691b = i9;
    }

    @Override
    public final void D() {
        if (this.f31690a) {
            this.f31692c.a0(this.f31691b);
        }
    }

    @Override
    public final void I() {
        this.f31692c.d0(this.f31691b, null);
    }

    @Override
    public final void V() {
        this.f31690a = true;
    }

    @Override
    public final boolean z() {
        return false;
    }
}
