package org.telegram.ui.Components;

import android.graphics.RectF;
import android.view.View;
public final class kz implements hk0, ik0 {
    public final tz f27942a;

    public kz(tz tzVar) {
        this.f27942a = tzVar;
    }

    @Override
    public void b(float f7, float f10, int i10, View view) {
        tz tzVar = this.f27942a;
        oz ozVar = tzVar.J;
        if (!((org.telegram.ui.rx) ozVar).f41307b.f35822j2) {
            rz rzVar = (rz) view;
            if (tzVar.f30717n) {
                if (i10 != 0) {
                    int L = org.telegram.messenger.i0.L(6.0f);
                    RectF rectF = rzVar.f30055f;
                    float f11 = L;
                    if (rectF.left - f11 < f7 && rectF.right + f11 > f7) {
                        org.telegram.ui.rx rxVar = (org.telegram.ui.rx) tzVar.J;
                        rxVar.d((org.telegram.messenger.ap) rxVar.f41307b.getMessagesController().S0().get(rzVar.f30049b.f29471a));
                    }
                }
            } else if (i10 == tzVar.K && ozVar != null) {
                ((org.telegram.ui.rx) ozVar).f41307b.I4(true, false);
            } else {
                tzVar.f(rzVar.f30049b, i10);
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
