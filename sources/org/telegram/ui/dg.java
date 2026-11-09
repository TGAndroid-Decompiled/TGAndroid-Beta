package org.telegram.ui;
public final class dg implements org.telegram.messenger.sr {
    public final int f44945a;
    public final cn f44946b;

    public dg(cn cnVar, int i7) {
        this.f44945a = i7;
        this.f44946b = cnVar;
    }

    @Override
    public final void a(int i7) {
        switch (this.f44945a) {
            case 0:
                cn cnVar = this.f44946b;
                if (cnVar.getParentActivity() != null && cnVar.fragmentView != null && i7 > 0) {
                    org.telegram.ui.Components.hc.a0(cnVar).m(org.telegram.ui.Components.gc.f33920r, i7, 0, 0, cnVar.f44709za).j();
                    return;
                }
                return;
            case 1:
                cn cnVar2 = this.f44946b;
                if (i7 == 0) {
                    cnVar2.C6 = false;
                    cnVar2.ja();
                    return;
                }
                cnVar2.l(i7, 0, false, 0, true, 0);
                return;
            default:
                cn cnVar3 = this.f44946b;
                if (i7 == 0) {
                    cnVar3.yd(true);
                    return;
                } else {
                    cnVar3.finishFragment();
                    return;
                }
        }
    }
}
