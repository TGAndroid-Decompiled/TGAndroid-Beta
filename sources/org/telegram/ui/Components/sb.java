package org.telegram.ui.Components;
public final class sb implements o1.g {
    public final int f28212a;
    public final ub f28213b;
    public final q0.a f28214c;

    public sb(q0.a aVar, ub ubVar, int i10) {
        this.f28212a = i10;
        this.f28214c = aVar;
        this.f28213b = ubVar;
    }

    @Override
    public final void a(o1.h hVar, float f7, float f10) {
        switch (this.f28212a) {
            case 0:
                ((gb) this.f28214c).accept(Float.valueOf(this.f28213b.getTranslationY()));
                return;
            default:
                ((nl) this.f28214c).accept(Float.valueOf(this.f28213b.getTranslationY()));
                return;
        }
    }
}
