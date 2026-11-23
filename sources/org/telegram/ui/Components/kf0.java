package org.telegram.ui.Components;
public final class kf0 implements Runnable {
    public final int f36736a;
    public final nf0 f36737b;

    public kf0(nf0 nf0Var, int i7) {
        this.f36736a = i7;
        this.f36737b = nf0Var;
    }

    @Override
    public final void run() {
        switch (this.f36736a) {
            case 0:
                this.f36737b.a(true);
                return;
            default:
                this.f36737b.d();
                return;
        }
    }
}
