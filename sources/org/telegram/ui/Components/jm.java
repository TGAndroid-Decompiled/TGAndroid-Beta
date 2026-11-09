package org.telegram.ui.Components;
public final class jm extends org.telegram.ui.pq0 {
    public boolean f35094a;
    public final int f35095b;
    public final bn f35096c;

    public jm(bn bnVar, int i7) {
        this.f35096c = bnVar;
        this.f35095b = i7;
    }

    @Override
    public final void D() {
        if (this.f35094a) {
            this.f35096c.g0(this.f35095b);
        }
    }

    @Override
    public final void J() {
        this.f35096c.j0(this.f35095b, null);
    }

    @Override
    public final void W() {
        this.f35094a = true;
    }

    @Override
    public final boolean z() {
        return false;
    }
}
