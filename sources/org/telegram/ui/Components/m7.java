package org.telegram.ui.Components;
public final class m7 implements Runnable {
    public final int f28399a;
    public final k8 f28400b;

    public m7(k8 k8Var, int i10) {
        this.f28399a = i10;
        this.f28400b = k8Var;
    }

    @Override
    public final void run() {
        switch (this.f28399a) {
            case 0:
                k8.n(this.f28400b);
                return;
            default:
                k8.G(this.f28400b);
                return;
        }
    }
}
