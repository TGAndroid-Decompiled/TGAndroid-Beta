package org.telegram.ui.Components;
public final class we0 implements Runnable {
    public final int f39914a;
    public final ze0 f39915b;

    public we0(ze0 ze0Var, int i7) {
        this.f39914a = i7;
        this.f39915b = ze0Var;
    }

    @Override
    public final void run() {
        switch (this.f39914a) {
            case 0:
                this.f39915b.a(true);
                return;
            default:
                this.f39915b.d();
                return;
        }
    }
}
