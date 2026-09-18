package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
public final class eh implements MessagesStorage.IntCallback {
    public final int f33401a;
    public final bo f33402b;

    public eh(bo boVar, int i10) {
        this.f33401a = i10;
        this.f33402b = boVar;
    }

    @Override
    public final void run(int i10) {
        switch (this.f33401a) {
            case 0:
                bo boVar = this.f33402b;
                if (boVar.getParentActivity() != null && boVar.fragmentView != null && i10 > 0) {
                    org.telegram.ui.Components.vc.a0(boVar).m(org.telegram.ui.Components.uc.f28326r, i10, 0, 0, boVar.f32279ea).j();
                    return;
                }
                return;
            case 1:
                bo boVar2 = this.f33402b;
                if (i10 == 0) {
                    boVar2.f32372m6 = false;
                    boVar2.H9();
                    return;
                }
                boVar2.F(i10, 0, 0, 0, false, true);
                return;
            default:
                bo boVar3 = this.f33402b;
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
