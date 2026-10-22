package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class uk implements Runnable {
    public final int f30957a;
    public final al f30958b;

    public uk(al alVar, int i10) {
        this.f30957a = i10;
        this.f30958b = alVar;
    }

    @Override
    public final void run() {
        switch (this.f30957a) {
            case 0:
                this.f30958b.Z();
                return;
            case 1:
                al alVar = this.f30958b;
                EditTextBoldCursor editTextBoldCursor = alVar.P;
                if (!alVar.H && !alVar.K0 && !alVar.f28176b.isDismissed() && alVar.I0 && alVar.Q0 == null && editTextBoldCursor.hasFocus() && alVar.isShown()) {
                    AndroidUtilities.showKeyboard(editTextBoldCursor);
                    return;
                }
                return;
            case 2:
                al alVar2 = this.f30958b;
                if (!alVar2.H && alVar2.I0 && alVar2.isShown()) {
                    alVar2.c0();
                    return;
                }
                return;
            case 3:
                al alVar3 = this.f30958b;
                if (!alVar3.H) {
                    float f7 = alVar3.f24648j0;
                    if (f7 < 1.0f && alVar3.f24647i0 == null) {
                        o1.k kVar = new o1.k(new o1.j(f7));
                        alVar3.f24647i0 = kVar;
                        o1.l lVar = new o1.l(1.0f);
                        lVar.a(0.55f);
                        lVar.b(65.0f);
                        kVar.f17559u = lVar;
                        alVar3.f24647i0.e(0.001f);
                        alVar3.f24647i0.b(new l7(alVar3, 4));
                        alVar3.f24647i0.a(new hb(alVar3, 2));
                        alVar3.f24647i0.h();
                        return;
                    }
                    return;
                }
                return;
            case 4:
                al alVar4 = this.f30958b;
                if (alVar4.I0 && !alVar4.H) {
                    alVar4.b0();
                    if (alVar4.J0) {
                        alVar4.c0();
                        return;
                    }
                    return;
                }
                return;
            default:
                al alVar5 = this.f30958b;
                if (!alVar5.m0) {
                    alVar5.f24650l0.setVisibility(4);
                    return;
                }
                return;
        }
    }
}
