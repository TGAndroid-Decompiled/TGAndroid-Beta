package org.telegram.ui.Components;
public final class np0 implements o1.g {
    public final int f28995a;
    public final wp0 f28996b;

    public np0(wp0 wp0Var, int i10) {
        this.f28995a = i10;
        this.f28996b = wp0Var;
    }

    @Override
    public final void a(o1.h hVar, float f7, float f10) {
        switch (this.f28995a) {
            case 0:
                this.f28996b.f32303o.setScaleX(1.0f / f7);
                return;
            case 1:
                this.f28996b.f32303o.setScaleY(1.0f / f7);
                return;
            case 2:
                this.f28996b.f32303o.setScaleX(1.0f / f7);
                return;
            default:
                this.f28996b.f32303o.setScaleY(1.0f / f7);
                return;
        }
    }
}
