package org.telegram.ui.Components;
public final class m7 implements Runnable {
    public final int f28448a;
    public final k8 f28449b;

    public m7(k8 k8Var, int i10) {
        this.f28448a = i10;
        this.f28449b = k8Var;
    }

    @Override
    public final void run() {
        switch (this.f28448a) {
            case 0:
                k8.o(this.f28449b);
                return;
            default:
                k8.G(this.f28449b);
                return;
        }
    }
}
