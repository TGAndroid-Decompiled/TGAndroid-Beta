package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class al implements Runnable {
    public final int f24578a;
    public final gl f24579b;

    public al(gl glVar, int i10) {
        this.f24578a = i10;
        this.f24579b = glVar;
    }

    @Override
    public final void run() {
        switch (this.f24578a) {
            case 0:
                this.f24579b.Z();
                return;
            case 1:
                gl glVar = this.f24579b;
                EditTextBoldCursor editTextBoldCursor = glVar.P;
                if (!glVar.H && !glVar.K0 && !glVar.f30211b.isDismissed() && glVar.I0 && glVar.Q0 == null && editTextBoldCursor.hasFocus() && glVar.isShown()) {
                    AndroidUtilities.showKeyboard(editTextBoldCursor);
                    return;
                }
                return;
            case 2:
                gl glVar2 = this.f24579b;
                if (!glVar2.H && glVar2.I0 && glVar2.isShown()) {
                    glVar2.c0();
                    return;
                }
                return;
            case 3:
                gl glVar3 = this.f24579b;
                if (!glVar3.H) {
                    float f7 = glVar3.f26766j0;
                    if (f7 < 1.0f && glVar3.f26765i0 == null) {
                        o1.k kVar = new o1.k(new o1.j(f7));
                        glVar3.f26765i0 = kVar;
                        o1.l lVar = new o1.l(1.0f);
                        lVar.a(0.55f);
                        lVar.b(65.0f);
                        kVar.f16942u = lVar;
                        glVar3.f26765i0.e(0.001f);
                        glVar3.f26765i0.b(new m7(glVar3, 4));
                        glVar3.f26765i0.a(new kb(glVar3, 2));
                        glVar3.f26765i0.h();
                        return;
                    }
                    return;
                }
                return;
            case 4:
                gl glVar4 = this.f24579b;
                if (glVar4.I0 && !glVar4.H) {
                    glVar4.b0();
                    if (glVar4.J0) {
                        glVar4.c0();
                        return;
                    }
                    return;
                }
                return;
            default:
                gl glVar5 = this.f24579b;
                if (!glVar5.m0) {
                    glVar5.f26768l0.setVisibility(4);
                    return;
                }
                return;
        }
    }
}
