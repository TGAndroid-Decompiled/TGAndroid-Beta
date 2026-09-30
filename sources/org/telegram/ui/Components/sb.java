package org.telegram.ui.Components;
public final class sb implements o1.g {
    public final int f28183a;
    public final ub f28184b;
    public final q0.a f28185c;

    public sb(q0.a aVar, ub ubVar, int i10) {
        this.f28183a = i10;
        this.f28185c = aVar;
        this.f28184b = ubVar;
    }

    @Override
    public final void a(o1.h hVar, float f7, float f10) {
        switch (this.f28183a) {
            case 0:
                ((gb) this.f28185c).accept(Float.valueOf(this.f28184b.getTranslationY()));
                return;
            default:
                ((ol) this.f28185c).accept(Float.valueOf(this.f28184b.getTranslationY()));
                return;
        }
    }
}
