package org.telegram.ui.Components;
public final class mo0 implements o1.g {
    public final int f26251a;
    public final vo0 f26252b;

    public mo0(vo0 vo0Var, int i10) {
        this.f26251a = i10;
        this.f26252b = vo0Var;
    }

    @Override
    public final void a(o1.h hVar, float f7, float f10) {
        switch (this.f26251a) {
            case 0:
                this.f26252b.f28821o.setScaleX(1.0f / f7);
                return;
            case 1:
                this.f26252b.f28821o.setScaleY(1.0f / f7);
                return;
            case 2:
                this.f26252b.f28821o.setScaleX(1.0f / f7);
                return;
            default:
                this.f26252b.f28821o.setScaleY(1.0f / f7);
                return;
        }
    }
}
