package org.telegram.ui;
public final class pg0 implements Runnable {
    public final int f50878a;
    public final vg0 f50879b;

    public pg0(vg0 vg0Var, int i7) {
        this.f50878a = i7;
        this.f50879b = vg0Var;
    }

    @Override
    public final void run() {
        switch (this.f50878a) {
            case 0:
                this.f50879b.dismiss();
                return;
            case 1:
                this.f50879b.h1(true, false);
                return;
            default:
                this.f50879b.h1(true, false);
                return;
        }
    }
}
