package org.telegram.ui;
public final class dd implements Runnable {
    public final int f36352a;
    public final md f36353b;

    public dd(md mdVar, int i10) {
        this.f36352a = i10;
        this.f36353b = mdVar;
    }

    @Override
    public final void run() {
        switch (this.f36352a) {
            case 0:
                md mdVar = this.f36353b;
                mdVar.f39219j0 = true;
                mdVar.h0();
                return;
            case 1:
                md mdVar2 = this.f36353b;
                mdVar2.f39236x = null;
                mdVar2.f39237y = null;
                mdVar2.f39221l0 = null;
                mdVar2.m0 = null;
                mdVar2.f39224o0 = null;
                mdVar2.f39223n0 = null;
                mdVar2.f39225p0 = 0.0d;
                mdVar2.e0(false, true);
                mdVar2.e.h(null, null, mdVar2.f39229s, null);
                mdVar2.h.setAnimation(mdVar2.J);
                mdVar2.J.M(0);
                return;
            case 2:
                this.f36353b.g0(true);
                return;
            default:
                md mdVar3 = this.f36353b;
                mdVar3.f39219j0 = true;
                if (mdVar3.f39234w.length() > 0) {
                    mdVar3.d0(mdVar3.f39234w.getText().toString());
                }
                mdVar3.h0();
                return;
        }
    }
}
