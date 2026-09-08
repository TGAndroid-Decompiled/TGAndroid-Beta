package org.telegram.ui;
public final class dd implements Runnable {
    public final int f35789a;
    public final md f35790b;

    public dd(md mdVar, int i10) {
        this.f35789a = i10;
        this.f35790b = mdVar;
    }

    @Override
    public final void run() {
        switch (this.f35789a) {
            case 0:
                md mdVar = this.f35790b;
                mdVar.f38674j0 = true;
                mdVar.h0();
                return;
            case 1:
                md mdVar2 = this.f35790b;
                mdVar2.f38691x = null;
                mdVar2.f38692y = null;
                mdVar2.f38676l0 = null;
                mdVar2.m0 = null;
                mdVar2.f38679o0 = null;
                mdVar2.f38678n0 = null;
                mdVar2.f38680p0 = 0.0d;
                mdVar2.e0(false, true);
                mdVar2.f38667e.h(null, null, mdVar2.f38684s, null);
                mdVar2.h.setAnimation(mdVar2.J);
                mdVar2.J.K(0);
                return;
            case 2:
                this.f35790b.g0(true);
                return;
            default:
                md mdVar3 = this.f35790b;
                mdVar3.f38674j0 = true;
                if (mdVar3.f38689w.length() > 0) {
                    mdVar3.d0(mdVar3.f38689w.getText().toString());
                }
                mdVar3.h0();
                return;
        }
    }
}
