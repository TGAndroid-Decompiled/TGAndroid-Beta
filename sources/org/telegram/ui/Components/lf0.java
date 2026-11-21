package org.telegram.ui.Components;
public final class lf0 implements Runnable {
    public final int f37173a;
    public final of0 f37174b;

    public lf0(of0 of0Var, int i7) {
        this.f37173a = i7;
        this.f37174b = of0Var;
    }

    @Override
    public final void run() {
        switch (this.f37173a) {
            case 0:
                this.f37174b.a(true);
                return;
            default:
                this.f37174b.d();
                return;
        }
    }
}
