package org.telegram.ui.Components;
public final class eb implements r1.d {
    public final int f33237a;
    public final gb f33238b;
    public final q0.a f33239c;

    public eb(q0.a aVar, gb gbVar, int i7) {
        this.f33237a = i7;
        this.f33239c = aVar;
        this.f33238b = gbVar;
    }

    @Override
    public final void a(r1.g gVar, float f10, float f11) {
        switch (this.f33237a) {
            case 0:
                ((sa) this.f33239c).accept(Float.valueOf(this.f33238b.getTranslationY()));
                return;
            default:
                ((bl) this.f33239c).accept(Float.valueOf(this.f33238b.getTranslationY()));
                return;
        }
    }
}
