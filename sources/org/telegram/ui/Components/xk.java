package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class xk implements Runnable {
    public final int f31266a;
    public final dl f31267b;

    public xk(dl dlVar, int i10) {
        this.f31266a = i10;
        this.f31267b = dlVar;
    }

    @Override
    public final void run() {
        switch (this.f31266a) {
            case 0:
                this.f31267b.Z();
                return;
            case 1:
                dl dlVar = this.f31267b;
                EditTextBoldCursor editTextBoldCursor = dlVar.P;
                if (!dlVar.H && !dlVar.K0 && !dlVar.f27671b.isDismissed() && dlVar.I0 && dlVar.Q0 == null && editTextBoldCursor.hasFocus() && dlVar.isShown()) {
                    AndroidUtilities.showKeyboard(editTextBoldCursor);
                    return;
                }
                return;
            case 2:
                dl dlVar2 = this.f31267b;
                if (!dlVar2.H && dlVar2.I0 && dlVar2.isShown()) {
                    dlVar2.c0();
                    return;
                }
                return;
            case 3:
                dl dlVar3 = this.f31267b;
                if (!dlVar3.H) {
                    float f7 = dlVar3.f24424j0;
                    if (f7 < 1.0f && dlVar3.f24423i0 == null) {
                        o1.k kVar = new o1.k(new o1.j(f7));
                        dlVar3.f24423i0 = kVar;
                        o1.l lVar = new o1.l(1.0f);
                        lVar.a(0.55f);
                        lVar.b(65.0f);
                        kVar.f16468u = lVar;
                        dlVar3.f24423i0.e(0.001f);
                        dlVar3.f24423i0.b(new n7(dlVar3, 4));
                        dlVar3.f24423i0.a(new jb(dlVar3, 2));
                        dlVar3.f24423i0.h();
                        return;
                    }
                    return;
                }
                return;
            case 4:
                dl dlVar4 = this.f31267b;
                if (dlVar4.I0 && !dlVar4.H) {
                    dlVar4.b0();
                    if (dlVar4.J0) {
                        dlVar4.c0();
                        return;
                    }
                    return;
                }
                return;
            default:
                dl dlVar5 = this.f31267b;
                if (!dlVar5.m0) {
                    dlVar5.f24426l0.setVisibility(4);
                    return;
                }
                return;
        }
    }
}
