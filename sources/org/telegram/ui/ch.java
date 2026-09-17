package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
public final class ch implements MessagesStorage.IntCallback {
    public final int f35110a;
    public final co f35111b;

    public ch(co coVar, int i10) {
        this.f35110a = i10;
        this.f35111b = coVar;
    }

    @Override
    public final void run(int i10) {
        switch (this.f35110a) {
            case 0:
                co coVar = this.f35111b;
                if (coVar.getParentActivity() != null && coVar.fragmentView != null && i10 > 0) {
                    org.telegram.ui.Components.yc.a0(coVar).m(org.telegram.ui.Components.xc.f32500r, i10, 0, 0, coVar.f35248ea).j();
                    return;
                }
                return;
            case 1:
                co coVar2 = this.f35111b;
                if (i10 == 0) {
                    coVar2.f35340m6 = false;
                    coVar2.H9();
                    return;
                }
                coVar2.F(i10, 0, 0, 0, false, true);
                return;
            default:
                co coVar3 = this.f35111b;
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
