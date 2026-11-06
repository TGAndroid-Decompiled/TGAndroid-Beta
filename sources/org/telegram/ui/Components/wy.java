package org.telegram.ui.Components;

import android.graphics.RectF;
import android.view.View;
public final class wy implements cj0, dj0 {
    public final ez f40102a;

    public wy(ez ezVar) {
        this.f40102a = ezVar;
    }

    @Override
    public boolean c(int r23, android.view.View r24) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.wy.c(int, android.view.View):boolean");
    }

    @Override
    public void f(float f10, float f11, int i7, View view) {
        ez ezVar = this.f40102a;
        az azVar = ezVar.J;
        if (!((org.telegram.ui.nw) azVar).f48122b.f51562j2) {
            cz czVar = (cz) view;
            if (ezVar.f33392n) {
                if (i7 != 0) {
                    int L = org.telegram.messenger.g0.L(6.0f);
                    RectF rectF = czVar.f32707f;
                    float f12 = L;
                    if (rectF.left - f12 < f10 && rectF.right + f12 > f10) {
                        org.telegram.ui.nw nwVar = (org.telegram.ui.nw) ezVar.J;
                        nwVar.d((org.telegram.messenger.vo) nwVar.f48122b.getMessagesController().T0().get(czVar.f32700b.f32333a));
                    }
                }
            } else if (i7 == ezVar.K && azVar != null) {
                ((org.telegram.ui.nw) azVar).f48122b.J4(true, false);
            } else {
                ezVar.f(czVar.f32700b, i7);
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
