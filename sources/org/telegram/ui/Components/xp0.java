package org.telegram.ui.Components;
public final class xp0 implements o1.g {
    public final int f32822a;
    public final gq0 f32823b;

    public xp0(gq0 gq0Var, int i10) {
        this.f32822a = i10;
        this.f32823b = gq0Var;
    }

    @Override
    public final void a(o1.h hVar, float f7, float f10) {
        switch (this.f32822a) {
            case 0:
                this.f32823b.f26486o.setScaleX(1.0f / f7);
                return;
            case 1:
                this.f32823b.f26486o.setScaleY(1.0f / f7);
                return;
            case 2:
                this.f32823b.f26486o.setScaleX(1.0f / f7);
                return;
            default:
                this.f32823b.f26486o.setScaleY(1.0f / f7);
                return;
        }
    }
}
