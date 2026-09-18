package org.telegram.ui;
public final class dd implements Runnable {
    public final int f32938a;
    public final md f32939b;

    public dd(md mdVar, int i10) {
        this.f32938a = i10;
        this.f32939b = mdVar;
    }

    @Override
    public final void run() {
        switch (this.f32938a) {
            case 0:
                md mdVar = this.f32939b;
                mdVar.f35616j0 = true;
                mdVar.h0();
                return;
            case 1:
                md mdVar2 = this.f32939b;
                mdVar2.f35633x = null;
                mdVar2.f35634y = null;
                mdVar2.f35618l0 = null;
                mdVar2.m0 = null;
                mdVar2.f35621o0 = null;
                mdVar2.f35620n0 = null;
                mdVar2.f35622p0 = 0.0d;
                mdVar2.e0(false, true);
                mdVar2.e.h(null, null, mdVar2.f35626s, null);
                mdVar2.h.setAnimation(mdVar2.J);
                mdVar2.J.M(0);
                return;
            case 2:
                this.f32939b.g0(true);
                return;
            default:
                md mdVar3 = this.f32939b;
                mdVar3.f35616j0 = true;
                if (mdVar3.f35631w.length() > 0) {
                    mdVar3.d0(mdVar3.f35631w.getText().toString());
                }
                mdVar3.h0();
                return;
        }
    }
}
