package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class al implements Runnable {
    public final int f24619a;
    public final gl f24620b;

    public al(gl glVar, int i10) {
        this.f24619a = i10;
        this.f24620b = glVar;
    }

    @Override
    public final void run() {
        switch (this.f24619a) {
            case 0:
                this.f24620b.Z();
                return;
            case 1:
                gl glVar = this.f24620b;
                EditTextBoldCursor editTextBoldCursor = glVar.P;
                if (!glVar.H && !glVar.K0 && !glVar.f30245b.isDismissed() && glVar.I0 && glVar.Q0 == null && editTextBoldCursor.hasFocus() && glVar.isShown()) {
                    AndroidUtilities.showKeyboard(editTextBoldCursor);
                    return;
                }
                return;
            case 2:
                gl glVar2 = this.f24620b;
                if (!glVar2.H && glVar2.I0 && glVar2.isShown()) {
                    glVar2.c0();
                    return;
                }
                return;
            case 3:
                gl glVar3 = this.f24620b;
                if (!glVar3.H) {
                    float f7 = glVar3.f26795j0;
                    if (f7 < 1.0f && glVar3.f26794i0 == null) {
                        o1.k kVar = new o1.k(new o1.j(f7));
                        glVar3.f26794i0 = kVar;
                        o1.l lVar = new o1.l(1.0f);
                        lVar.a(0.55f);
                        lVar.b(65.0f);
                        kVar.f17024u = lVar;
                        glVar3.f26794i0.e(0.001f);
                        glVar3.f26794i0.b(new m7(glVar3, 4));
                        glVar3.f26794i0.a(new jb(glVar3, 2));
                        glVar3.f26794i0.h();
                        return;
                    }
                    return;
                }
                return;
            case 4:
                gl glVar4 = this.f24620b;
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
                gl glVar5 = this.f24620b;
                if (!glVar5.m0) {
                    glVar5.f26797l0.setVisibility(4);
                    return;
                }
                return;
        }
    }
}
