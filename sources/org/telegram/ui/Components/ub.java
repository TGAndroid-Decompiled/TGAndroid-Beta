package org.telegram.ui.Components;
public final class ub implements o1.g {
    public final int f31514a;
    public final wb f31515b;
    public final q0.a f31516c;

    public ub(q0.a aVar, wb wbVar, int i10) {
        this.f31514a = i10;
        this.f31516c = aVar;
        this.f31515b = wbVar;
    }

    @Override
    public final void a(o1.h hVar, float f7, float f10) {
        switch (this.f31514a) {
            case 0:
                ((ib) this.f31516c).accept(Float.valueOf(this.f31515b.getTranslationY()));
                return;
            default:
                ((dm) this.f31516c).accept(Float.valueOf(this.f31515b.getTranslationY()));
                return;
        }
    }
}
