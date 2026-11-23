package org.telegram.ui.Components.voip;
public final class b0 implements Runnable {
    public final int f40876a;
    public final d0 f40877b;

    public b0(d0 d0Var, int i7) {
        this.f40876a = i7;
        this.f40877b = d0Var;
    }

    @Override
    public final void run() {
        switch (this.f40876a) {
            case 0:
                d0.a(this.f40877b);
                return;
            default:
                d0.a(this.f40877b);
                return;
        }
    }
}
