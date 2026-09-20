package org.telegram.ui;
public final class dd implements Runnable {
    public final int f33014a;
    public final md f33015b;

    public dd(md mdVar, int i10) {
        this.f33014a = i10;
        this.f33015b = mdVar;
    }

    @Override
    public final void run() {
        switch (this.f33014a) {
            case 0:
                md mdVar = this.f33015b;
                mdVar.f35670j0 = true;
                mdVar.h0();
                return;
            case 1:
                md mdVar2 = this.f33015b;
                mdVar2.f35687x = null;
                mdVar2.f35688y = null;
                mdVar2.f35672l0 = null;
                mdVar2.m0 = null;
                mdVar2.f35675o0 = null;
                mdVar2.f35674n0 = null;
                mdVar2.f35676p0 = 0.0d;
                mdVar2.e0(false, true);
                mdVar2.e.h(null, null, mdVar2.f35680s, null);
                mdVar2.h.setAnimation(mdVar2.J);
                mdVar2.J.M(0);
                return;
            case 2:
                this.f33015b.g0(true);
                return;
            default:
                md mdVar3 = this.f33015b;
                mdVar3.f35670j0 = true;
                if (mdVar3.f35685w.length() > 0) {
                    mdVar3.d0(mdVar3.f35685w.getText().toString());
                }
                mdVar3.h0();
                return;
        }
    }
}
