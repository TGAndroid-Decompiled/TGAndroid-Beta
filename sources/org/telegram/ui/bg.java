package org.telegram.ui;
public final class bg implements org.telegram.messenger.kr {
    public final int f44039a;
    public final wm f44040b;

    public bg(wm wmVar, int i3) {
        this.f44039a = i3;
        this.f44040b = wmVar;
    }

    @Override
    public final void a(int i3) {
        switch (this.f44039a) {
            case 0:
                wm wmVar = this.f44040b;
                if (wmVar.getParentActivity() != null && wmVar.fragmentView != null && i3 > 0) {
                    org.telegram.ui.Components.fc.a0(wmVar).m(org.telegram.ui.Components.ec.f33348r, i3, 0, 0, wmVar.f51557ya).j();
                    return;
                }
                return;
            case 1:
                wm wmVar2 = this.f44040b;
                if (i3 == 0) {
                    wmVar2.D6 = false;
                    wmVar2.ha();
                    return;
                }
                wmVar2.l(i3, 0, false, 0, true, 0);
                return;
            default:
                wm wmVar3 = this.f44040b;
                if (i3 == 0) {
                    wmVar3.vd(true);
                    return;
                } else {
                    wmVar3.finishFragment();
                    return;
                }
        }
    }
}
