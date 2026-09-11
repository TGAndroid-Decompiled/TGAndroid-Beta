package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
public final class ch implements MessagesStorage.IntCallback {
    public final int f35109a;
    public final co f35110b;

    public ch(co coVar, int i10) {
        this.f35109a = i10;
        this.f35110b = coVar;
    }

    @Override
    public final void run(int i10) {
        switch (this.f35109a) {
            case 0:
                co coVar = this.f35110b;
                if (coVar.getParentActivity() != null && coVar.fragmentView != null && i10 > 0) {
                    org.telegram.ui.Components.yc.a0(coVar).m(org.telegram.ui.Components.xc.f32499r, i10, 0, 0, coVar.f35247ea).j();
                    return;
                }
                return;
            case 1:
                co coVar2 = this.f35110b;
                if (i10 == 0) {
                    coVar2.f35339m6 = false;
                    coVar2.H9();
                    return;
                }
                coVar2.F(i10, 0, 0, 0, false, true);
                return;
            default:
                co coVar3 = this.f35110b;
                if (i10 == 0) {
                    coVar3.Qc(true);
                    return;
                } else {
                    coVar3.finishFragment();
                    return;
                }
        }
    }
}
