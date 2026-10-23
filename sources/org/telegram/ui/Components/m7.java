package org.telegram.ui.Components;
public final class m7 implements Runnable {
    public final int f28573a;
    public final k8 f28574b;

    public m7(k8 k8Var, int i10) {
        this.f28573a = i10;
        this.f28574b = k8Var;
    }

    @Override
    public final void run() {
        switch (this.f28573a) {
            case 0:
                k8.t(this.f28574b);
                return;
            default:
                k8.v(this.f28574b);
                return;
        }
    }
}
