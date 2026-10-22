package org.telegram.ui.Components;
public final class sb implements o1.g {
    public final int f30243a;
    public final ub f30244b;
    public final q0.a f30245c;

    public sb(q0.a aVar, ub ubVar, int i10) {
        this.f30243a = i10;
        this.f30245c = aVar;
        this.f30244b = ubVar;
    }

    @Override
    public final void a(o1.h hVar, float f7, float f10) {
        switch (this.f30243a) {
            case 0:
                ((gb) this.f30245c).accept(Float.valueOf(this.f30244b.getTranslationY()));
                return;
            default:
                ((xl) this.f30245c).accept(Float.valueOf(this.f30244b.getTranslationY()));
                return;
        }
    }
}
