package org.telegram.ui.Components;
public final class no0 implements o1.g {
    public final int f26509a;
    public final wo0 f26510b;

    public no0(wo0 wo0Var, int i10) {
        this.f26509a = i10;
        this.f26510b = wo0Var;
    }

    @Override
    public final void a(o1.h hVar, float f7, float f10) {
        switch (this.f26509a) {
            case 0:
                this.f26510b.f29713o.setScaleX(1.0f / f7);
                return;
            case 1:
                this.f26510b.f29713o.setScaleY(1.0f / f7);
                return;
            case 2:
                this.f26510b.f29713o.setScaleX(1.0f / f7);
                return;
            default:
                this.f26510b.f29713o.setScaleY(1.0f / f7);
                return;
        }
    }
}
