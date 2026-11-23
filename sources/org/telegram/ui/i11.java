package org.telegram.ui;
public final class i11 implements Runnable {
    public final int f48559a;
    public final j11 f48560b;

    public i11(j11 j11Var, int i7) {
        this.f48559a = i7;
        this.f48560b = j11Var;
    }

    @Override
    public final void run() {
        switch (this.f48559a) {
            case 0:
                j11.a(this.f48560b);
                return;
            default:
                this.f48560b.dismiss();
                return;
        }
    }
}
