package org.telegram.ui.Components;
public final class he0 implements Runnable {
    public final int f35825a;
    public final le0 f35826b;

    public he0(le0 le0Var, int i7) {
        this.f35825a = i7;
        this.f35826b = le0Var;
    }

    @Override
    public final void run() {
        switch (this.f35825a) {
            case 0:
                this.f35826b.e();
                return;
            default:
                this.f35826b.g();
                return;
        }
    }
}
