package org.telegram.ui.Components;
public final class tc0 implements Runnable {
    public final int f32964a;
    public final uc0 f32965b;

    public tc0(uc0 uc0Var, int i10) {
        this.f32964a = i10;
        this.f32965b = uc0Var;
    }

    @Override
    public final void run() {
        switch (this.f32964a) {
            case 0:
                this.f32965b.y();
                return;
            default:
                this.f32965b.m(true);
                return;
        }
    }
}
