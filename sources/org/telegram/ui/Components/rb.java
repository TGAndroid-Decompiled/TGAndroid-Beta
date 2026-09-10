package org.telegram.ui.Components;
public final class rb implements o1.g {
    public final int f26647a;
    public final tb f26648b;
    public final q0.a f26649c;

    public rb(q0.a aVar, tb tbVar, int i10) {
        this.f26647a = i10;
        this.f26649c = aVar;
        this.f26648b = tbVar;
    }

    @Override
    public final void a(o1.h hVar, float f7, float f10) {
        switch (this.f26647a) {
            case 0:
                ((fb) this.f26649c).accept(Float.valueOf(this.f26648b.getTranslationY()));
                return;
            default:
                ((rl) this.f26649c).accept(Float.valueOf(this.f26648b.getTranslationY()));
                return;
        }
    }
}
