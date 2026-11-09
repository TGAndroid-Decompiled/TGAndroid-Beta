package org.telegram.ui.Components;
public final class eb implements r1.d {
    public final int f33356a;
    public final gb f33357b;
    public final q0.a f33358c;

    public eb(q0.a aVar, gb gbVar, int i7) {
        this.f33356a = i7;
        this.f33358c = aVar;
        this.f33357b = gbVar;
    }

    @Override
    public final void a(r1.g gVar, float f10, float f11) {
        switch (this.f33356a) {
            case 0:
                ((sa) this.f33358c).accept(Float.valueOf(this.f33357b.getTranslationY()));
                return;
            default:
                ((bl) this.f33358c).accept(Float.valueOf(this.f33357b.getTranslationY()));
                return;
        }
    }
}
