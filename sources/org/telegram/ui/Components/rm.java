package org.telegram.ui.Components;
public final class rm extends org.telegram.ui.mq0 {
    public boolean f38998a;
    public final int f38999b;
    public final jn f39000c;

    public rm(jn jnVar, int i7) {
        this.f39000c = jnVar;
        this.f38999b = i7;
    }

    @Override
    public final void D() {
        if (this.f38998a) {
            this.f39000c.g0(this.f38999b);
        }
    }

    @Override
    public final void J() {
        this.f39000c.j0(this.f38999b, null);
    }

    @Override
    public final void W() {
        this.f38998a = true;
    }

    @Override
    public final boolean z() {
        return false;
    }
}
