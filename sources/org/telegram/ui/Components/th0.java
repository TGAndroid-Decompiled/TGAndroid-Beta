package org.telegram.ui.Components;
public final class th0 implements Runnable {
    public final int f32999a;
    public final wh0 f33000b;

    public th0(wh0 wh0Var, int i10) {
        this.f32999a = i10;
        this.f33000b = wh0Var;
    }

    @Override
    public final void run() {
        switch (this.f32999a) {
            case 0:
                this.f33000b.a(true);
                return;
            default:
                this.f33000b.d();
                return;
        }
    }
}
