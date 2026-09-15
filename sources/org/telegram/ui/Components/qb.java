package org.telegram.ui.Components;
public final class qb implements o1.g {
    public final int f27299a;
    public final sb f27300b;
    public final q0.a f27301c;

    public qb(q0.a aVar, sb sbVar, int i10) {
        this.f27299a = i10;
        this.f27301c = aVar;
        this.f27300b = sbVar;
    }

    @Override
    public final void a(o1.h hVar, float f7, float f10) {
        switch (this.f27299a) {
            case 0:
                ((eb) this.f27301c).accept(Float.valueOf(this.f27300b.getTranslationY()));
                return;
            default:
                ((ml) this.f27301c).accept(Float.valueOf(this.f27300b.getTranslationY()));
                return;
        }
    }
}
