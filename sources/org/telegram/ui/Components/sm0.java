package org.telegram.ui.Components;
public final class sm0 implements r1.d {
    public final int f38082a;
    public final bn0 f38083b;

    public sm0(bn0 bn0Var, int i7) {
        this.f38082a = i7;
        this.f38083b = bn0Var;
    }

    @Override
    public final void a(r1.g gVar, float f10, float f11) {
        switch (this.f38082a) {
            case 0:
                this.f38083b.f32251o.setScaleX(1.0f / f10);
                return;
            case 1:
                this.f38083b.f32251o.setScaleY(1.0f / f10);
                return;
            case 2:
                this.f38083b.f32251o.setScaleX(1.0f / f10);
                return;
            default:
                this.f38083b.f32251o.setScaleY(1.0f / f10);
                return;
        }
    }
}
