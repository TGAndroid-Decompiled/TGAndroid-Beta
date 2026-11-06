package org.telegram.ui.Components;
public final class we0 implements Runnable {
    public final int f39964a;
    public final ze0 f39965b;

    public we0(ze0 ze0Var, int i7) {
        this.f39964a = i7;
        this.f39965b = ze0Var;
    }

    @Override
    public final void run() {
        switch (this.f39964a) {
            case 0:
                this.f39965b.a(true);
                return;
            default:
                this.f39965b.d();
                return;
        }
    }
}
