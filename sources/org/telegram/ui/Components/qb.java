package org.telegram.ui.Components;
public final class qb implements o1.g {
    public final int f27258a;
    public final sb f27259b;
    public final q0.a f27260c;

    public qb(q0.a aVar, sb sbVar, int i10) {
        this.f27258a = i10;
        this.f27260c = aVar;
        this.f27259b = sbVar;
    }

    @Override
    public final void a(o1.h hVar, float f7, float f10) {
        switch (this.f27258a) {
            case 0:
                ((eb) this.f27260c).accept(Float.valueOf(this.f27259b.getTranslationY()));
                return;
            default:
                ((ml) this.f27260c).accept(Float.valueOf(this.f27259b.getTranslationY()));
                return;
        }
    }
}
