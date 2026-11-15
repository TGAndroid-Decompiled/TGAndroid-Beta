package org.telegram.ui.Components;
public final class rm extends org.telegram.ui.mq0 {
    public boolean f39001a;
    public final int f39002b;
    public final jn f39003c;

    public rm(jn jnVar, int i7) {
        this.f39003c = jnVar;
        this.f39002b = i7;
    }

    @Override
    public final void D() {
        if (this.f39001a) {
            this.f39003c.g0(this.f39002b);
        }
    }

    @Override
    public final void J() {
        this.f39003c.j0(this.f39002b, null);
    }

    @Override
    public final void W() {
        this.f39001a = true;
    }

    @Override
    public final boolean z() {
        return false;
    }
}
