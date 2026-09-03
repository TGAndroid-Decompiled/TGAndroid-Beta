package org.telegram.ui.Components;
public final class po0 implements o1.g {
    public final int f27974a;
    public final yo0 f27975b;

    public po0(yo0 yo0Var, int i10) {
        this.f27974a = i10;
        this.f27975b = yo0Var;
    }

    @Override
    public final void a(o1.h hVar, float f10, float f11) {
        switch (this.f27974a) {
            case 0:
                this.f27975b.f31084o.setScaleX(1.0f / f10);
                return;
            case 1:
                this.f27975b.f31084o.setScaleY(1.0f / f10);
                return;
            case 2:
                this.f27975b.f31084o.setScaleX(1.0f / f10);
                return;
            default:
                this.f27975b.f31084o.setScaleY(1.0f / f10);
                return;
        }
    }
}
