package org.telegram.ui.Components;
public final class en0 implements r1.d {
    public final int f34771a;
    public final on0 f34772b;

    public en0(on0 on0Var, int i7) {
        this.f34771a = i7;
        this.f34772b = on0Var;
    }

    @Override
    public final void a(r1.g gVar, float f10, float f11) {
        switch (this.f34771a) {
            case 0:
                this.f34772b.f38136o.setScaleX(1.0f / f10);
                return;
            case 1:
                this.f34772b.f38136o.setScaleY(1.0f / f10);
                return;
            case 2:
                this.f34772b.f38136o.setScaleX(1.0f / f10);
                return;
            default:
                this.f34772b.f38136o.setScaleY(1.0f / f10);
                return;
        }
    }
}
