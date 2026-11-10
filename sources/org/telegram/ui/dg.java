package org.telegram.ui;
public final class dg implements org.telegram.messenger.sr {
    public final int f44975a;
    public final cn f44976b;

    public dg(cn cnVar, int i7) {
        this.f44975a = i7;
        this.f44976b = cnVar;
    }

    @Override
    public final void a(int i7) {
        switch (this.f44975a) {
            case 0:
                cn cnVar = this.f44976b;
                if (cnVar.getParentActivity() != null && cnVar.fragmentView != null && i7 > 0) {
                    org.telegram.ui.Components.gc.a0(cnVar).m(org.telegram.ui.Components.fc.f33515r, i7, 0, 0, cnVar.f44750za).j();
                    return;
                }
                return;
            case 1:
                cn cnVar2 = this.f44976b;
                if (i7 == 0) {
                    cnVar2.C6 = false;
                    cnVar2.ja();
                    return;
                }
                cnVar2.l(i7, 0, false, 0, true, 0);
                return;
            default:
                cn cnVar3 = this.f44976b;
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
