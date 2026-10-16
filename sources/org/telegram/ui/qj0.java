package org.telegram.ui;
public final class qj0 implements Runnable {
    public final int f39180a;
    public final wj0 f39181b;

    public qj0(wj0 wj0Var, int i10) {
        this.f39180a = i10;
        this.f39181b = wj0Var;
    }

    @Override
    public final void run() {
        switch (this.f39180a) {
            case 0:
                this.f39181b.dismiss();
                return;
            case 1:
                this.f39181b.V(true, false);
                return;
            default:
                this.f39181b.V(true, false);
                return;
        }
    }
}
