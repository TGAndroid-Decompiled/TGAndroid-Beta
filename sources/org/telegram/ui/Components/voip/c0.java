package org.telegram.ui.Components.voip;
public final class c0 implements Runnable {
    public final int f40811a;
    public final e0 f40812b;

    public c0(e0 e0Var, int i7) {
        this.f40811a = i7;
        this.f40812b = e0Var;
    }

    @Override
    public final void run() {
        switch (this.f40811a) {
            case 0:
                e0.a(this.f40812b);
                return;
            default:
                e0.a(this.f40812b);
                return;
        }
    }
}
