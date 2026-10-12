package org.telegram.ui.Components;
public final class ub implements o1.g {
    public final int f31130a;
    public final wb f31131b;
    public final q0.a f31132c;

    public ub(q0.a aVar, wb wbVar, int i10) {
        this.f31130a = i10;
        this.f31132c = aVar;
        this.f31131b = wbVar;
    }

    @Override
    public final void a(o1.h hVar, float f7, float f10) {
        switch (this.f31130a) {
            case 0:
                ((ib) this.f31132c).accept(Float.valueOf(this.f31131b.getTranslationY()));
                return;
            default:
                ((fm) this.f31132c).accept(Float.valueOf(this.f31131b.getTranslationY()));
                return;
        }
    }
}
