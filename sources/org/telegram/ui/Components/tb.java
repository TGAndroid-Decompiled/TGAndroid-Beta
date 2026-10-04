package org.telegram.ui.Components;
public final class tb implements o1.g {
    public final int f31006a;
    public final vb f31007b;
    public final q0.a f31008c;

    public tb(q0.a aVar, vb vbVar, int i10) {
        this.f31006a = i10;
        this.f31008c = aVar;
        this.f31007b = vbVar;
    }

    @Override
    public final void a(o1.h hVar, float f7, float f10) {
        switch (this.f31006a) {
            case 0:
                ((hb) this.f31008c).accept(Float.valueOf(this.f31007b.getTranslationY()));
                return;
            default:
                ((pl) this.f31008c).accept(Float.valueOf(this.f31007b.getTranslationY()));
                return;
        }
    }
}
