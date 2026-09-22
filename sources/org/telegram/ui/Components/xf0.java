package org.telegram.ui.Components;
public final class xf0 implements Runnable {
    public final int f30316a;
    public final bg0 f30317b;

    public xf0(bg0 bg0Var, int i10) {
        this.f30316a = i10;
        this.f30317b = bg0Var;
    }

    @Override
    public final void run() {
        switch (this.f30316a) {
            case 0:
                this.f30317b.e();
                return;
            default:
                this.f30317b.g();
                return;
        }
    }
}
