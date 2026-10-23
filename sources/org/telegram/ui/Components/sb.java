package org.telegram.ui.Components;
public final class sb implements o1.g {
    public final int f30244a;
    public final ub f30245b;
    public final q0.a f30246c;

    public sb(q0.a aVar, ub ubVar, int i10) {
        this.f30244a = i10;
        this.f30246c = aVar;
        this.f30245b = ubVar;
    }

    @Override
    public final void a(o1.h hVar, float f7, float f10) {
        switch (this.f30244a) {
            case 0:
                ((gb) this.f30246c).accept(Float.valueOf(this.f30245b.getTranslationY()));
                return;
            default:
                ((xl) this.f30246c).accept(Float.valueOf(this.f30245b.getTranslationY()));
                return;
        }
    }
}
