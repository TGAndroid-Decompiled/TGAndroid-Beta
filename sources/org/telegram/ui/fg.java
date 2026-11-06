package org.telegram.ui;
public final class fg implements org.telegram.messenger.sr {
    public final int f45623a;
    public final an f45624b;

    public fg(an anVar, int i7) {
        this.f45623a = i7;
        this.f45624b = anVar;
    }

    @Override
    public final void a(int i7) {
        switch (this.f45623a) {
            case 0:
                an anVar = this.f45624b;
                if (anVar.getParentActivity() != null && anVar.fragmentView != null && i7 > 0) {
                    org.telegram.ui.Components.hc.a0(anVar).m(org.telegram.ui.Components.gc.f33937r, i7, 0, 0, anVar.f43998xa).j();
                    return;
                }
                return;
            case 1:
                an anVar2 = this.f45624b;
                if (i7 == 0) {
                    anVar2.C6 = false;
                    anVar2.ha();
                    return;
                }
                anVar2.l(i7, 0, false, 0, true, 0);
                return;
            default:
                an anVar3 = this.f45624b;
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
