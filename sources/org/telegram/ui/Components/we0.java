package org.telegram.ui.Components;
public final class we0 implements Runnable {
    public final int f39949a;
    public final ze0 f39950b;

    public we0(ze0 ze0Var, int i7) {
        this.f39949a = i7;
        this.f39950b = ze0Var;
    }

    @Override
    public final void run() {
        switch (this.f39949a) {
            case 0:
                this.f39950b.a(true);
                return;
            default:
                this.f39950b.d();
                return;
        }
    }
}
