package org.telegram.ui;
public final class ag implements org.telegram.messenger.pr {
    public final int f45042a;
    public final an f45043b;

    public ag(an anVar, int i7) {
        this.f45042a = i7;
        this.f45043b = anVar;
    }

    @Override
    public final void a(int i7) {
        switch (this.f45042a) {
            case 0:
                an anVar = this.f45043b;
                if (anVar.getParentActivity() != null && anVar.fragmentView != null && i7 > 0) {
                    org.telegram.ui.Components.cc.a0(anVar).m(org.telegram.ui.Components.bc.f33238r, i7, 0, 0, anVar.Aa).j();
                    return;
                }
                return;
            case 1:
                an anVar2 = this.f45043b;
                if (i7 == 0) {
                    anVar2.D6 = false;
                    anVar2.ka();
                    return;
                }
                anVar2.l(i7, 0, false, 0, true, 0);
                return;
            default:
                an anVar3 = this.f45043b;
                if (i7 == 0) {
                    anVar3.zd(true);
                    return;
                } else {
                    anVar3.finishFragment();
                    return;
                }
        }
    }
}
