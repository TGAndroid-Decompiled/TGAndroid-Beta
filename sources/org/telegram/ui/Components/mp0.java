package org.telegram.ui.Components;
public final class mp0 implements o1.g {
    public final int f28666a;
    public final vp0 f28667b;

    public mp0(vp0 vp0Var, int i10) {
        this.f28666a = i10;
        this.f28667b = vp0Var;
    }

    @Override
    public final void a(o1.h hVar, float f7, float f10) {
        switch (this.f28666a) {
            case 0:
                this.f28667b.f32008o.setScaleX(1.0f / f7);
                return;
            case 1:
                this.f28667b.f32008o.setScaleY(1.0f / f7);
                return;
            case 2:
                this.f28667b.f32008o.setScaleX(1.0f / f7);
                return;
            default:
                this.f28667b.f32008o.setScaleY(1.0f / f7);
                return;
        }
    }
}
