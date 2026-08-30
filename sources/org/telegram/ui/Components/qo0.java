package org.telegram.ui.Components;
public final class qo0 implements o1.g {
    public final int f28202a;
    public final zo0 f28203b;

    public qo0(zo0 zo0Var, int i10) {
        this.f28202a = i10;
        this.f28203b = zo0Var;
    }

    @Override
    public final void a(o1.h hVar, float f10, float f11) {
        switch (this.f28202a) {
            case 0:
                this.f28203b.f31413o.setScaleX(1.0f / f10);
                return;
            case 1:
                this.f28203b.f31413o.setScaleY(1.0f / f10);
                return;
            case 2:
                this.f28203b.f31413o.setScaleX(1.0f / f10);
                return;
            default:
                this.f28203b.f31413o.setScaleY(1.0f / f10);
                return;
        }
    }
}
