package org.telegram.ui.Components;
public final class sb implements o1.g {
    public final int f30239a;
    public final ub f30240b;
    public final q0.a f30241c;

    public sb(q0.a aVar, ub ubVar, int i10) {
        this.f30239a = i10;
        this.f30241c = aVar;
        this.f30240b = ubVar;
    }

    @Override
    public final void a(o1.h hVar, float f7, float f10) {
        switch (this.f30239a) {
            case 0:
                ((gb) this.f30241c).accept(Float.valueOf(this.f30240b.getTranslationY()));
                return;
            default:
                ((xl) this.f30241c).accept(Float.valueOf(this.f30240b.getTranslationY()));
                return;
        }
    }
}
