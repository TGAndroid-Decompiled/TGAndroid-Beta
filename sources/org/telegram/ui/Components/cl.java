package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class cl implements Runnable {
    public final int f24963a;
    public final il f24964b;

    public cl(il ilVar, int i10) {
        this.f24963a = i10;
        this.f24964b = ilVar;
    }

    @Override
    public final void run() {
        switch (this.f24963a) {
            case 0:
                this.f24964b.Z();
                return;
            case 1:
                il ilVar = this.f24964b;
                EditTextBoldCursor editTextBoldCursor = ilVar.P;
                if (!ilVar.H && !ilVar.K0 && !ilVar.f30574b.isDismissed() && ilVar.I0 && ilVar.Q0 == null && editTextBoldCursor.hasFocus() && ilVar.isShown()) {
                    AndroidUtilities.showKeyboard(editTextBoldCursor);
                    return;
                }
                return;
            case 2:
                il ilVar2 = this.f24964b;
                if (!ilVar2.H && ilVar2.I0 && ilVar2.isShown()) {
                    ilVar2.c0();
                    return;
                }
                return;
            case 3:
                il ilVar3 = this.f24964b;
                if (!ilVar3.H) {
                    float f7 = ilVar3.f27201j0;
                    if (f7 < 1.0f && ilVar3.f27200i0 == null) {
                        o1.k kVar = new o1.k(new o1.j(f7));
                        ilVar3.f27200i0 = kVar;
                        o1.l lVar = new o1.l(1.0f);
                        lVar.a(0.55f);
                        lVar.b(65.0f);
                        kVar.f16690u = lVar;
                        ilVar3.f27200i0.e(0.001f);
                        ilVar3.f27200i0.b(new m7(ilVar3, 4));
                        ilVar3.f27200i0.a(new jb(ilVar3, 2));
                        ilVar3.f27200i0.h();
                        return;
                    }
                    return;
                }
                return;
            case 4:
                il ilVar4 = this.f24964b;
                if (ilVar4.I0 && !ilVar4.H) {
                    ilVar4.b0();
                    if (ilVar4.J0) {
                        ilVar4.c0();
                        return;
                    }
                    return;
                }
                return;
            default:
                il ilVar5 = this.f24964b;
                if (!ilVar5.m0) {
                    ilVar5.f27203l0.setVisibility(4);
                    return;
                }
                return;
        }
    }
}
