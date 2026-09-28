package org.telegram.ui.Components;
public final class sb implements o1.g {
    public final int f28185a;
    public final ub f28186b;
    public final q0.a f28187c;

    public sb(q0.a aVar, ub ubVar, int i10) {
        this.f28185a = i10;
        this.f28187c = aVar;
        this.f28186b = ubVar;
    }

    @Override
    public final void a(o1.h hVar, float f7, float f10) {
        switch (this.f28185a) {
            case 0:
                ((gb) this.f28187c).accept(Float.valueOf(this.f28186b.getTranslationY()));
                return;
            default:
                ((ol) this.f28187c).accept(Float.valueOf(this.f28186b.getTranslationY()));
                return;
        }
    }
}
