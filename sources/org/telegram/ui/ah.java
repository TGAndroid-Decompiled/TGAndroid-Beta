package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
public final class ah implements MessagesStorage.IntCallback {
    public final int f34813a;
    public final yn f34814b;

    public ah(yn ynVar, int i10) {
        this.f34813a = i10;
        this.f34814b = ynVar;
    }

    @Override
    public final void run(int i10) {
        switch (this.f34813a) {
            case 0:
                yn ynVar = this.f34814b;
                if (ynVar.getParentActivity() != null && ynVar.fragmentView != null && i10 > 0) {
                    org.telegram.ui.Components.yc.a0(ynVar).m(org.telegram.ui.Components.xc.f32759r, i10, 0, 0, ynVar.f43300ca).j();
                    return;
                }
                return;
            case 1:
                yn ynVar2 = this.f34814b;
                if (i10 == 0) {
                    ynVar2.Pc(true);
                    return;
                } else {
                    ynVar2.finishFragment();
                    return;
                }
            default:
                yn ynVar3 = this.f34814b;
                if (i10 == 0) {
                    ynVar3.f43395k6 = false;
                    ynVar3.G9();
                    return;
                }
                ynVar3.D(i10, 0, 0, 0, false, true);
                return;
        }
    }
}
