package org.telegram.ui.Components;
public final class ym extends org.telegram.ui.oq0 {
    public boolean f42516a;
    public final int f42517b;
    public final qn f42518c;

    public ym(qn qnVar, int i7) {
        this.f42518c = qnVar;
        this.f42517b = i7;
    }

    @Override
    public final void D() {
        if (this.f42516a) {
            this.f42518c.g0(this.f42517b);
        }
    }

    @Override
    public final void J() {
        this.f42518c.j0(this.f42517b, null);
    }

    @Override
    public final void W() {
        this.f42516a = true;
    }

    @Override
    public final boolean z() {
        return false;
    }
}
