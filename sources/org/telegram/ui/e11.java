package org.telegram.ui;
public final class e11 implements Runnable {
    public final int f45174a;
    public final org.telegram.ui.Cells.z5 f45175b;

    public e11(org.telegram.ui.Cells.z5 z5Var, int i7) {
        this.f45174a = i7;
        this.f45175b = z5Var;
    }

    @Override
    public final void run() {
        switch (this.f45174a) {
            case 0:
                org.telegram.messenger.g0.K3(((i01) this.f45175b.Z1).h);
                return;
            default:
                this.f45175b.requestFocus();
                return;
        }
    }
}
