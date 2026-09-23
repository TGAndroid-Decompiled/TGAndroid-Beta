package org.telegram.ui.Components;
public final class sb implements o1.g {
    public final int f27894a;
    public final ub f27895b;
    public final q0.a f27896c;

    public sb(q0.a aVar, ub ubVar, int i10) {
        this.f27894a = i10;
        this.f27896c = aVar;
        this.f27895b = ubVar;
    }

    @Override
    public final void a(o1.h hVar, float f7, float f10) {
        switch (this.f27894a) {
            case 0:
                ((gb) this.f27896c).accept(Float.valueOf(this.f27895b.getTranslationY()));
                return;
            default:
                ((nl) this.f27896c).accept(Float.valueOf(this.f27895b.getTranslationY()));
                return;
        }
    }
}
