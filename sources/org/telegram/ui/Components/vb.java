package org.telegram.ui.Components;
public final class vb implements o1.g {
    public final int f31730a;
    public final xb f31731b;
    public final q0.a f31732c;

    public vb(q0.a aVar, xb xbVar, int i10) {
        this.f31730a = i10;
        this.f31732c = aVar;
        this.f31731b = xbVar;
    }

    @Override
    public final void a(o1.h hVar, float f7, float f10) {
        switch (this.f31730a) {
            case 0:
                ((jb) this.f31732c).accept(Float.valueOf(this.f31731b.getTranslationY()));
                return;
            default:
                ((dm) this.f31732c).accept(Float.valueOf(this.f31731b.getTranslationY()));
                return;
        }
    }
}
