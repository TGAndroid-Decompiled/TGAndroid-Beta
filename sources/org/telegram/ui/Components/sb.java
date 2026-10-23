package org.telegram.ui.Components;
public final class sb implements o1.g {
    public final int f30449a;
    public final ub f30450b;
    public final q0.a f30451c;

    public sb(q0.a aVar, ub ubVar, int i10) {
        this.f30449a = i10;
        this.f30451c = aVar;
        this.f30450b = ubVar;
    }

    @Override
    public final void a(o1.h hVar, float f7, float f10) {
        switch (this.f30449a) {
            case 0:
                ((gb) this.f30451c).accept(Float.valueOf(this.f30450b.getTranslationY()));
                return;
            default:
                ((xl) this.f30451c).accept(Float.valueOf(this.f30450b.getTranslationY()));
                return;
        }
    }
}
