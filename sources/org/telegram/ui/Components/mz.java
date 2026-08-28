package org.telegram.ui.Components;

import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class mz implements nk0, ok0 {
    public final vz f30949a;

    public mz(vz vzVar) {
        this.f30949a = vzVar;
    }

    @Override
    public boolean a(int r24, android.view.View r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.mz.a(int, android.view.View):boolean");
    }

    @Override
    public void c(float f10, float f11, int i9, View view) {
        vz vzVar = this.f30949a;
        qz qzVar = vzVar.F;
        if (!((org.telegram.ui.dw) qzVar).f37619b.f37658f2) {
            tz tzVar = (tz) view;
            if (vzVar.f34047n) {
                if (i9 != 0) {
                    int dp = AndroidUtilities.dp(6.0f);
                    RectF rectF = tzVar.f32848f;
                    float f12 = dp;
                    if (rectF.left - f12 < f10 && rectF.right + f12 > f10) {
                        org.telegram.ui.dw dwVar = (org.telegram.ui.dw) vzVar.F;
                        dwVar.d(dwVar.f37619b.getMessagesController().getDialogFilters().get(tzVar.f32841b.f32572a));
                    }
                }
            } else if (i9 == vzVar.G && qzVar != null) {
                ((org.telegram.ui.dw) qzVar).f37619b.x4(true, false);
            } else {
                vzVar.f(tzVar.f32841b, i9);
            }
        }
    }

    @Override
    public boolean f1(View view) {
        return false;
    }

    @Override
    public void g0(View view, float f10, float f11) {
    }
}
