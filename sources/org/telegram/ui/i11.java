package org.telegram.ui;
public final class i11 implements Runnable {
    public final int f48555a;
    public final j11 f48556b;

    public i11(j11 j11Var, int i7) {
        this.f48555a = i7;
        this.f48556b = j11Var;
    }

    @Override
    public final void run() {
        switch (this.f48555a) {
            case 0:
                j11.a(this.f48556b);
                return;
            default:
                this.f48556b.dismiss();
                return;
        }
    }
}
