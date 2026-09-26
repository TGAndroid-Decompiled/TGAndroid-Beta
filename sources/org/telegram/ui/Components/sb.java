package org.telegram.ui.Components;
public final class sb implements o1.g {
    public final int f28230a;
    public final ub f28231b;
    public final q0.a f28232c;

    public sb(q0.a aVar, ub ubVar, int i10) {
        this.f28230a = i10;
        this.f28232c = aVar;
        this.f28231b = ubVar;
    }

    @Override
    public final void a(o1.h hVar, float f7, float f10) {
        switch (this.f28230a) {
            case 0:
                ((gb) this.f28232c).accept(Float.valueOf(this.f28231b.getTranslationY()));
                return;
            default:
                ((ol) this.f28232c).accept(Float.valueOf(this.f28231b.getTranslationY()));
                return;
        }
    }
}
