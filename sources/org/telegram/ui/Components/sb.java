package org.telegram.ui.Components;
public final class sb implements o1.g {
    public final int f30246a;
    public final ub f30247b;
    public final q0.a f30248c;

    public sb(q0.a aVar, ub ubVar, int i10) {
        this.f30246a = i10;
        this.f30248c = aVar;
        this.f30247b = ubVar;
    }

    @Override
    public final void a(o1.h hVar, float f7, float f10) {
        switch (this.f30246a) {
            case 0:
                ((gb) this.f30248c).accept(Float.valueOf(this.f30247b.getTranslationY()));
                return;
            default:
                ((ml) this.f30248c).accept(Float.valueOf(this.f30247b.getTranslationY()));
                return;
        }
    }
}
