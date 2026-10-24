package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class sk implements Runnable {
    public final int f30535a;
    public final yk f30536b;

    public sk(yk ykVar, int i10) {
        this.f30535a = i10;
        this.f30536b = ykVar;
    }

    @Override
    public final void run() {
        switch (this.f30535a) {
            case 0:
                this.f30536b.Z();
                return;
            case 1:
                yk ykVar = this.f30536b;
                EditTextBoldCursor editTextBoldCursor = ykVar.S;
                if (!ykVar.K && !ykVar.N0 && !ykVar.f27704b.isDismissed() && ykVar.L0 && ykVar.T0 == null && editTextBoldCursor.hasFocus() && ykVar.isShown()) {
                    AndroidUtilities.showKeyboard(editTextBoldCursor);
                    return;
                }
                return;
            case 2:
                yk ykVar2 = this.f30536b;
                if (!ykVar2.K && ykVar2.L0 && ykVar2.isShown()) {
                    ykVar2.c0();
                    return;
                }
                return;
            case 3:
                yk ykVar3 = this.f30536b;
                if (!ykVar3.K) {
                    float f7 = ykVar3.m0;
                    if (f7 < 1.0f && ykVar3.f32953l0 == null) {
                        o1.k kVar = new o1.k(new o1.j(f7));
                        ykVar3.f32953l0 = kVar;
                        o1.l lVar = new o1.l(1.0f);
                        lVar.a(0.55f);
                        lVar.b(65.0f);
                        kVar.f17622u = lVar;
                        ykVar3.f32953l0.e(0.001f);
                        ykVar3.f32953l0.b(new j7(ykVar3, 4));
                        ykVar3.f32953l0.a(new fb(ykVar3, 2));
                        ykVar3.f32953l0.h();
                        return;
                    }
                    return;
                }
                return;
            case 4:
                yk ykVar4 = this.f30536b;
                if (ykVar4.L0 && !ykVar4.K) {
                    ykVar4.b0();
                    if (ykVar4.M0) {
                        ykVar4.c0();
                        return;
                    }
                    return;
                }
                return;
            default:
                yk ykVar5 = this.f30536b;
                if (!ykVar5.f32957p0) {
                    ykVar5.f32956o0.setVisibility(4);
                    return;
                }
                return;
        }
    }
}
