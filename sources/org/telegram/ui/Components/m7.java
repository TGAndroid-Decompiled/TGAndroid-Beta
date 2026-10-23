package org.telegram.ui.Components;
public final class m7 implements Runnable {
    public final int f28444a;
    public final k8 f28445b;

    public m7(k8 k8Var, int i10) {
        this.f28444a = i10;
        this.f28445b = k8Var;
    }

    @Override
    public final void run() {
        switch (this.f28444a) {
            case 0:
                k8.o(this.f28445b);
                return;
            default:
                k8.G(this.f28445b);
                return;
        }
    }
}
