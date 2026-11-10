package org.telegram.ui.Components;
public final class we0 implements Runnable {
    public final int f39955a;
    public final ze0 f39956b;

    public we0(ze0 ze0Var, int i7) {
        this.f39955a = i7;
        this.f39956b = ze0Var;
    }

    @Override
    public final void run() {
        switch (this.f39955a) {
            case 0:
                this.f39956b.a(true);
                return;
            default:
                this.f39956b.d();
                return;
        }
    }
}
