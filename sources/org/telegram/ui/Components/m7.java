package org.telegram.ui.Components;
public final class m7 implements Runnable {
    public final int f28398a;
    public final k8 f28399b;

    public m7(k8 k8Var, int i10) {
        this.f28398a = i10;
        this.f28399b = k8Var;
    }

    @Override
    public final void run() {
        switch (this.f28398a) {
            case 0:
                k8.n(this.f28399b);
                return;
            default:
                k8.G(this.f28399b);
                return;
        }
    }
}
