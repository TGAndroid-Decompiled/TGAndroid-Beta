package org.telegram.ui.Components;

public final class hb implements o1.g {

    public final int f28958a;

    public final jb f28959b;

    public final q0.a f28960c;

    public hb(q0.a aVar, jb jbVar, int i10) {
        this.f28958a = i10;
        this.f28960c = aVar;
        this.f28959b = jbVar;
    }

    @Override
    public final void a(o1.h hVar, float f10, float f11) {
        switch (this.f28958a) {
            case 0:
                ((va) this.f28960c).accept(Float.valueOf(this.f28959b.getTranslationY()));
                break;
            default:
                ((zk) this.f28960c).accept(Float.valueOf(this.f28959b.getTranslationY()));
                break;
        }
    }
}
