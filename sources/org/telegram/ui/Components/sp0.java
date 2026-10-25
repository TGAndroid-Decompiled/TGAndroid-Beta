package org.telegram.ui.Components;
public final class sp0 implements o1.g {
    public final int f32655a;
    public final bq0 f32656b;

    public sp0(bq0 bq0Var, int i10) {
        this.f32655a = i10;
        this.f32656b = bq0Var;
    }

    @Override
    public final void a(o1.h hVar, float f7, float f10) {
        switch (this.f32655a) {
            case 0:
                this.f32656b.f26938o.setScaleX(1.0f / f7);
                return;
            case 1:
                this.f32656b.f26938o.setScaleY(1.0f / f7);
                return;
            case 2:
                this.f32656b.f26938o.setScaleX(1.0f / f7);
                return;
            default:
                this.f32656b.f26938o.setScaleY(1.0f / f7);
                return;
        }
    }
}
