package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class uk implements Runnable {
    public final int f33431a;
    public final al f33432b;

    public uk(al alVar, int i10) {
        this.f33431a = i10;
        this.f33432b = alVar;
    }

    @Override
    public final void run() {
        switch (this.f33431a) {
            case 0:
                this.f33432b.Z();
                return;
            case 1:
                al alVar = this.f33432b;
                EditTextBoldCursor editTextBoldCursor = alVar.S;
                if (!alVar.K && !alVar.N0 && !alVar.f30215b.isDismissed() && alVar.L0 && alVar.T0 == null && editTextBoldCursor.hasFocus() && alVar.isShown()) {
                    AndroidUtilities.showKeyboard(editTextBoldCursor);
                    return;
                }
                return;
            case 2:
                al alVar2 = this.f33432b;
                if (!alVar2.K && alVar2.L0 && alVar2.isShown()) {
                    alVar2.c0();
                    return;
                }
                return;
            case 3:
                al alVar3 = this.f33432b;
                if (!alVar3.K) {
                    float f7 = alVar3.m0;
                    if (f7 < 1.0f && alVar3.f26532l0 == null) {
                        o1.j jVar = new o1.j(new ac.a(f7));
                        alVar3.f26532l0 = jVar;
                        o1.k kVar = new o1.k(1.0f);
                        kVar.a(0.55f);
                        kVar.b(65.0f);
                        jVar.f18969u = kVar;
                        alVar3.f26532l0.e(0.001f);
                        alVar3.f26532l0.b(new n7(alVar3, 4));
                        alVar3.f26532l0.a(new hb(alVar3, 2));
                        alVar3.f26532l0.h();
                        return;
                    }
                    return;
                }
                return;
            case 4:
                al alVar4 = this.f33432b;
                if (alVar4.L0 && !alVar4.K) {
                    alVar4.b0();
                    if (alVar4.M0) {
                        alVar4.c0();
                        return;
                    }
                    return;
                }
                return;
            default:
                al alVar5 = this.f33432b;
                if (!alVar5.f26536p0) {
                    alVar5.f26535o0.setVisibility(4);
                    return;
                }
                return;
        }
    }
}
