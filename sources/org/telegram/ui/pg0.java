package org.telegram.ui;
public final class pg0 implements Runnable {
    public final int f50852a;
    public final vg0 f50853b;

    public pg0(vg0 vg0Var, int i7) {
        this.f50852a = i7;
        this.f50853b = vg0Var;
    }

    @Override
    public final void run() {
        switch (this.f50852a) {
            case 0:
                this.f50853b.dismiss();
                return;
            case 1:
                this.f50853b.h1(true, false);
                return;
            default:
                this.f50853b.h1(true, false);
                return;
        }
    }
}
