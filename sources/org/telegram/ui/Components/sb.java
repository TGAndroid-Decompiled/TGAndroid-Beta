package org.telegram.ui.Components;
public final class sb implements o1.g {
    public final int f28220a;
    public final ub f28221b;
    public final q0.a f28222c;

    public sb(q0.a aVar, ub ubVar, int i10) {
        this.f28220a = i10;
        this.f28222c = aVar;
        this.f28221b = ubVar;
    }

    @Override
    public final void a(o1.h hVar, float f7, float f10) {
        switch (this.f28220a) {
            case 0:
                ((gb) this.f28222c).accept(Float.valueOf(this.f28221b.getTranslationY()));
                return;
            default:
                ((nl) this.f28222c).accept(Float.valueOf(this.f28221b.getTranslationY()));
                return;
        }
    }
}
