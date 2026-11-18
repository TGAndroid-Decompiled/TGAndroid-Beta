package org.telegram.ui;
public final class pg0 implements Runnable {
    public final int f50835a;
    public final vg0 f50836b;

    public pg0(vg0 vg0Var, int i7) {
        this.f50835a = i7;
        this.f50836b = vg0Var;
    }

    @Override
    public final void run() {
        switch (this.f50835a) {
            case 0:
                this.f50836b.dismiss();
                return;
            case 1:
                this.f50836b.h1(true, false);
                return;
            default:
                this.f50836b.h1(true, false);
                return;
        }
    }
}
