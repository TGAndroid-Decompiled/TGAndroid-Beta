package org.telegram.ui.Components;
public final class ub implements o1.g {
    public final int f31125a;
    public final wb f31126b;
    public final q0.a f31127c;

    public ub(q0.a aVar, wb wbVar, int i10) {
        this.f31125a = i10;
        this.f31127c = aVar;
        this.f31126b = wbVar;
    }

    @Override
    public final void a(o1.h hVar, float f7, float f10) {
        switch (this.f31125a) {
            case 0:
                ((ib) this.f31127c).accept(Float.valueOf(this.f31126b.getTranslationY()));
                return;
            default:
                ((fm) this.f31127c).accept(Float.valueOf(this.f31126b.getTranslationY()));
                return;
        }
    }
}
