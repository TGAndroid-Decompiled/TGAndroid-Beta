package org.telegram.ui.Components;
public final class rp0 implements o1.g {
    public final int f30478a;
    public final aq0 f30479b;

    public rp0(aq0 aq0Var, int i10) {
        this.f30478a = i10;
        this.f30479b = aq0Var;
    }

    @Override
    public final void a(o1.h hVar, float f7, float f10) {
        switch (this.f30478a) {
            case 0:
                this.f30479b.f24738o.setScaleX(1.0f / f7);
                return;
            case 1:
                this.f30479b.f24738o.setScaleY(1.0f / f7);
                return;
            case 2:
                this.f30479b.f24738o.setScaleX(1.0f / f7);
                return;
            default:
                this.f30479b.f24738o.setScaleY(1.0f / f7);
                return;
        }
    }
}
