package org.telegram.ui.Components;
public final class xc0 implements Runnable {
    public final int f32518a;
    public final yc0 f32519b;

    public xc0(yc0 yc0Var, int i10) {
        this.f32518a = i10;
        this.f32519b = yc0Var;
    }

    @Override
    public final void run() {
        switch (this.f32518a) {
            case 0:
                this.f32519b.y();
                return;
            default:
                this.f32519b.m(true);
                return;
        }
    }
}
