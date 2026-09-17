package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
public final class eh implements MessagesStorage.IntCallback {
    public final int f33397a;
    public final bo f33398b;

    public eh(bo boVar, int i10) {
        this.f33397a = i10;
        this.f33398b = boVar;
    }

    @Override
    public final void run(int i10) {
        switch (this.f33397a) {
            case 0:
                bo boVar = this.f33398b;
                if (boVar.getParentActivity() != null && boVar.fragmentView != null && i10 > 0) {
                    org.telegram.ui.Components.vc.a0(boVar).m(org.telegram.ui.Components.uc.f28323r, i10, 0, 0, boVar.f32275ea).j();
                    return;
                }
                return;
            case 1:
                bo boVar2 = this.f33398b;
                if (i10 == 0) {
                    boVar2.f32368m6 = false;
                    boVar2.H9();
                    return;
                }
                boVar2.F(i10, 0, 0, 0, false, true);
                return;
            default:
                bo boVar3 = this.f33398b;
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
