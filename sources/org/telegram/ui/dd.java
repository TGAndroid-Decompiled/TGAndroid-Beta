package org.telegram.ui;
public final class dd implements Runnable {
    public final int f36974a;
    public final md f36975b;

    public dd(md mdVar, int i10) {
        this.f36974a = i10;
        this.f36975b = mdVar;
    }

    @Override
    public final void run() {
        switch (this.f36974a) {
            case 0:
                md mdVar = this.f36975b;
                mdVar.f39896j0 = true;
                mdVar.h0();
                return;
            case 1:
                md mdVar2 = this.f36975b;
                mdVar2.f39913x = null;
                mdVar2.f39914y = null;
                mdVar2.f39898l0 = null;
                mdVar2.m0 = null;
                mdVar2.f39901o0 = null;
                mdVar2.f39900n0 = null;
                mdVar2.f39902p0 = 0.0d;
                mdVar2.e0(false, true);
                mdVar2.f39889e.h(null, null, mdVar2.f39906s, null);
                mdVar2.h.setAnimation(mdVar2.J);
                mdVar2.J.M(0);
                return;
            case 2:
                this.f36975b.g0(true);
                return;
            default:
                md mdVar3 = this.f36975b;
                mdVar3.f39896j0 = true;
                if (mdVar3.f39911w.length() > 0) {
                    mdVar3.d0(mdVar3.f39911w.getText().toString());
                }
                mdVar3.h0();
                return;
        }
    }
}
