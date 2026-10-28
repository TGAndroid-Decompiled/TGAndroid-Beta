package org.telegram.ui.Components;
public final class sb implements o1.g {
    public final int f32543a;
    public final ub f32544b;
    public final q0.a f32545c;

    public sb(q0.a aVar, ub ubVar, int i10) {
        this.f32543a = i10;
        this.f32545c = aVar;
        this.f32544b = ubVar;
    }

    @Override
    public final void a(o1.h hVar, float f7, float f10) {
        switch (this.f32543a) {
            case 0:
                ((gb) this.f32545c).accept(Float.valueOf(this.f32544b.getTranslationY()));
                return;
            default:
                ((yl) this.f32545c).accept(Float.valueOf(this.f32544b.getTranslationY()));
                return;
        }
    }
}
