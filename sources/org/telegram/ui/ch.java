package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
public final class ch implements MessagesStorage.IntCallback {
    public final int f32784a;
    public final bo f32785b;

    public ch(bo boVar, int i10) {
        this.f32784a = i10;
        this.f32785b = boVar;
    }

    @Override
    public final void run(int i10) {
        switch (this.f32784a) {
            case 0:
                bo boVar = this.f32785b;
                if (boVar.getParentActivity() != null && boVar.fragmentView != null && i10 > 0) {
                    org.telegram.ui.Components.vc.a0(boVar).m(org.telegram.ui.Components.uc.f28336r, i10, 0, 0, boVar.f32297ea).j();
                    return;
                }
                return;
            case 1:
                bo boVar2 = this.f32785b;
                if (i10 == 0) {
                    boVar2.f32390m6 = false;
                    boVar2.H9();
                    return;
                }
                boVar2.F(i10, 0, 0, 0, false, true);
                return;
            default:
                bo boVar3 = this.f32785b;
                if (i10 == 0) {
                    boVar3.Qc(true);
                    return;
                } else {
                    boVar3.finishFragment();
                    return;
                }
        }
    }
}
