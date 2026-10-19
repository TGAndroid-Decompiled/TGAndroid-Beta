package org.telegram.ui.Components;
public final class ip0 implements o1.g {
    public final int f27332a;
    public final rp0 f27333b;

    public ip0(rp0 rp0Var, int i10) {
        this.f27332a = i10;
        this.f27333b = rp0Var;
    }

    @Override
    public final void a(o1.h hVar, float f7, float f10) {
        switch (this.f27332a) {
            case 0:
                this.f27333b.f30009o.setScaleX(1.0f / f7);
                return;
            case 1:
                this.f27333b.f30009o.setScaleY(1.0f / f7);
                return;
            case 2:
                this.f27333b.f30009o.setScaleX(1.0f / f7);
                return;
            default:
                this.f27333b.f30009o.setScaleY(1.0f / f7);
                return;
        }
    }
}
