package org.telegram.ui.Components;
public final class sb implements o1.g {
    public final int f28113a;
    public final ub f28114b;
    public final q0.a f28115c;

    public sb(q0.a aVar, ub ubVar, int i10) {
        this.f28113a = i10;
        this.f28115c = aVar;
        this.f28114b = ubVar;
    }

    @Override
    public final void a(o1.h hVar, float f7, float f10) {
        switch (this.f28113a) {
            case 0:
                ((gb) this.f28115c).accept(Float.valueOf(this.f28114b.getTranslationY()));
                return;
            default:
                ((ml) this.f28115c).accept(Float.valueOf(this.f28114b.getTranslationY()));
                return;
        }
    }
}
