package org.telegram.ui.Components;
public final class m7 implements Runnable {
    public final int f28426a;
    public final k8 f28427b;

    public m7(k8 k8Var, int i10) {
        this.f28426a = i10;
        this.f28427b = k8Var;
    }

    @Override
    public final void run() {
        switch (this.f28426a) {
            case 0:
                k8.n(this.f28427b);
                return;
            default:
                k8.G(this.f28427b);
                return;
        }
    }
}
