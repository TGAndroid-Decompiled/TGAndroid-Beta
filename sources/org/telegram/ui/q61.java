package org.telegram.ui;
public final class q61 implements Runnable {
    public final int f36805a;
    public final r61 f36806b;

    public q61(r61 r61Var, int i10) {
        this.f36805a = i10;
        this.f36806b = r61Var;
    }

    @Override
    public final void run() {
        switch (this.f36805a) {
            case 0:
                r61.a(this.f36806b);
                return;
            default:
                this.f36806b.dismiss();
                return;
        }
    }
}
