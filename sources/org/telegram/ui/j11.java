package org.telegram.ui;
public final class j11 implements Runnable {
    public final int f46792a;
    public final k11 f46793b;

    public j11(k11 k11Var, int i7) {
        this.f46792a = i7;
        this.f46793b = k11Var;
    }

    @Override
    public final void run() {
        switch (this.f46792a) {
            case 0:
                k11.a(this.f46793b);
                return;
            default:
                this.f46793b.dismiss();
                return;
        }
    }
}
