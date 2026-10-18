package org.telegram.ui.Components;
public final class sb implements o1.g {
    public final int f30236a;
    public final ub f30237b;
    public final q0.a f30238c;

    public sb(q0.a aVar, ub ubVar, int i10) {
        this.f30236a = i10;
        this.f30238c = aVar;
        this.f30237b = ubVar;
    }

    @Override
    public final void a(o1.h hVar, float f7, float f10) {
        switch (this.f30236a) {
            case 0:
                ((gb) this.f30238c).accept(Float.valueOf(this.f30237b.getTranslationY()));
                return;
            default:
                ((xl) this.f30238c).accept(Float.valueOf(this.f30237b.getTranslationY()));
                return;
        }
    }
}
