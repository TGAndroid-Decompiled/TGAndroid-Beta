package org.telegram.ui.Components;

import android.graphics.RectF;
import android.view.View;
public final class kz implements ik0, jk0 {
    public final tz f27989a;

    public kz(tz tzVar) {
        this.f27989a = tzVar;
    }

    @Override
    public void b(float f7, float f10, int i10, View view) {
        tz tzVar = this.f27989a;
        oz ozVar = tzVar.J;
        if (!((org.telegram.ui.qx) ozVar).f40919b.f44165j2) {
            rz rzVar = (rz) view;
            if (tzVar.f30763n) {
                if (i10 != 0) {
                    int L = org.telegram.messenger.i0.L(6.0f);
                    RectF rectF = rzVar.f30110f;
                    float f11 = L;
                    if (rectF.left - f11 < f7 && rectF.right + f11 > f7) {
                        org.telegram.ui.qx qxVar = (org.telegram.ui.qx) tzVar.J;
                        qxVar.d((org.telegram.messenger.bp) qxVar.f40919b.getMessagesController().S0().get(rzVar.f30104b.f29572a));
                    }
                }
            } else if (i10 == tzVar.K && ozVar != null) {
                ((org.telegram.ui.qx) ozVar).f40919b.J4(true, false);
            } else {
                tzVar.f(rzVar.f30104b, i10);
            }
        }
    }

    @Override
    public boolean f(int r23, android.view.View r24) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.kz.f(int, android.view.View):boolean");
    }

    @Override
    public boolean h1(View view) {
        return false;
    }

    @Override
    public void q0(View view, float f7, float f10) {
    }
}
