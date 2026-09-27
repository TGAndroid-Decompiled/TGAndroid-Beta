package org.telegram.ui.Components;
public final class ap0 implements o1.g {
    public final int f22730a;
    public final kp0 f22731b;

    public ap0(kp0 kp0Var, int i10) {
        this.f22730a = i10;
        this.f22731b = kp0Var;
    }

    @Override
    public final void a(o1.h hVar, float f7, float f10) {
        switch (this.f22730a) {
            case 0:
                this.f22731b.f25811o.setScaleX(1.0f / f7);
                return;
            case 1:
                this.f22731b.f25811o.setScaleY(1.0f / f7);
                return;
            case 2:
                this.f22731b.f25811o.setScaleX(1.0f / f7);
                return;
            default:
                this.f22731b.f25811o.setScaleY(1.0f / f7);
                return;
        }
    }
}
