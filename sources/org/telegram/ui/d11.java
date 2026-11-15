package org.telegram.ui;
public final class d11 implements Runnable {
    public final int f46287a;
    public final e11 f46288b;

    public d11(e11 e11Var, int i7) {
        this.f46287a = i7;
        this.f46288b = e11Var;
    }

    @Override
    public final void run() {
        switch (this.f46287a) {
            case 0:
                e11.a(this.f46288b);
                return;
            default:
                this.f46288b.dismiss();
                return;
        }
    }
}
