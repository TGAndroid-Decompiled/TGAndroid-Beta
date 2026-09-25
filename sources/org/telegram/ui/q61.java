package org.telegram.ui;
public final class q61 implements Runnable {
    public final int f36807a;
    public final r61 f36808b;

    public q61(r61 r61Var, int i10) {
        this.f36807a = i10;
        this.f36808b = r61Var;
    }

    @Override
    public final void run() {
        switch (this.f36807a) {
            case 0:
                r61.a(this.f36808b);
                return;
            default:
                this.f36808b.dismiss();
                return;
        }
    }
}
