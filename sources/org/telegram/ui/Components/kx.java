package org.telegram.ui.Components;
public final class kx implements Runnable {
    public final int f27937a;
    public final qz f27938b;

    public kx(qz qzVar, int i10) {
        this.f27937a = i10;
        this.f27938b = qzVar;
    }

    @Override
    public final void run() {
        switch (this.f27937a) {
            case 0:
            default:
                this.f27938b.d();
                return;
        }
    }
}
