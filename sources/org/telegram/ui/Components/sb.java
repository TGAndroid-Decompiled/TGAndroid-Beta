package org.telegram.ui.Components;
public final class sb implements o1.g {
    public final int f30247a;
    public final ub f30248b;
    public final q0.a f30249c;

    public sb(q0.a aVar, ub ubVar, int i10) {
        this.f30247a = i10;
        this.f30249c = aVar;
        this.f30248b = ubVar;
    }

    @Override
    public final void a(o1.h hVar, float f7, float f10) {
        switch (this.f30247a) {
            case 0:
                ((gb) this.f30249c).accept(Float.valueOf(this.f30248b.getTranslationY()));
                return;
            default:
                ((ml) this.f30249c).accept(Float.valueOf(this.f30248b.getTranslationY()));
                return;
        }
    }
}
