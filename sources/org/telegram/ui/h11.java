package org.telegram.ui;
public final class h11 implements Runnable {
    public final int f48168a;
    public final i11 f48169b;

    public h11(i11 i11Var, int i7) {
        this.f48168a = i7;
        this.f48169b = i11Var;
    }

    @Override
    public final void run() {
        switch (this.f48168a) {
            case 0:
                i11.a(this.f48169b);
                return;
            default:
                this.f48169b.dismiss();
                return;
        }
    }
}
