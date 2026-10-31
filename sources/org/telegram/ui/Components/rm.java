package org.telegram.ui.Components;
public final class rm extends org.telegram.ui.yr0 {
    public boolean f29953a;
    public final int f29954b;
    public final jn f29955c;

    public rm(jn jnVar, int i10) {
        this.f29955c = jnVar;
        this.f29954b = i10;
    }

    @Override
    public final void D() {
        if (this.f29953a) {
            this.f29955c.e0(this.f29954b);
        }
    }

    @Override
    public final void J() {
        this.f29955c.h0(this.f29954b, null);
    }

    @Override
    public final void W() {
        this.f29953a = true;
    }

    @Override
    public final boolean z() {
        return false;
    }
}
