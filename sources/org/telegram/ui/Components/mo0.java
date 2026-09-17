package org.telegram.ui.Components;
public final class mo0 implements o1.g {
    public final int f28476a;
    public final vo0 f28477b;

    public mo0(vo0 vo0Var, int i10) {
        this.f28476a = i10;
        this.f28477b = vo0Var;
    }

    @Override
    public final void a(o1.h hVar, float f7, float f10) {
        switch (this.f28476a) {
            case 0:
                this.f28477b.f31381o.setScaleX(1.0f / f7);
                return;
            case 1:
                this.f28477b.f31381o.setScaleY(1.0f / f7);
                return;
            case 2:
                this.f28477b.f31381o.setScaleX(1.0f / f7);
                return;
            default:
                this.f28477b.f31381o.setScaleY(1.0f / f7);
                return;
        }
    }
}
