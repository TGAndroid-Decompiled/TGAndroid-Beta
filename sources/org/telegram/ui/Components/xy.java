package org.telegram.ui.Components;

import android.graphics.RectF;
import android.view.View;
public final class xy implements dj0, ej0 {
    public final fz f40526a;

    public xy(fz fzVar) {
        this.f40526a = fzVar;
    }

    @Override
    public boolean c(int r23, android.view.View r24) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.xy.c(int, android.view.View):boolean");
    }

    @Override
    public void f(float f10, float f11, int i7, View view) {
        fz fzVar = this.f40526a;
        bz bzVar = fzVar.J;
        if (!((org.telegram.ui.pw) bzVar).f48821b.f52263k2) {
            dz dzVar = (dz) view;
            if (fzVar.f33782n) {
                if (i7 != 0) {
                    int L = org.telegram.messenger.g0.L(6.0f);
                    RectF rectF = dzVar.f33216f;
                    float f12 = L;
                    if (rectF.left - f12 < f10 && rectF.right + f12 > f10) {
                        org.telegram.ui.pw pwVar = (org.telegram.ui.pw) fzVar.J;
                        pwVar.d((org.telegram.messenger.vo) pwVar.f48821b.getMessagesController().T0().get(dzVar.f33209b.f32790a));
                    }
                }
            } else if (i7 == fzVar.K && bzVar != null) {
                ((org.telegram.ui.pw) bzVar).f48821b.J4(true, false);
            } else {
                fzVar.f(dzVar.f33209b, i7);
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
