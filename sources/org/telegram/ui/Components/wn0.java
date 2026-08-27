package org.telegram.ui.Components;

public final class wn0 implements o1.g {

    public final int f34301a;

    public final fo0 f34302b;

    public wn0(fo0 fo0Var, int i10) {
        this.f34301a = i10;
        this.f34302b = fo0Var;
    }

    @Override
    public final void a(o1.h hVar, float f10, float f11) {
        switch (this.f34301a) {
            case 0:
                this.f34302b.f28411o.setScaleX(1.0f / f10);
                break;
            case 1:
                this.f34302b.f28411o.setScaleY(1.0f / f10);
                break;
            case 2:
                this.f34302b.f28411o.setScaleX(1.0f / f10);
                break;
            default:
                this.f34302b.f28411o.setScaleY(1.0f / f10);
                break;
        }
    }
}
