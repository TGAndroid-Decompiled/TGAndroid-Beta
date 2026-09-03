package org.telegram.ui.Components;
public final class kb implements o1.g {
    public final int f26247a;
    public final nb f26248b;
    public final q0.a f26249c;

    public kb(q0.a aVar, nb nbVar, int i10) {
        this.f26247a = i10;
        this.f26249c = aVar;
        this.f26248b = nbVar;
    }

    @Override
    public final void a(o1.h hVar, float f10, float f11) {
        switch (this.f26247a) {
            case 0:
                ((xa) this.f26249c).accept(Float.valueOf(this.f26248b.getTranslationY()));
                return;
            default:
                ((gl) this.f26249c).accept(Float.valueOf(this.f26248b.getTranslationY()));
                return;
        }
    }
}
