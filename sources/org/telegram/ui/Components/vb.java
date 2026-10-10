package org.telegram.ui.Components;
public final class vb implements o1.g {
    public final int f31785a;
    public final xb f31786b;
    public final q0.a f31787c;

    public vb(q0.a aVar, xb xbVar, int i10) {
        this.f31785a = i10;
        this.f31787c = aVar;
        this.f31786b = xbVar;
    }

    @Override
    public final void a(o1.h hVar, float f7, float f10) {
        switch (this.f31785a) {
            case 0:
                ((jb) this.f31787c).accept(Float.valueOf(this.f31786b.getTranslationY()));
                return;
            default:
                ((dm) this.f31787c).accept(Float.valueOf(this.f31786b.getTranslationY()));
                return;
        }
    }
}
