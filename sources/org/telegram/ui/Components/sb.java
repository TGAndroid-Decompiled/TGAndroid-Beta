package org.telegram.ui.Components;
public final class sb implements o1.g {
    public final int f28219a;
    public final ub f28220b;
    public final q0.a f28221c;

    public sb(q0.a aVar, ub ubVar, int i10) {
        this.f28219a = i10;
        this.f28221c = aVar;
        this.f28220b = ubVar;
    }

    @Override
    public final void a(o1.h hVar, float f7, float f10) {
        switch (this.f28219a) {
            case 0:
                ((gb) this.f28221c).accept(Float.valueOf(this.f28220b.getTranslationY()));
                return;
            default:
                ((nl) this.f28221c).accept(Float.valueOf(this.f28220b.getTranslationY()));
                return;
        }
    }
}
