package org.telegram.ui.Components;
public final class sb implements o1.g {
    public final int f30224a;
    public final ub f30225b;
    public final q0.a f30226c;

    public sb(q0.a aVar, ub ubVar, int i10) {
        this.f30224a = i10;
        this.f30226c = aVar;
        this.f30225b = ubVar;
    }

    @Override
    public final void a(o1.h hVar, float f7, float f10) {
        switch (this.f30224a) {
            case 0:
                ((gb) this.f30226c).accept(Float.valueOf(this.f30225b.getTranslationY()));
                return;
            default:
                ((xl) this.f30226c).accept(Float.valueOf(this.f30225b.getTranslationY()));
                return;
        }
    }
}
