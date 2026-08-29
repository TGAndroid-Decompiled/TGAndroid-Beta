package org.telegram.ui.Components;
public final class ob implements o1.h {
    public final int f31328a;
    public final rb f31329b;
    public final q0.a f31330c;

    public ob(q0.a aVar, rb rbVar, int i10) {
        this.f31328a = i10;
        this.f31330c = aVar;
        this.f31329b = rbVar;
    }

    @Override
    public final void a(o1.i iVar, float f9, float f10) {
        switch (this.f31328a) {
            case 0:
                ((cb) this.f31330c).accept(Float.valueOf(this.f31329b.getTranslationY()));
                return;
            default:
                ((hl) this.f31330c).accept(Float.valueOf(this.f31329b.getTranslationY()));
                return;
        }
    }
}
