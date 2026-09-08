package org.telegram.ui.Components;
public final class mo0 implements o1.g {
    public final int f28502a;
    public final vo0 f28503b;

    public mo0(vo0 vo0Var, int i10) {
        this.f28502a = i10;
        this.f28503b = vo0Var;
    }

    @Override
    public final void a(o1.h hVar, float f7, float f10) {
        switch (this.f28502a) {
            case 0:
                this.f28503b.f31407o.setScaleX(1.0f / f7);
                return;
            case 1:
                this.f28503b.f31407o.setScaleY(1.0f / f7);
                return;
            case 2:
                this.f28503b.f31407o.setScaleX(1.0f / f7);
                return;
            default:
                this.f28503b.f31407o.setScaleY(1.0f / f7);
                return;
        }
    }
}
