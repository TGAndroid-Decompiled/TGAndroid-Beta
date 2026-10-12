package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
public final class fh implements MessagesStorage.IntCallback {
    public final int f35833a;
    public final fo f35834b;

    public fh(fo foVar, int i10) {
        this.f35833a = i10;
        this.f35834b = foVar;
    }

    @Override
    public final void run(int i10) {
        switch (this.f35833a) {
            case 0:
                fo foVar = this.f35834b;
                if (foVar.getParentActivity() != null && foVar.fragmentView != null && i10 > 0) {
                    org.telegram.ui.Components.zc.a0(foVar).m(org.telegram.ui.Components.yc.f31537r, i10, 0, 0, foVar.f35932ea).j();
                    return;
                }
                return;
            case 1:
                fo foVar2 = this.f35834b;
                if (i10 == 0) {
                    foVar2.f36025m6 = false;
                    foVar2.M9();
                    return;
                }
                foVar2.j(i10, 0, false, 0, true, 0);
                return;
            default:
                fo foVar3 = this.f35834b;
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
