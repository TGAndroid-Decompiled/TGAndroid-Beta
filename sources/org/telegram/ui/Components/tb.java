package org.telegram.ui.Components;
public final class tb implements o1.g {
    public final int f31099a;
    public final vb f31100b;
    public final q0.a f31101c;

    public tb(q0.a aVar, vb vbVar, int i10) {
        this.f31099a = i10;
        this.f31101c = aVar;
        this.f31100b = vbVar;
    }

    @Override
    public final void a(o1.h hVar, float f7, float f10) {
        switch (this.f31099a) {
            case 0:
                ((hb) this.f31101c).accept(Float.valueOf(this.f31100b.getTranslationY()));
                return;
            default:
                ((pl) this.f31101c).accept(Float.valueOf(this.f31100b.getTranslationY()));
                return;
        }
    }
}
