package org.telegram.ui.Components;
public final class sb implements o1.g {
    public final int f30230a;
    public final ub f30231b;
    public final q0.a f30232c;

    public sb(q0.a aVar, ub ubVar, int i10) {
        this.f30230a = i10;
        this.f30232c = aVar;
        this.f30231b = ubVar;
    }

    @Override
    public final void a(o1.h hVar, float f7, float f10) {
        switch (this.f30230a) {
            case 0:
                ((gb) this.f30232c).accept(Float.valueOf(this.f30231b.getTranslationY()));
                return;
            default:
                ((xl) this.f30232c).accept(Float.valueOf(this.f30231b.getTranslationY()));
                return;
        }
    }
}
