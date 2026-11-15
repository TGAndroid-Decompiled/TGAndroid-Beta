package org.telegram.ui.Components.voip;
public final class c0 implements Runnable {
    public final int f40535a;
    public final e0 f40536b;

    public c0(e0 e0Var, int i7) {
        this.f40535a = i7;
        this.f40536b = e0Var;
    }

    @Override
    public final void run() {
        switch (this.f40535a) {
            case 0:
                e0.a(this.f40536b);
                return;
            default:
                e0.a(this.f40536b);
                return;
        }
    }
}
