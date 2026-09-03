package org.telegram.ui.Components;
public final class kb implements o1.g {
    public final int f28380a;
    public final nb f28381b;
    public final q0.a f28382c;

    public kb(q0.a aVar, nb nbVar, int i10) {
        this.f28380a = i10;
        this.f28382c = aVar;
        this.f28381b = nbVar;
    }

    @Override
    public final void a(o1.h hVar, float f10, float f11) {
        switch (this.f28380a) {
            case 0:
                ((xa) this.f28382c).accept(Float.valueOf(this.f28381b.getTranslationY()));
                return;
            default:
                ((il) this.f28382c).accept(Float.valueOf(this.f28381b.getTranslationY()));
                return;
        }
    }
}
