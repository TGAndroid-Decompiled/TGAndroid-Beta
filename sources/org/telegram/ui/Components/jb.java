package org.telegram.ui.Components;
public final class jb implements o1.g {
    public final int f29681a;
    public final lb f29682b;
    public final q0.a f29683c;

    public jb(q0.a aVar, lb lbVar, int i9) {
        this.f29681a = i9;
        this.f29683c = aVar;
        this.f29682b = lbVar;
    }

    @Override
    public final void a(o1.h hVar, float f10, float f11) {
        switch (this.f29681a) {
            case 0:
                ((xa) this.f29683c).accept(Float.valueOf(this.f29682b.getTranslationY()));
                return;
            default:
                ((dl) this.f29683c).accept(Float.valueOf(this.f29682b.getTranslationY()));
                return;
        }
    }
}
