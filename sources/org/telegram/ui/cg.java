package org.telegram.ui;
public final class cg implements org.telegram.messenger.nr {
    public final int f46532a;
    public final bn f46533b;

    public cg(bn bnVar, int i7) {
        this.f46532a = i7;
        this.f46533b = bnVar;
    }

    @Override
    public final void a(int i7) {
        switch (this.f46532a) {
            case 0:
                bn bnVar = this.f46533b;
                if (bnVar.getParentActivity() != null && bnVar.fragmentView != null && i7 > 0) {
                    org.telegram.ui.Components.lc.b0(bnVar).m(org.telegram.ui.Components.kc.f36729r, i7, 0, 0, bnVar.Ba).j();
                    return;
                }
                return;
            case 1:
                bn bnVar2 = this.f46533b;
                if (i7 == 0) {
                    bnVar2.E6 = false;
                    bnVar2.ka();
                    return;
                }
                bnVar2.l(i7, 0, false, 0, true, 0);
                return;
            default:
                bn bnVar3 = this.f46533b;
                if (i7 == 0) {
                    bnVar3.zd(true);
                    return;
                } else {
                    bnVar3.finishFragment();
                    return;
                }
        }
    }
}
