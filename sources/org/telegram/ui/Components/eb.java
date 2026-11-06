package org.telegram.ui.Components;
public final class eb implements r1.d {
    public final int f33206a;
    public final gb f33207b;
    public final q0.a f33208c;

    public eb(q0.a aVar, gb gbVar, int i7) {
        this.f33206a = i7;
        this.f33208c = aVar;
        this.f33207b = gbVar;
    }

    @Override
    public final void a(r1.g gVar, float f10, float f11) {
        switch (this.f33206a) {
            case 0:
                ((sa) this.f33208c).accept(Float.valueOf(this.f33207b.getTranslationY()));
                return;
            default:
                ((bl) this.f33208c).accept(Float.valueOf(this.f33207b.getTranslationY()));
                return;
        }
    }
}
