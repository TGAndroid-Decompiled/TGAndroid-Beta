package org.telegram.ui.Components;

import android.graphics.RectF;
import android.view.View;
public final class xy implements cj0, dj0 {
    public final fz f40506a;

    public xy(fz fzVar) {
        this.f40506a = fzVar;
    }

    @Override
    public boolean c(int r23, android.view.View r24) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.xy.c(int, android.view.View):boolean");
    }

    @Override
    public void f(float f10, float f11, int i7, View view) {
        fz fzVar = this.f40506a;
        bz bzVar = fzVar.J;
        if (!((org.telegram.ui.nw) bzVar).f48150b.f51584j2) {
            dz dzVar = (dz) view;
            if (fzVar.f33715n) {
                if (i7 != 0) {
                    int L = org.telegram.messenger.g0.L(6.0f);
                    RectF rectF = dzVar.f33124f;
                    float f12 = L;
                    if (rectF.left - f12 < f10 && rectF.right + f12 > f10) {
                        org.telegram.ui.nw nwVar = (org.telegram.ui.nw) fzVar.J;
                        nwVar.d((org.telegram.messenger.vo) nwVar.f48150b.getMessagesController().T0().get(dzVar.f33117b.f32731a));
                    }
                }
            } else if (i7 == fzVar.K && bzVar != null) {
                ((org.telegram.ui.nw) bzVar).f48150b.J4(true, false);
            } else {
                fzVar.f(dzVar.f33117b, i7);
            }
        }
    }

    @Override
    public boolean f1(View view) {
        return false;
    }

    @Override
    public void r0(View view, float f10, float f11) {
    }
}
