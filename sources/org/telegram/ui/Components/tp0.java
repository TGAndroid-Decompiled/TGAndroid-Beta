package org.telegram.ui.Components;
public final class tp0 implements o1.g {
    public final int f31128a;
    public final cq0 f31129b;

    public tp0(cq0 cq0Var, int i10) {
        this.f31128a = i10;
        this.f31129b = cq0Var;
    }

    @Override
    public final void a(o1.h hVar, float f7, float f10) {
        switch (this.f31128a) {
            case 0:
                this.f31129b.f25279o.setScaleX(1.0f / f7);
                return;
            case 1:
                this.f31129b.f25279o.setScaleY(1.0f / f7);
                return;
            case 2:
                this.f31129b.f25279o.setScaleX(1.0f / f7);
                return;
            default:
                this.f31129b.f25279o.setScaleY(1.0f / f7);
                return;
        }
    }
}
