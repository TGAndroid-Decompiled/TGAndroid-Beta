package org.telegram.ui.Components;
public final class tb implements o1.g {
    public final int f28473a;
    public final vb f28474b;
    public final q0.a f28475c;

    public tb(q0.a aVar, vb vbVar, int i10) {
        this.f28473a = i10;
        this.f28475c = aVar;
        this.f28474b = vbVar;
    }

    @Override
    public final void a(o1.h hVar, float f7, float f10) {
        switch (this.f28473a) {
            case 0:
                ((hb) this.f28475c).accept(Float.valueOf(this.f28474b.getTranslationY()));
                return;
            default:
                ((pl) this.f28475c).accept(Float.valueOf(this.f28474b.getTranslationY()));
                return;
        }
    }
}
