package org.telegram.ui.Components;

import android.graphics.RectF;
import android.view.View;
public final class az implements hj0, ij0 {
    public final iz f33108a;

    public az(iz izVar) {
        this.f33108a = izVar;
    }

    @Override
    public boolean b(int r23, android.view.View r24) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.az.b(int, android.view.View):boolean");
    }

    @Override
    public boolean c1(View view) {
        return false;
    }

    @Override
    public void f(float f10, float f11, int i7, View view) {
        iz izVar = this.f33108a;
        ez ezVar = izVar.K;
        if (!((org.telegram.ui.pw) ezVar).f50385b.f53703l2) {
            gz gzVar = (gz) view;
            if (izVar.f35798n) {
                if (i7 != 0) {
                    int L = org.telegram.messenger.g0.L(6.0f);
                    RectF rectF = gzVar.f35112f;
                    float f12 = L;
                    if (rectF.left - f12 < f10 && rectF.right + f12 > f10) {
                        org.telegram.ui.pw pwVar = (org.telegram.ui.pw) izVar.K;
                        pwVar.d((org.telegram.messenger.so) pwVar.f50385b.getMessagesController().T0().get(gzVar.f35105b.f34748a));
                    }
                }
            } else if (i7 == izVar.L && ezVar != null) {
                ((org.telegram.ui.pw) ezVar).f50385b.J4(true, false);
            } else {
                izVar.f(gzVar.f35105b, i7);
            }
        }
    }

    @Override
    public void r0(View view, float f10, float f11) {
    }
}
