package org.telegram.ui.Components;
public final class sb implements o1.g {
    public final int f30221a;
    public final ub f30222b;
    public final q0.a f30223c;

    public sb(q0.a aVar, ub ubVar, int i10) {
        this.f30221a = i10;
        this.f30223c = aVar;
        this.f30222b = ubVar;
    }

    @Override
    public final void a(o1.h hVar, float f7, float f10) {
        switch (this.f30221a) {
            case 0:
                ((gb) this.f30223c).accept(Float.valueOf(this.f30222b.getTranslationY()));
                return;
            default:
                ((xl) this.f30223c).accept(Float.valueOf(this.f30222b.getTranslationY()));
                return;
        }
    }
}
