package org.telegram.ui.Components;
public final class he0 implements Runnable {
    public final int f35879a;
    public final le0 f35880b;

    public he0(le0 le0Var, int i7) {
        this.f35879a = i7;
        this.f35880b = le0Var;
    }

    @Override
    public final void run() {
        switch (this.f35879a) {
            case 0:
                this.f35880b.e();
                return;
            default:
                this.f35880b.g();
                return;
        }
    }
}
