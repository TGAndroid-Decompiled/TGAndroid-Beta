package org.telegram.ui.Components;
public final class m7 implements Runnable {
    public final int f28440a;
    public final k8 f28441b;

    public m7(k8 k8Var, int i10) {
        this.f28440a = i10;
        this.f28441b = k8Var;
    }

    @Override
    public final void run() {
        switch (this.f28440a) {
            case 0:
                k8.o(this.f28441b);
                return;
            default:
                k8.G(this.f28441b);
                return;
        }
    }
}
