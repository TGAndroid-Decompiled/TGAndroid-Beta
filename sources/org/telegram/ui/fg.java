package org.telegram.ui;
public final class fg implements org.telegram.messenger.sr {
    public final int f45627a;
    public final an f45628b;

    public fg(an anVar, int i7) {
        this.f45627a = i7;
        this.f45628b = anVar;
    }

    @Override
    public final void a(int i7) {
        switch (this.f45627a) {
            case 0:
                an anVar = this.f45628b;
                if (anVar.getParentActivity() != null && anVar.fragmentView != null && i7 > 0) {
                    org.telegram.ui.Components.hc.a0(anVar).m(org.telegram.ui.Components.gc.f33893r, i7, 0, 0, anVar.f44022xa).j();
                    return;
                }
                return;
            case 1:
                an anVar2 = this.f45628b;
                if (i7 == 0) {
                    anVar2.C6 = false;
                    anVar2.ha();
                    return;
                }
                anVar2.l(i7, 0, false, 0, true, 0);
                return;
            default:
                an anVar3 = this.f45628b;
                if (i7 == 0) {
                    anVar3.vd(true);
                    return;
                } else {
                    anVar3.finishFragment();
                    return;
                }
        }
    }
}
