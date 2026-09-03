package org.telegram.ui;
public final class m61 implements Runnable {
    public final int f38863a;
    public final n61 f38864b;

    public m61(n61 n61Var, int i10) {
        this.f38863a = i10;
        this.f38864b = n61Var;
    }

    @Override
    public final void run() {
        switch (this.f38863a) {
            case 0:
                n61.a(this.f38864b);
                return;
            default:
                this.f38864b.dismiss();
                return;
        }
    }
}
