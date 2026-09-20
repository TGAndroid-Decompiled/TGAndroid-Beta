package org.telegram.ui.Components;
public final class rb implements o1.g {
    public final int f27831a;
    public final tb f27832b;
    public final q0.a f27833c;

    public rb(q0.a aVar, tb tbVar, int i10) {
        this.f27831a = i10;
        this.f27833c = aVar;
        this.f27832b = tbVar;
    }

    @Override
    public final void a(o1.h hVar, float f7, float f10) {
        switch (this.f27831a) {
            case 0:
                ((fb) this.f27833c).accept(Float.valueOf(this.f27832b.getTranslationY()));
                return;
            default:
                ((ml) this.f27833c).accept(Float.valueOf(this.f27832b.getTranslationY()));
                return;
        }
    }
}
