package org.telegram.ui;
public final class c80 implements Runnable {
    public final int f32630a;
    public final j80 f32631b;

    public c80(j80 j80Var, int i10) {
        this.f32630a = i10;
        this.f32631b = j80Var;
    }

    @Override
    public final void run() {
        switch (this.f32630a) {
            case 0:
                j80 j80Var = this.f32631b;
                j80Var.h.postOnAnimation(new c80(j80Var, 1));
                return;
            default:
                this.f32631b.Y();
                return;
        }
    }
}
