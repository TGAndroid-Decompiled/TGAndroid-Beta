package org.telegram.ui;
public final class q61 implements Runnable {
    public final int f36806a;
    public final r61 f36807b;

    public q61(r61 r61Var, int i10) {
        this.f36806a = i10;
        this.f36807b = r61Var;
    }

    @Override
    public final void run() {
        switch (this.f36806a) {
            case 0:
                r61.a(this.f36807b);
                return;
            default:
                this.f36807b.dismiss();
                return;
        }
    }
}
