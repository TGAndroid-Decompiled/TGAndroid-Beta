package org.telegram.ui.Components;
public final class qo0 implements o1.g {
    public final int f30480a;
    public final zo0 f30481b;

    public qo0(zo0 zo0Var, int i10) {
        this.f30480a = i10;
        this.f30481b = zo0Var;
    }

    @Override
    public final void a(o1.h hVar, float f10, float f11) {
        switch (this.f30480a) {
            case 0:
                this.f30481b.f33981o.setScaleX(1.0f / f10);
                return;
            case 1:
                this.f30481b.f33981o.setScaleY(1.0f / f10);
                return;
            case 2:
                this.f30481b.f33981o.setScaleX(1.0f / f10);
                return;
            default:
                this.f30481b.f33981o.setScaleY(1.0f / f10);
                return;
        }
    }
}
