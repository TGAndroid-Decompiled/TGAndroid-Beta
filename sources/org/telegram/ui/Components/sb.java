package org.telegram.ui.Components;
public final class sb implements o1.g {
    public final int f30274a;
    public final ub f30275b;
    public final q0.a f30276c;

    public sb(q0.a aVar, ub ubVar, int i10) {
        this.f30274a = i10;
        this.f30276c = aVar;
        this.f30275b = ubVar;
    }

    @Override
    public final void a(o1.h hVar, float f7, float f10) {
        switch (this.f30274a) {
            case 0:
                ((gb) this.f30276c).accept(Float.valueOf(this.f30275b.getTranslationY()));
                return;
            default:
                ((ml) this.f30276c).accept(Float.valueOf(this.f30275b.getTranslationY()));
                return;
        }
    }
}
