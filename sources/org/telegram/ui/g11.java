package org.telegram.ui;
public final class g11 implements Runnable {
    public final int f45841a;
    public final org.telegram.ui.Cells.z5 f45842b;

    public g11(org.telegram.ui.Cells.z5 z5Var, int i7) {
        this.f45841a = i7;
        this.f45842b = z5Var;
    }

    @Override
    public final void run() {
        switch (this.f45841a) {
            case 0:
                org.telegram.messenger.g0.K3(((k01) this.f45842b.Z1).h);
                return;
            default:
                this.f45842b.requestFocus();
                return;
        }
    }
}
