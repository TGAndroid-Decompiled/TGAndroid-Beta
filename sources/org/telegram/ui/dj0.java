package org.telegram.ui;
public final class dj0 implements Runnable {
    public final int f33487a;
    public final jj0 f33488b;

    public dj0(jj0 jj0Var, int i10) {
        this.f33487a = i10;
        this.f33488b = jj0Var;
    }

    @Override
    public final void run() {
        switch (this.f33487a) {
            case 0:
                this.f33488b.dismiss();
                return;
            case 1:
                this.f33488b.U(true, false);
                return;
            default:
                this.f33488b.U(true, false);
                return;
        }
    }
}
