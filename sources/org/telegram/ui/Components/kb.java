package org.telegram.ui.Components;
public final class kb implements o1.g {
    public final int f28358a;
    public final nb f28359b;
    public final q0.a f28360c;

    public kb(q0.a aVar, nb nbVar, int i10) {
        this.f28358a = i10;
        this.f28360c = aVar;
        this.f28359b = nbVar;
    }

    @Override
    public final void a(o1.h hVar, float f10, float f11) {
        switch (this.f28358a) {
            case 0:
                ((xa) this.f28360c).accept(Float.valueOf(this.f28359b.getTranslationY()));
                return;
            default:
                ((il) this.f28360c).accept(Float.valueOf(this.f28359b.getTranslationY()));
                return;
        }
    }
}
