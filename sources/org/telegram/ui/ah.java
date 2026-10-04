package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
public final class ah implements MessagesStorage.IntCallback {
    public final int f34812a;
    public final yn f34813b;

    public ah(yn ynVar, int i10) {
        this.f34812a = i10;
        this.f34813b = ynVar;
    }

    @Override
    public final void run(int i10) {
        switch (this.f34812a) {
            case 0:
                yn ynVar = this.f34813b;
                if (ynVar.getParentActivity() != null && ynVar.fragmentView != null && i10 > 0) {
                    org.telegram.ui.Components.yc.a0(ynVar).m(org.telegram.ui.Components.xc.f32758r, i10, 0, 0, ynVar.f43299ca).j();
                    return;
                }
                return;
            case 1:
                yn ynVar2 = this.f34813b;
                if (i10 == 0) {
                    ynVar2.Pc(true);
                    return;
                } else {
                    ynVar2.finishFragment();
                    return;
                }
            default:
                yn ynVar3 = this.f34813b;
                if (i10 == 0) {
                    ynVar3.f43394k6 = false;
                    ynVar3.G9();
                    return;
                }
                ynVar3.D(i10, 0, 0, 0, false, true);
                return;
        }
    }
}
