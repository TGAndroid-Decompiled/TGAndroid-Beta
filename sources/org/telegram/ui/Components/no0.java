package org.telegram.ui.Components;
public final class no0 implements o1.g {
    public final int f26506a;
    public final wo0 f26507b;

    public no0(wo0 wo0Var, int i10) {
        this.f26506a = i10;
        this.f26507b = wo0Var;
    }

    @Override
    public final void a(o1.h hVar, float f7, float f10) {
        switch (this.f26506a) {
            case 0:
                this.f26507b.f29710o.setScaleX(1.0f / f7);
                return;
            case 1:
                this.f26507b.f29710o.setScaleY(1.0f / f7);
                return;
            case 2:
                this.f26507b.f29710o.setScaleX(1.0f / f7);
                return;
            default:
                this.f26507b.f29710o.setScaleY(1.0f / f7);
                return;
        }
    }
}
