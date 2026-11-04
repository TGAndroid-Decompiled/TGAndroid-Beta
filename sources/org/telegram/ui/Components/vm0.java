package org.telegram.ui.Components;
public final class vm0 implements q1.d {
    public final int f39177a;
    public final en0 f39178b;

    public vm0(en0 en0Var, int i3) {
        this.f39177a = i3;
        this.f39178b = en0Var;
    }

    @Override
    public final void a(q1.g gVar, float f10, float f11) {
        switch (this.f39177a) {
            case 0:
                this.f39178b.f33421o.setScaleX(1.0f / f10);
                return;
            case 1:
                this.f39178b.f33421o.setScaleY(1.0f / f10);
                return;
            case 2:
                this.f39178b.f33421o.setScaleX(1.0f / f10);
                return;
            default:
                this.f39178b.f33421o.setScaleY(1.0f / f10);
                return;
        }
    }
}
