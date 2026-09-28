package org.telegram.ui.Components;
public final class sb implements o1.g {
    public final int f28186a;
    public final ub f28187b;
    public final q0.a f28188c;

    public sb(q0.a aVar, ub ubVar, int i10) {
        this.f28186a = i10;
        this.f28188c = aVar;
        this.f28187b = ubVar;
    }

    @Override
    public final void a(o1.h hVar, float f7, float f10) {
        switch (this.f28186a) {
            case 0:
                ((gb) this.f28188c).accept(Float.valueOf(this.f28187b.getTranslationY()));
                return;
            default:
                ((ol) this.f28188c).accept(Float.valueOf(this.f28187b.getTranslationY()));
                return;
        }
    }
}
