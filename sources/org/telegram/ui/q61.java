package org.telegram.ui;
public final class q61 implements Runnable {
    public final int f36906a;
    public final r61 f36907b;

    public q61(r61 r61Var, int i10) {
        this.f36906a = i10;
        this.f36907b = r61Var;
    }

    @Override
    public final void run() {
        switch (this.f36906a) {
            case 0:
                r61.a(this.f36907b);
                return;
            default:
                this.f36907b.dismiss();
                return;
        }
    }
}
