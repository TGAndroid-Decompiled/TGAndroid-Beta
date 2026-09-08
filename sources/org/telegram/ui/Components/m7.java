package org.telegram.ui.Components;
public final class m7 implements Runnable {
    public final int f28425a;
    public final k8 f28426b;

    public m7(k8 k8Var, int i10) {
        this.f28425a = i10;
        this.f28426b = k8Var;
    }

    @Override
    public final void run() {
        switch (this.f28425a) {
            case 0:
                k8.n(this.f28426b);
                return;
            default:
                k8.G(this.f28426b);
                return;
        }
    }
}
