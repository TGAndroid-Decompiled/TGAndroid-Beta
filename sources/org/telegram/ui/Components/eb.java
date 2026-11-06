package org.telegram.ui.Components;
public final class eb implements r1.d {
    public final int f33187a;
    public final gb f33188b;
    public final q0.a f33189c;

    public eb(q0.a aVar, gb gbVar, int i7) {
        this.f33187a = i7;
        this.f33189c = aVar;
        this.f33188b = gbVar;
    }

    @Override
    public final void a(r1.g gVar, float f10, float f11) {
        switch (this.f33187a) {
            case 0:
                ((sa) this.f33189c).accept(Float.valueOf(this.f33188b.getTranslationY()));
                return;
            default:
                ((bl) this.f33189c).accept(Float.valueOf(this.f33188b.getTranslationY()));
                return;
        }
    }
}
