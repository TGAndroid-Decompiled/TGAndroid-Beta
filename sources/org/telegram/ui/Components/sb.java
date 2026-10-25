package org.telegram.ui.Components;
public final class sb implements o1.g {
    public final int f32500a;
    public final ub f32501b;
    public final q0.a f32502c;

    public sb(q0.a aVar, ub ubVar, int i10) {
        this.f32500a = i10;
        this.f32502c = aVar;
        this.f32501b = ubVar;
    }

    @Override
    public final void a(o1.h hVar, float f7, float f10) {
        switch (this.f32500a) {
            case 0:
                ((gb) this.f32502c).accept(Float.valueOf(this.f32501b.getTranslationY()));
                return;
            default:
                ((yl) this.f32502c).accept(Float.valueOf(this.f32501b.getTranslationY()));
                return;
        }
    }
}
