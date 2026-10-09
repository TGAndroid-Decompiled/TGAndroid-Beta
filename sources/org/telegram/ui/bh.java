package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
public final class bh implements MessagesStorage.IntCallback {
    public final int f36330a;
    public final zn f36331b;

    public bh(zn znVar, int i10) {
        this.f36330a = i10;
        this.f36331b = znVar;
    }

    @Override
    public final void run(int i10) {
        switch (this.f36330a) {
            case 0:
                zn znVar = this.f36331b;
                if (znVar.getParentActivity() != null && znVar.fragmentView != null && i10 > 0) {
                    org.telegram.ui.Components.ad.a0(znVar).m(org.telegram.ui.Components.zc.f33519r, i10, 0, 0, znVar.f44761ea).j();
                    return;
                }
                return;
            case 1:
                zn znVar2 = this.f36331b;
                if (i10 == 0) {
                    znVar2.f44853m6 = false;
                    znVar2.M9();
                    return;
                }
                znVar2.F(i10, 0, 0, 0, false, true);
                return;
            default:
                zn znVar3 = this.f36331b;
                if (i10 == 0) {
                    znVar3.Uc(true);
                    return;
                } else {
                    znVar3.finishFragment();
                    return;
                }
        }
    }
}
