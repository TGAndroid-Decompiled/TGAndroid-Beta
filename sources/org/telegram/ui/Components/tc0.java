package org.telegram.ui.Components;
public final class tc0 implements Runnable {
    public final int f32967a;
    public final uc0 f32968b;

    public tc0(uc0 uc0Var, int i10) {
        this.f32967a = i10;
        this.f32968b = uc0Var;
    }

    @Override
    public final void run() {
        switch (this.f32967a) {
            case 0:
                this.f32968b.y();
                return;
            default:
                this.f32968b.m(true);
                return;
        }
    }
}
