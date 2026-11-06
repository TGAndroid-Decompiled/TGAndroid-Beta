package org.telegram.ui.Components;
public final class jm extends org.telegram.ui.mq0 {
    public boolean f35009a;
    public final int f35010b;
    public final bn f35011c;

    public jm(bn bnVar, int i7) {
        this.f35011c = bnVar;
        this.f35010b = i7;
    }

    @Override
    public final void D() {
        if (this.f35009a) {
            this.f35011c.g0(this.f35010b);
        }
    }

    @Override
    public final void J() {
        this.f35011c.j0(this.f35010b, null);
    }

    @Override
    public final void W() {
        this.f35009a = true;
    }

    @Override
    public final boolean z() {
        return false;
    }
}
