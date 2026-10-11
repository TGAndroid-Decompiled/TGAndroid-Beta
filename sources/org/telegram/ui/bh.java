package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
public final class bh implements MessagesStorage.IntCallback {
    public final int f36420a;
    public final zn f36421b;

    public bh(zn znVar, int i10) {
        this.f36420a = i10;
        this.f36421b = znVar;
    }

    @Override
    public final void run(int i10) {
        switch (this.f36420a) {
            case 0:
                zn znVar = this.f36421b;
                if (znVar.getParentActivity() != null && znVar.fragmentView != null && i10 > 0) {
                    org.telegram.ui.Components.ad.a0(znVar).m(org.telegram.ui.Components.zc.f33600r, i10, 0, 0, znVar.f44796ea).j();
                    return;
                }
                return;
            case 1:
                zn znVar2 = this.f36421b;
                if (i10 == 0) {
                    znVar2.f44888m6 = false;
                    znVar2.M9();
                    return;
                }
                znVar2.F(i10, 0, 0, 0, false, true);
                return;
            default:
                zn znVar3 = this.f36421b;
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
