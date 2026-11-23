package org.telegram.ui.Components;

import android.graphics.RectF;
import android.view.View;
public final class fz implements rj0, sj0 {
    public final oz f35238a;

    public fz(oz ozVar) {
        this.f35238a = ozVar;
    }

    @Override
    public boolean U0(View view) {
        return false;
    }

    @Override
    public boolean b(int r28, android.view.View r29) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.fz.b(int, android.view.View):boolean");
    }

    @Override
    public void g(float f10, float f11, int i7, View view) {
        oz ozVar = this.f35238a;
        kz kzVar = ozVar.K;
        if (!((org.telegram.ui.sw) kzVar).f52164b.f46579l2) {
            mz mzVar = (mz) view;
            if (ozVar.f38306n) {
                if (i7 != 0) {
                    int L = org.telegram.messenger.g0.L(6.0f);
                    RectF rectF = mzVar.f37581f;
                    float f12 = L;
                    if (rectF.left - f12 < f10 && rectF.right + f12 > f10) {
                        org.telegram.ui.sw swVar = (org.telegram.ui.sw) ozVar.K;
                        swVar.d((org.telegram.messenger.ro) swVar.f52164b.getMessagesController().V0().get(mzVar.f37574b.f37261a));
                    }
                }
            } else if (i7 == ozVar.L && kzVar != null) {
                ((org.telegram.ui.sw) kzVar).f52164b.R4(true, false);
            } else {
                ozVar.g(mzVar.f37574b, i7);
            }
        }
    }

    @Override
    public void f0(View view, float f10, float f11) {
    }
}
