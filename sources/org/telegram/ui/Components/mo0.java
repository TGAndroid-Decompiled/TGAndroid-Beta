package org.telegram.ui.Components;
public final class mo0 implements o1.g {
    public final int f26190a;
    public final vo0 f26191b;

    public mo0(vo0 vo0Var, int i10) {
        this.f26190a = i10;
        this.f26191b = vo0Var;
    }

    @Override
    public final void a(o1.h hVar, float f7, float f10) {
        switch (this.f26190a) {
            case 0:
                this.f26191b.f28850o.setScaleX(1.0f / f7);
                return;
            case 1:
                this.f26191b.f28850o.setScaleY(1.0f / f7);
                return;
            case 2:
                this.f26191b.f28850o.setScaleX(1.0f / f7);
                return;
            default:
                this.f26191b.f28850o.setScaleY(1.0f / f7);
                return;
        }
    }
}
