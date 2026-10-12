package org.telegram.ui.Components;
public final class xp0 implements o1.g {
    public final int f32812a;
    public final gq0 f32813b;

    public xp0(gq0 gq0Var, int i10) {
        this.f32812a = i10;
        this.f32813b = gq0Var;
    }

    @Override
    public final void a(o1.h hVar, float f7, float f10) {
        switch (this.f32812a) {
            case 0:
                this.f32813b.f26488o.setScaleX(1.0f / f7);
                return;
            case 1:
                this.f32813b.f26488o.setScaleY(1.0f / f7);
                return;
            case 2:
                this.f32813b.f26488o.setScaleX(1.0f / f7);
                return;
            default:
                this.f32813b.f26488o.setScaleY(1.0f / f7);
                return;
        }
    }
}
