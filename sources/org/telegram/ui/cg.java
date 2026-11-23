package org.telegram.ui;
public final class cg implements org.telegram.messenger.or {
    public final int f46548a;
    public final bn f46549b;

    public cg(bn bnVar, int i7) {
        this.f46548a = i7;
        this.f46549b = bnVar;
    }

    @Override
    public final void a(int i7) {
        switch (this.f46548a) {
            case 0:
                bn bnVar = this.f46549b;
                if (bnVar.getParentActivity() != null && bnVar.fragmentView != null && i7 > 0) {
                    org.telegram.ui.Components.lc.b0(bnVar).m(org.telegram.ui.Components.kc.f36843r, i7, 0, 0, bnVar.Ba).j();
                    return;
                }
                return;
            case 1:
                bn bnVar2 = this.f46549b;
                if (i7 == 0) {
                    bnVar2.E6 = false;
                    bnVar2.ka();
                    return;
                }
                bnVar2.l(i7, 0, false, 0, true, 0);
                return;
            default:
                bn bnVar3 = this.f46549b;
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
