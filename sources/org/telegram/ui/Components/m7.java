package org.telegram.ui.Components;
public final class m7 implements Runnable {
    public final int f28443a;
    public final k8 f28444b;

    public m7(k8 k8Var, int i10) {
        this.f28443a = i10;
        this.f28444b = k8Var;
    }

    @Override
    public final void run() {
        switch (this.f28443a) {
            case 0:
                k8.o(this.f28444b);
                return;
            default:
                k8.G(this.f28444b);
                return;
        }
    }
}
