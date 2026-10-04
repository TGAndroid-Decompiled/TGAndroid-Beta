package org.telegram.ui.Components;
public final class tb implements o1.g {
    public final int f31012a;
    public final vb f31013b;
    public final q0.a f31014c;

    public tb(q0.a aVar, vb vbVar, int i10) {
        this.f31012a = i10;
        this.f31014c = aVar;
        this.f31013b = vbVar;
    }

    @Override
    public final void a(o1.h hVar, float f7, float f10) {
        switch (this.f31012a) {
            case 0:
                ((hb) this.f31014c).accept(Float.valueOf(this.f31013b.getTranslationY()));
                return;
            default:
                ((pl) this.f31014c).accept(Float.valueOf(this.f31013b.getTranslationY()));
                return;
        }
    }
}
