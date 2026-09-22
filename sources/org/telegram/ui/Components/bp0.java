package org.telegram.ui.Components;
public final class bp0 implements o1.g {
    public final int f23070a;
    public final kp0 f23071b;

    public bp0(kp0 kp0Var, int i10) {
        this.f23070a = i10;
        this.f23071b = kp0Var;
    }

    @Override
    public final void a(o1.h hVar, float f7, float f10) {
        switch (this.f23070a) {
            case 0:
                this.f23071b.f25786o.setScaleX(1.0f / f7);
                return;
            case 1:
                this.f23071b.f25786o.setScaleY(1.0f / f7);
                return;
            case 2:
                this.f23071b.f25786o.setScaleX(1.0f / f7);
                return;
            default:
                this.f23071b.f25786o.setScaleY(1.0f / f7);
                return;
        }
    }
}
