package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class wk implements Runnable {
    public final int f30596a;
    public final cl f30597b;

    public wk(cl clVar, int i10) {
        this.f30596a = i10;
        this.f30597b = clVar;
    }

    @Override
    public final void run() {
        switch (this.f30596a) {
            case 0:
                this.f30597b.Z();
                return;
            case 1:
                cl clVar = this.f30597b;
                EditTextBoldCursor editTextBoldCursor = clVar.P;
                if (!clVar.H && !clVar.K0 && !clVar.f27360b.isDismissed() && clVar.I0 && clVar.Q0 == null && editTextBoldCursor.hasFocus() && clVar.isShown()) {
                    AndroidUtilities.showKeyboard(editTextBoldCursor);
                    return;
                }
                return;
            case 2:
                cl clVar2 = this.f30597b;
                if (!clVar2.H && clVar2.I0 && clVar2.isShown()) {
                    clVar2.c0();
                    return;
                }
                return;
            case 3:
                cl clVar3 = this.f30597b;
                if (!clVar3.H) {
                    float f7 = clVar3.f23779j0;
                    if (f7 < 1.0f && clVar3.f23778i0 == null) {
                        o1.k kVar = new o1.k(new o1.j(f7));
                        clVar3.f23778i0 = kVar;
                        o1.l lVar = new o1.l(1.0f);
                        lVar.a(0.55f);
                        lVar.b(65.0f);
                        kVar.f16161u = lVar;
                        clVar3.f23778i0.e(0.001f);
                        clVar3.f23778i0.b(new n7(clVar3, 4));
                        clVar3.f23778i0.a(new jb(clVar3, 2));
                        clVar3.f23778i0.h();
                        return;
                    }
                    return;
                }
                return;
            case 4:
                cl clVar4 = this.f30597b;
                if (clVar4.I0 && !clVar4.H) {
                    clVar4.b0();
                    if (clVar4.J0) {
                        clVar4.c0();
                        return;
                    }
                    return;
                }
                return;
            default:
                cl clVar5 = this.f30597b;
                if (!clVar5.m0) {
                    clVar5.f23781l0.setVisibility(4);
                    return;
                }
                return;
        }
    }
}
