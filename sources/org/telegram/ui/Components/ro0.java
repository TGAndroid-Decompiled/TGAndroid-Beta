package org.telegram.ui.Components;
public final class ro0 implements o1.g {
    public final int f30808a;
    public final ap0 f30809b;

    public ro0(ap0 ap0Var, int i10) {
        this.f30808a = i10;
        this.f30809b = ap0Var;
    }

    @Override
    public final void a(o1.h hVar, float f10, float f11) {
        switch (this.f30808a) {
            case 0:
                this.f30809b.f25306o.setScaleX(1.0f / f10);
                return;
            case 1:
                this.f30809b.f25306o.setScaleY(1.0f / f10);
                return;
            case 2:
                this.f30809b.f25306o.setScaleX(1.0f / f10);
                return;
            default:
                this.f30809b.f25306o.setScaleY(1.0f / f10);
                return;
        }
    }
}
