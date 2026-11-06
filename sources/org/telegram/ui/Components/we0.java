package org.telegram.ui.Components;
public final class we0 implements Runnable {
    public final int f39956a;
    public final ze0 f39957b;

    public we0(ze0 ze0Var, int i7) {
        this.f39956a = i7;
        this.f39957b = ze0Var;
    }

    @Override
    public final void run() {
        switch (this.f39956a) {
            case 0:
                this.f39957b.a(true);
                return;
            default:
                this.f39957b.d();
                return;
        }
    }
}
