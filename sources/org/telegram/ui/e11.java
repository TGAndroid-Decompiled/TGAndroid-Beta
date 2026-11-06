package org.telegram.ui;
public final class e11 implements Runnable {
    public final int f45175a;
    public final org.telegram.ui.Cells.z5 f45176b;

    public e11(org.telegram.ui.Cells.z5 z5Var, int i7) {
        this.f45175a = i7;
        this.f45176b = z5Var;
    }

    @Override
    public final void run() {
        switch (this.f45175a) {
            case 0:
                org.telegram.messenger.g0.K3(((i01) this.f45176b.Z1).h);
                return;
            default:
                this.f45176b.requestFocus();
                return;
        }
    }
}
