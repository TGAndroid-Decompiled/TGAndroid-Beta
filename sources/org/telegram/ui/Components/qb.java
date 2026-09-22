package org.telegram.ui.Components;
public final class qb implements o1.g {
    public final int f27296a;
    public final sb f27297b;
    public final q0.a f27298c;

    public qb(q0.a aVar, sb sbVar, int i10) {
        this.f27296a = i10;
        this.f27298c = aVar;
        this.f27297b = sbVar;
    }

    @Override
    public final void a(o1.h hVar, float f7, float f10) {
        switch (this.f27296a) {
            case 0:
                ((eb) this.f27298c).accept(Float.valueOf(this.f27297b.getTranslationY()));
                return;
            default:
                ((ml) this.f27298c).accept(Float.valueOf(this.f27297b.getTranslationY()));
                return;
        }
    }
}
