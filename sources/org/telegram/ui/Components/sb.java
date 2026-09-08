package org.telegram.ui.Components;
public final class sb implements o1.g {
    public final int f30273a;
    public final ub f30274b;
    public final q0.a f30275c;

    public sb(q0.a aVar, ub ubVar, int i10) {
        this.f30273a = i10;
        this.f30275c = aVar;
        this.f30274b = ubVar;
    }

    @Override
    public final void a(o1.h hVar, float f7, float f10) {
        switch (this.f30273a) {
            case 0:
                ((gb) this.f30275c).accept(Float.valueOf(this.f30274b.getTranslationY()));
                return;
            default:
                ((ml) this.f30275c).accept(Float.valueOf(this.f30274b.getTranslationY()));
                return;
        }
    }
}
