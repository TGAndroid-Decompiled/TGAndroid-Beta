package org.telegram.ui;
public final class q61 implements Runnable {
    public final int f36791a;
    public final r61 f36792b;

    public q61(r61 r61Var, int i10) {
        this.f36791a = i10;
        this.f36792b = r61Var;
    }

    @Override
    public final void run() {
        switch (this.f36791a) {
            case 0:
                r61.a(this.f36792b);
                return;
            default:
                this.f36792b.dismiss();
                return;
        }
    }
}
