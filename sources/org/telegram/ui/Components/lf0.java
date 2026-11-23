package org.telegram.ui.Components;
public final class lf0 implements Runnable {
    public final int f37178a;
    public final of0 f37179b;

    public lf0(of0 of0Var, int i7) {
        this.f37178a = i7;
        this.f37179b = of0Var;
    }

    @Override
    public final void run() {
        switch (this.f37178a) {
            case 0:
                this.f37179b.a(true);
                return;
            default:
                this.f37179b.d();
                return;
        }
    }
}
