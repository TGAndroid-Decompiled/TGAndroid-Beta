package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
public final class eh implements MessagesStorage.IntCallback {
    public final int f37107a;
    public final eo f37108b;

    public eh(eo eoVar, int i10) {
        this.f37107a = i10;
        this.f37108b = eoVar;
    }

    @Override
    public final void run(int i10) {
        switch (this.f37107a) {
            case 0:
                eo eoVar = this.f37108b;
                if (eoVar.getParentActivity() != null && eoVar.fragmentView != null && i10 > 0) {
                    org.telegram.ui.Components.zc.a0(eoVar).m(org.telegram.ui.Components.yc.f33037r, i10, 0, 0, eoVar.f37256ea).j();
                    return;
                }
                return;
            case 1:
                eo eoVar2 = this.f37108b;
                if (i10 == 0) {
                    eoVar2.f37348m6 = false;
                    eoVar2.M9();
                    return;
                }
                eoVar2.F(i10, 0, 0, 0, false, true);
                return;
            default:
                eo eoVar3 = this.f37108b;
                if (i10 == 0) {
                    eoVar3.Uc(true);
                    return;
                } else {
                    eoVar3.finishFragment();
                    return;
                }
        }
    }
}
