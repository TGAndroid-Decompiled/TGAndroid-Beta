package org.telegram.ui.Components;
public final class m7 implements Runnable {
    public final int f28450a;
    public final k8 f28451b;

    public m7(k8 k8Var, int i10) {
        this.f28450a = i10;
        this.f28451b = k8Var;
    }

    @Override
    public final void run() {
        switch (this.f28450a) {
            case 0:
                k8.o(this.f28451b);
                return;
            default:
                k8.G(this.f28451b);
                return;
        }
    }
}
