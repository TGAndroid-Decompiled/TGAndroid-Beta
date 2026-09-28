package org.telegram.ui.Components;
public final class bp0 implements o1.g {
    public final int f23081a;
    public final kp0 f23082b;

    public bp0(kp0 kp0Var, int i10) {
        this.f23081a = i10;
        this.f23082b = kp0Var;
    }

    @Override
    public final void a(o1.h hVar, float f7, float f10) {
        switch (this.f23081a) {
            case 0:
                this.f23082b.f25782o.setScaleX(1.0f / f7);
                return;
            case 1:
                this.f23082b.f25782o.setScaleY(1.0f / f7);
                return;
            case 2:
                this.f23082b.f25782o.setScaleX(1.0f / f7);
                return;
            default:
                this.f23082b.f25782o.setScaleY(1.0f / f7);
                return;
        }
    }
}
