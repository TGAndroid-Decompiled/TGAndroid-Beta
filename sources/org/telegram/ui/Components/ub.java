package org.telegram.ui.Components;
public final class ub implements o1.g {
    public final int f31374a;
    public final wb f31375b;
    public final q0.a f31376c;

    public ub(q0.a aVar, wb wbVar, int i10) {
        this.f31374a = i10;
        this.f31376c = aVar;
        this.f31375b = wbVar;
    }

    @Override
    public final void a(o1.h hVar, float f7, float f10) {
        switch (this.f31374a) {
            case 0:
                ((ib) this.f31376c).accept(Float.valueOf(this.f31375b.getTranslationY()));
                return;
            default:
                ((dm) this.f31376c).accept(Float.valueOf(this.f31375b.getTranslationY()));
                return;
        }
    }
}
