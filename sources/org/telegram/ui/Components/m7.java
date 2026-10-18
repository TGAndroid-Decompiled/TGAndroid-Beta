package org.telegram.ui.Components;
public final class m7 implements Runnable {
    public final int f28454a;
    public final k8 f28455b;

    public m7(k8 k8Var, int i10) {
        this.f28454a = i10;
        this.f28455b = k8Var;
    }

    @Override
    public final void run() {
        switch (this.f28454a) {
            case 0:
                k8.o(this.f28455b);
                return;
            default:
                k8.H(this.f28455b);
                return;
        }
    }
}
