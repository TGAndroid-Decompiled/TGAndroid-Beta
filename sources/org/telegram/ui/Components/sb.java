package org.telegram.ui.Components;
public final class sb implements o1.g {
    public final int f28218a;
    public final ub f28219b;
    public final q0.a f28220c;

    public sb(q0.a aVar, ub ubVar, int i10) {
        this.f28218a = i10;
        this.f28220c = aVar;
        this.f28219b = ubVar;
    }

    @Override
    public final void a(o1.h hVar, float f7, float f10) {
        switch (this.f28218a) {
            case 0:
                ((gb) this.f28220c).accept(Float.valueOf(this.f28219b.getTranslationY()));
                return;
            default:
                ((ol) this.f28220c).accept(Float.valueOf(this.f28219b.getTranslationY()));
                return;
        }
    }
}
