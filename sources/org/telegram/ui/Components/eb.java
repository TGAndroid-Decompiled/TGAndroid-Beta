package org.telegram.ui.Components;
public final class eb implements r1.d {
    public final int f33191a;
    public final gb f33192b;
    public final q0.a f33193c;

    public eb(q0.a aVar, gb gbVar, int i7) {
        this.f33191a = i7;
        this.f33193c = aVar;
        this.f33192b = gbVar;
    }

    @Override
    public final void a(r1.g gVar, float f10, float f11) {
        switch (this.f33191a) {
            case 0:
                ((sa) this.f33193c).accept(Float.valueOf(this.f33192b.getTranslationY()));
                return;
            default:
                ((bl) this.f33193c).accept(Float.valueOf(this.f33192b.getTranslationY()));
                return;
        }
    }
}
