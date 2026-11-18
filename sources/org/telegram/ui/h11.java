package org.telegram.ui;
public final class h11 implements Runnable {
    public final int f48125a;
    public final i11 f48126b;

    public h11(i11 i11Var, int i7) {
        this.f48125a = i7;
        this.f48126b = i11Var;
    }

    @Override
    public final void run() {
        switch (this.f48125a) {
            case 0:
                i11.a(this.f48126b);
                return;
            default:
                this.f48126b.dismiss();
                return;
        }
    }
}
