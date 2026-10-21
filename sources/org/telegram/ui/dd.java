package org.telegram.ui;
public final class dd implements Runnable {
    public final int f36331a;
    public final md f36332b;

    public dd(md mdVar, int i10) {
        this.f36331a = i10;
        this.f36332b = mdVar;
    }

    @Override
    public final void run() {
        switch (this.f36331a) {
            case 0:
                md mdVar = this.f36332b;
                mdVar.f39191j0 = true;
                mdVar.h0();
                return;
            case 1:
                md mdVar2 = this.f36332b;
                mdVar2.f39208x = null;
                mdVar2.f39209y = null;
                mdVar2.f39193l0 = null;
                mdVar2.m0 = null;
                mdVar2.f39196o0 = null;
                mdVar2.f39195n0 = null;
                mdVar2.f39197p0 = 0.0d;
                mdVar2.e0(false, true);
                mdVar2.e.h(null, null, mdVar2.f39201s, null);
                mdVar2.h.setAnimation(mdVar2.J);
                mdVar2.J.M(0);
                return;
            case 2:
                this.f36332b.g0(true);
                return;
            default:
                md mdVar3 = this.f36332b;
                mdVar3.f39191j0 = true;
                if (mdVar3.f39206w.length() > 0) {
                    mdVar3.d0(mdVar3.f39206w.getText().toString());
                }
                mdVar3.h0();
                return;
        }
    }
}
