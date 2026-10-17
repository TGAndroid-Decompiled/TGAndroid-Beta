package org.telegram.ui.Components;
public final class sb implements o1.g {
    public final int f30229a;
    public final ub f30230b;
    public final q0.a f30231c;

    public sb(q0.a aVar, ub ubVar, int i10) {
        this.f30229a = i10;
        this.f30231c = aVar;
        this.f30230b = ubVar;
    }

    @Override
    public final void a(o1.h hVar, float f7, float f10) {
        switch (this.f30229a) {
            case 0:
                ((gb) this.f30231c).accept(Float.valueOf(this.f30230b.getTranslationY()));
                return;
            default:
                ((xl) this.f30231c).accept(Float.valueOf(this.f30230b.getTranslationY()));
                return;
        }
    }
}
