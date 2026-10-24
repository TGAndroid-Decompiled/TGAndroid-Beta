package org.telegram.ui.Components;
public final class qb implements o1.g {
    public final int f29872a;
    public final sb f29873b;
    public final q0.a f29874c;

    public qb(q0.a aVar, sb sbVar, int i10) {
        this.f29872a = i10;
        this.f29874c = aVar;
        this.f29873b = sbVar;
    }

    @Override
    public final void a(o1.h hVar, float f7, float f10) {
        switch (this.f29872a) {
            case 0:
                ((eb) this.f29874c).accept(Float.valueOf(this.f29873b.getTranslationY()));
                return;
            default:
                ((vl) this.f29874c).accept(Float.valueOf(this.f29873b.getTranslationY()));
                return;
        }
    }
}
