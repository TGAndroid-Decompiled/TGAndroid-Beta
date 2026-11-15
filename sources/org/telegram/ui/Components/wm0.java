package org.telegram.ui.Components;
public final class wm0 implements r1.d {
    public final int f41409a;
    public final fn0 f41410b;

    public wm0(fn0 fn0Var, int i7) {
        this.f41409a = i7;
        this.f41410b = fn0Var;
    }

    @Override
    public final void a(r1.g gVar, float f10, float f11) {
        switch (this.f41409a) {
            case 0:
                this.f41410b.f34654o.setScaleX(1.0f / f10);
                return;
            case 1:
                this.f41410b.f34654o.setScaleY(1.0f / f10);
                return;
            case 2:
                this.f41410b.f34654o.setScaleX(1.0f / f10);
                return;
            default:
                this.f41410b.f34654o.setScaleY(1.0f / f10);
                return;
        }
    }
}
