package org.telegram.ui;
public final class h11 implements Runnable {
    public final int f46205a;
    public final org.telegram.ui.Cells.z5 f46206b;

    public h11(org.telegram.ui.Cells.z5 z5Var, int i7) {
        this.f46205a = i7;
        this.f46206b = z5Var;
    }

    @Override
    public final void run() {
        switch (this.f46205a) {
            case 0:
                org.telegram.messenger.g0.K3(((l01) this.f46206b.Z1).h);
                return;
            default:
                this.f46206b.requestFocus();
                return;
        }
    }
}
