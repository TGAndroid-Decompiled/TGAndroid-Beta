package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
public final class dh implements MessagesStorage.IntCallback {
    public final int f31907a;
    public final eo f31908b;

    public dh(eo eoVar, int i10) {
        this.f31907a = i10;
        this.f31908b = eoVar;
    }

    @Override
    public final void run(int i10) {
        switch (this.f31907a) {
            case 0:
                eo eoVar = this.f31908b;
                if (eoVar.getParentActivity() != null && eoVar.fragmentView != null && i10 > 0) {
                    org.telegram.ui.Components.wc.a0(eoVar).m(org.telegram.ui.Components.vc.f27909r, i10, 0, 0, eoVar.f32316ea).j();
                    return;
                }
                return;
            case 1:
                eo eoVar2 = this.f31908b;
                if (i10 == 0) {
                    eoVar2.f32408m6 = false;
                    eoVar2.H9();
                    return;
                }
                eoVar2.E(i10, 0, 0, 0, false, true);
                return;
            default:
                eo eoVar3 = this.f31908b;
                if (i10 == 0) {
                    eoVar3.Qc(true);
                    return;
                } else {
                    eoVar3.finishFragment();
                    return;
                }
        }
    }
}
