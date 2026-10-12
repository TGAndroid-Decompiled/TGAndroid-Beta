package org.telegram.ui.Components;
public final class ub implements o1.g {
    public final int f29622a;
    public final wb f29623b;
    public final q0.a f29624c;

    public ub(q0.a aVar, wb wbVar, int i10) {
        this.f29622a = i10;
        this.f29624c = aVar;
        this.f29623b = wbVar;
    }

    @Override
    public final void a(o1.h hVar, float f7, float f10) {
        switch (this.f29622a) {
            case 0:
                ((ib) this.f29624c).accept(Float.valueOf(this.f29623b.getTranslationY()));
                return;
            default:
                ((am) this.f29624c).accept(Float.valueOf(this.f29623b.getTranslationY()));
                return;
        }
    }
}
