package org.telegram.ui.Components;
public final class ub implements o1.g {
    public final int f29306a;
    public final wb f29307b;
    public final q0.a f29308c;

    public ub(q0.a aVar, wb wbVar, int i10) {
        this.f29306a = i10;
        this.f29308c = aVar;
        this.f29307b = wbVar;
    }

    @Override
    public final void a(o1.h hVar, float f7, float f10) {
        switch (this.f29306a) {
            case 0:
                ((ib) this.f29308c).accept(Float.valueOf(this.f29307b.getTranslationY()));
                return;
            default:
                ((zl) this.f29308c).accept(Float.valueOf(this.f29307b.getTranslationY()));
                return;
        }
    }
}
