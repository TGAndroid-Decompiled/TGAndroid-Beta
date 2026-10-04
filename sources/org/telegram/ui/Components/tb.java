package org.telegram.ui.Components;
public final class tb implements o1.g {
    public final int f31005a;
    public final vb f31006b;
    public final q0.a f31007c;

    public tb(q0.a aVar, vb vbVar, int i10) {
        this.f31005a = i10;
        this.f31007c = aVar;
        this.f31006b = vbVar;
    }

    @Override
    public final void a(o1.h hVar, float f7, float f10) {
        switch (this.f31005a) {
            case 0:
                ((hb) this.f31007c).accept(Float.valueOf(this.f31006b.getTranslationY()));
                return;
            default:
                ((pl) this.f31007c).accept(Float.valueOf(this.f31006b.getTranslationY()));
                return;
        }
    }
}
