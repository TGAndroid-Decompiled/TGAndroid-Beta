package org.telegram.ui.Components;
public final class ip0 implements o1.g {
    public final int f27317a;
    public final rp0 f27318b;

    public ip0(rp0 rp0Var, int i10) {
        this.f27317a = i10;
        this.f27318b = rp0Var;
    }

    @Override
    public final void a(o1.h hVar, float f7, float f10) {
        switch (this.f27317a) {
            case 0:
                this.f27318b.f30003o.setScaleX(1.0f / f7);
                return;
            case 1:
                this.f27318b.f30003o.setScaleY(1.0f / f7);
                return;
            case 2:
                this.f27318b.f30003o.setScaleX(1.0f / f7);
                return;
            default:
                this.f27318b.f30003o.setScaleY(1.0f / f7);
                return;
        }
    }
}
