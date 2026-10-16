package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
public final class fh implements MessagesStorage.IntCallback {
    public final int f35532a;
    public final fo f35533b;

    public fh(fo foVar, int i10) {
        this.f35532a = i10;
        this.f35533b = foVar;
    }

    @Override
    public final void run(int i10) {
        switch (this.f35532a) {
            case 0:
                fo foVar = this.f35533b;
                if (foVar.getParentActivity() != null && foVar.fragmentView != null && i10 > 0) {
                    org.telegram.ui.Components.zc.a0(foVar).m(org.telegram.ui.Components.yc.f31211r, i10, 0, 0, foVar.f35633ea).j();
                    return;
                }
                return;
            case 1:
                fo foVar2 = this.f35533b;
                if (i10 == 0) {
                    foVar2.f35726m6 = false;
                    foVar2.M9();
                    return;
                }
                foVar2.j(i10, 0, false, 0, true, 0);
                return;
            default:
                fo foVar3 = this.f35533b;
                if (i10 == 0) {
                    foVar3.Uc(true);
                    return;
                } else {
                    foVar3.finishFragment();
                    return;
                }
        }
    }
}
