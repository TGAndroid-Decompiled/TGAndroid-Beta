package org.telegram.ui;
public final class bn0 implements Runnable {
    public final int f36084a;
    public final ln0 f36085b;

    public bn0(ln0 ln0Var, int i10) {
        this.f36084a = i10;
        this.f36085b = ln0Var;
    }

    @Override
    public final void run() {
        int i10 = this.f36084a;
        ln0 ln0Var = this.f36085b;
        switch (i10) {
            case 0:
                if (ln0Var.G) {
                    ln0Var.f39317b.invalidate();
                    return;
                }
                return;
            case 1:
                ln0Var.h();
                return;
            case 2:
                int i11 = ln0.f39314q0;
                ln0Var.h();
                return;
            default:
                int i12 = ln0.f39314q0;
                ln0Var.h();
                return;
        }
    }
}
