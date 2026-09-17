package org.telegram.ui.Components;
public final class qb implements o1.g {
    public final int f27255a;
    public final sb f27256b;
    public final q0.a f27257c;

    public qb(q0.a aVar, sb sbVar, int i10) {
        this.f27255a = i10;
        this.f27257c = aVar;
        this.f27256b = sbVar;
    }

    @Override
    public final void a(o1.h hVar, float f7, float f10) {
        switch (this.f27255a) {
            case 0:
                ((eb) this.f27257c).accept(Float.valueOf(this.f27256b.getTranslationY()));
                return;
            default:
                ((ml) this.f27257c).accept(Float.valueOf(this.f27256b.getTranslationY()));
                return;
        }
    }
}
