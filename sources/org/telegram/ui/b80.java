package org.telegram.ui;
public final class b80 implements Runnable {
    public final int f32015a;
    public final i80 f32016b;

    public b80(i80 i80Var, int i10) {
        this.f32015a = i10;
        this.f32016b = i80Var;
    }

    @Override
    public final void run() {
        switch (this.f32015a) {
            case 0:
                i80 i80Var = this.f32016b;
                i80Var.h.postOnAnimation(new b80(i80Var, 1));
                return;
            default:
                this.f32016b.Y();
                return;
        }
    }
}
