package org.telegram.ui;
public final class e11 implements Runnable {
    public final int f45169a;
    public final org.telegram.ui.Cells.z5 f45170b;

    public e11(org.telegram.ui.Cells.z5 z5Var, int i7) {
        this.f45169a = i7;
        this.f45170b = z5Var;
    }

    @Override
    public final void run() {
        switch (this.f45169a) {
            case 0:
                org.telegram.messenger.g0.K3(((i01) this.f45170b.Z1).h);
                return;
            default:
                this.f45170b.requestFocus();
                return;
        }
    }
}
