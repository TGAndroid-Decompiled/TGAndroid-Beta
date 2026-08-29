package org.telegram.ui.Components;
public final class go0 implements o1.h {
    public final int f28928a;
    public final po0 f28929b;

    public go0(po0 po0Var, int i10) {
        this.f28928a = i10;
        this.f28929b = po0Var;
    }

    @Override
    public final void a(o1.i iVar, float f9, float f10) {
        switch (this.f28928a) {
            case 0:
                this.f28929b.f31719o.setScaleX(1.0f / f9);
                return;
            case 1:
                this.f28929b.f31719o.setScaleY(1.0f / f9);
                return;
            case 2:
                this.f28929b.f31719o.setScaleX(1.0f / f9);
                return;
            default:
                this.f28929b.f31719o.setScaleY(1.0f / f9);
                return;
        }
    }
}
