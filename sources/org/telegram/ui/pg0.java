package org.telegram.ui;
public final class pg0 implements Runnable {
    public final int f50874a;
    public final vg0 f50875b;

    public pg0(vg0 vg0Var, int i7) {
        this.f50874a = i7;
        this.f50875b = vg0Var;
    }

    @Override
    public final void run() {
        switch (this.f50874a) {
            case 0:
                this.f50875b.dismiss();
                return;
            case 1:
                this.f50875b.h1(true, false);
                return;
            default:
                this.f50875b.h1(true, false);
                return;
        }
    }
}
