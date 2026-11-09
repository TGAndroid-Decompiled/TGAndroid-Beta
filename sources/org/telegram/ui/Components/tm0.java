package org.telegram.ui.Components;
public final class tm0 implements r1.d {
    public final int f38452a;
    public final cn0 f38453b;

    public tm0(cn0 cn0Var, int i7) {
        this.f38452a = i7;
        this.f38453b = cn0Var;
    }

    @Override
    public final void a(r1.g gVar, float f10, float f11) {
        switch (this.f38452a) {
            case 0:
                this.f38453b.f32716o.setScaleX(1.0f / f10);
                return;
            case 1:
                this.f38453b.f32716o.setScaleY(1.0f / f10);
                return;
            case 2:
                this.f38453b.f32716o.setScaleX(1.0f / f10);
                return;
            default:
                this.f38453b.f32716o.setScaleY(1.0f / f10);
                return;
        }
    }
}
