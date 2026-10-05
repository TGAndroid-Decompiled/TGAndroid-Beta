package org.telegram.ui;
public final class q61 implements Runnable {
    public final int f39723a;
    public final r61 f39724b;

    public q61(r61 r61Var, int i10) {
        this.f39723a = i10;
        this.f39724b = r61Var;
    }

    @Override
    public final void run() {
        switch (this.f39723a) {
            case 0:
                r61.a(this.f39724b);
                return;
            default:
                this.f39724b.dismiss();
                return;
        }
    }
}
