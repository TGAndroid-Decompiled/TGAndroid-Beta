package org.telegram.ui.Components;
public final class gp0 implements o1.g {
    public final int f26958a;
    public final pp0 f26959b;

    public gp0(pp0 pp0Var, int i10) {
        this.f26958a = i10;
        this.f26959b = pp0Var;
    }

    @Override
    public final void a(o1.h hVar, float f7, float f10) {
        switch (this.f26958a) {
            case 0:
                this.f26959b.f29798o.setScaleX(1.0f / f7);
                return;
            case 1:
                this.f26959b.f29798o.setScaleY(1.0f / f7);
                return;
            case 2:
                this.f26959b.f29798o.setScaleX(1.0f / f7);
                return;
            default:
                this.f26959b.f29798o.setScaleY(1.0f / f7);
                return;
        }
    }
}
