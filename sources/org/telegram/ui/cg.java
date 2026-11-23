package org.telegram.ui;
public final class cg implements org.telegram.messenger.nr {
    public final int f46792a;
    public final bn f46793b;

    public cg(bn bnVar, int i7) {
        this.f46792a = i7;
        this.f46793b = bnVar;
    }

    @Override
    public final void a(int i7) {
        switch (this.f46792a) {
            case 0:
                bn bnVar = this.f46793b;
                if (bnVar.getParentActivity() != null && bnVar.fragmentView != null && i7 > 0) {
                    org.telegram.ui.Components.kc.b0(bnVar).m(org.telegram.ui.Components.jc.f36375r, i7, 0, 0, bnVar.Ba).j();
                    return;
                }
                return;
            case 1:
                bn bnVar2 = this.f46793b;
                if (i7 == 0) {
                    bnVar2.E6 = false;
                    bnVar2.ka();
                    return;
                }
                bnVar2.l(i7, 0, false, 0, true, 0);
                return;
            default:
                bn bnVar3 = this.f46793b;
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
