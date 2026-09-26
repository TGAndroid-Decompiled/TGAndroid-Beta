package org.telegram.ui.Components;
public final class xf0 implements Runnable {
    public final int f30339a;
    public final bg0 f30340b;

    public xf0(bg0 bg0Var, int i10) {
        this.f30339a = i10;
        this.f30340b = bg0Var;
    }

    @Override
    public final void run() {
        switch (this.f30339a) {
            case 0:
                this.f30340b.e();
                return;
            default:
                this.f30340b.g();
                return;
        }
    }
}
