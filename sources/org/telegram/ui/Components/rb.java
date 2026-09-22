package org.telegram.ui.Components;
public final class rb implements o1.g {
    public final int f27917a;
    public final tb f27918b;
    public final q0.a f27919c;

    public rb(q0.a aVar, tb tbVar, int i10) {
        this.f27917a = i10;
        this.f27919c = aVar;
        this.f27918b = tbVar;
    }

    @Override
    public final void a(o1.h hVar, float f7, float f10) {
        switch (this.f27917a) {
            case 0:
                ((fb) this.f27919c).accept(Float.valueOf(this.f27918b.getTranslationY()));
                return;
            default:
                ((ml) this.f27919c).accept(Float.valueOf(this.f27918b.getTranslationY()));
                return;
        }
    }
}
