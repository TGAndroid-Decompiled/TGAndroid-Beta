package org.telegram.ui.Components;
public final class kb implements o1.g {
    public final int f26248a;
    public final nb f26249b;
    public final q0.a f26250c;

    public kb(q0.a aVar, nb nbVar, int i10) {
        this.f26248a = i10;
        this.f26250c = aVar;
        this.f26249b = nbVar;
    }

    @Override
    public final void a(o1.h hVar, float f10, float f11) {
        switch (this.f26248a) {
            case 0:
                ((xa) this.f26250c).accept(Float.valueOf(this.f26249b.getTranslationY()));
                return;
            default:
                ((gl) this.f26250c).accept(Float.valueOf(this.f26249b.getTranslationY()));
                return;
        }
    }
}
