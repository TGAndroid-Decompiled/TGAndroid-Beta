package org.telegram.ui;
public final class m61 implements Runnable {
    public final int f35989a;
    public final n61 f35990b;

    public m61(n61 n61Var, int i10) {
        this.f35989a = i10;
        this.f35990b = n61Var;
    }

    @Override
    public final void run() {
        switch (this.f35989a) {
            case 0:
                n61.a(this.f35990b);
                return;
            default:
                this.f35990b.dismiss();
                return;
        }
    }
}
