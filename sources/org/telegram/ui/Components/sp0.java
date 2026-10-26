package org.telegram.ui.Components;
public final class sp0 implements o1.g {
    public final int f32657a;
    public final bq0 f32658b;

    public sp0(bq0 bq0Var, int i10) {
        this.f32657a = i10;
        this.f32658b = bq0Var;
    }

    @Override
    public final void a(o1.h hVar, float f7, float f10) {
        switch (this.f32657a) {
            case 0:
                this.f32658b.f26940o.setScaleX(1.0f / f7);
                return;
            case 1:
                this.f32658b.f26940o.setScaleY(1.0f / f7);
                return;
            case 2:
                this.f32658b.f26940o.setScaleX(1.0f / f7);
                return;
            default:
                this.f32658b.f26940o.setScaleY(1.0f / f7);
                return;
        }
    }
}
