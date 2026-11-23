package org.telegram.ui.Components;

import android.graphics.RectF;
import android.view.View;
public final class iz implements rj0, sj0 {
    public final rz f36333a;

    public iz(rz rzVar) {
        this.f36333a = rzVar;
    }

    @Override
    public boolean b1(View view) {
        return false;
    }

    @Override
    public boolean c(int r28, android.view.View r29) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.iz.c(int, android.view.View):boolean");
    }

    @Override
    public void f(float f10, float f11, int i7, View view) {
        rz rzVar = this.f36333a;
        nz nzVar = rzVar.K;
        if (!((org.telegram.ui.tw) nzVar).f52405b.f46752l2) {
            pz pzVar = (pz) view;
            if (rzVar.f39407n) {
                if (i7 != 0) {
                    int L = org.telegram.messenger.g0.L(6.0f);
                    RectF rectF = pzVar.f38698f;
                    float f12 = L;
                    if (rectF.left - f12 < f10 && rectF.right + f12 > f10) {
                        org.telegram.ui.tw twVar = (org.telegram.ui.tw) rzVar.K;
                        twVar.d((org.telegram.messenger.so) twVar.f52405b.getMessagesController().V0().get(pzVar.f38691b.f38415a));
                    }
                }
            } else if (i7 == rzVar.L && nzVar != null) {
                ((org.telegram.ui.tw) nzVar).f52405b.R4(true, false);
            } else {
                rzVar.g(pzVar.f38691b, i7);
            }
        }
    }

    @Override
    public void s0(View view, float f10, float f11) {
    }
}
