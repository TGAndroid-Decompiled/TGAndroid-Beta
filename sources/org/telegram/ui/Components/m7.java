package org.telegram.ui.Components;
public final class m7 implements Runnable {
    public final int f28461a;
    public final k8 f28462b;

    public m7(k8 k8Var, int i10) {
        this.f28461a = i10;
        this.f28462b = k8Var;
    }

    @Override
    public final void run() {
        switch (this.f28461a) {
            case 0:
                k8.o(this.f28462b);
                return;
            default:
                k8.H(this.f28462b);
                return;
        }
    }
}
