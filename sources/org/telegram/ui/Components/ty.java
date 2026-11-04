package org.telegram.ui.Components;

import android.graphics.RectF;
import android.view.View;
public final class ty implements gj0, hj0 {
    public final bz f38577a;

    public ty(bz bzVar) {
        this.f38577a = bzVar;
    }

    @Override
    public void b(float f10, float f11, int i3, View view) {
        bz bzVar = this.f38577a;
        xy xyVar = bzVar.K;
        if (!((org.telegram.ui.kw) xyVar).f47036b.f50255k2) {
            zy zyVar = (zy) view;
            if (bzVar.f32459n) {
                if (i3 != 0) {
                    int L = org.telegram.messenger.g0.L(6.0f);
                    RectF rectF = zyVar.f41155f;
                    float f12 = L;
                    if (rectF.left - f12 < f10 && rectF.right + f12 > f10) {
                        org.telegram.ui.kw kwVar = (org.telegram.ui.kw) bzVar.K;
                        kwVar.d((org.telegram.messenger.mo) kwVar.f47036b.getMessagesController().T0().get(zyVar.f41148b.f40853a));
                    }
                }
            } else if (i3 == bzVar.L && xyVar != null) {
                ((org.telegram.ui.kw) xyVar).f47036b.J4(true, false);
            } else {
                bzVar.f(zyVar.f41148b, i3);
            }
        }
    }

    @Override
    public boolean b1(View view) {
        return false;
    }

    @Override
    public boolean f(int r23, android.view.View r24) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ty.f(int, android.view.View):boolean");
    }

    @Override
    public void r0(View view, float f10, float f11) {
    }
}
