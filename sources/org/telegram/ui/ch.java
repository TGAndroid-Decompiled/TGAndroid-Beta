package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
public final class ch implements MessagesStorage.IntCallback {
    public final int f32659a;
    public final zn f32660b;

    public ch(zn znVar, int i10) {
        this.f32659a = i10;
        this.f32660b = znVar;
    }

    @Override
    public final void run(int i10) {
        switch (this.f32659a) {
            case 0:
                zn znVar = this.f32660b;
                if (znVar.getParentActivity() != null && znVar.fragmentView != null && i10 > 0) {
                    org.telegram.ui.Components.xc.a0(znVar).m(org.telegram.ui.Components.wc.f30016r, i10, 0, 0, znVar.f40261ea).j();
                    return;
                }
                return;
            case 1:
                zn znVar2 = this.f32660b;
                if (i10 == 0) {
                    znVar2.f40354m6 = false;
                    znVar2.H9();
                    return;
                }
                znVar2.F(i10, 0, 0, 0, false, true);
                return;
            default:
                zn znVar3 = this.f32660b;
                if (i10 == 0) {
                    znVar3.Qc(true);
                    return;
                } else {
                    znVar3.finishFragment();
                    return;
                }
        }
    }
}
