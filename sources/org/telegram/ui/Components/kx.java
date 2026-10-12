package org.telegram.ui.Components;
public final class kx implements Runnable {
    public final int f27952a;
    public final qz f27953b;

    public kx(qz qzVar, int i10) {
        this.f27952a = i10;
        this.f27953b = qzVar;
    }

    @Override
    public final void run() {
        switch (this.f27952a) {
            case 0:
            default:
                this.f27953b.d();
                return;
        }
    }
}
