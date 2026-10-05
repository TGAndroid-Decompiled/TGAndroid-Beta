package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class qh implements o1.g {
    public final int f30051a = 1;
    public final boolean f30052b;
    public final float f30053c;
    public final float d;
    public final KeyEvent.Callback f30054e;

    public qh(xi xiVar, float f7, float f10, boolean z10) {
        this.f30054e = xiVar;
        this.f30053c = f7;
        this.d = f10;
        this.f30052b = z10;
    }

    @Override
    public final void a(o1.h hVar, float f7, float f10) {
        switch (this.f30051a) {
            case 0:
                xi xiVar = (xi) this.f30054e;
                LinearLayout linearLayout = xiVar.l1;
                LinearLayout linearLayout2 = xiVar.f32934n1;
                float f11 = f7 / 500.0f;
                ii iiVar = xiVar.f32906e0;
                pi piVar = xiVar.f32971y0;
                Float valueOf = Float.valueOf(f11);
                iiVar.getClass();
                iiVar.a(piVar, valueOf);
                xiVar.X0.setAlpha(AndroidUtilities.lerp(this.f30053c, this.d, f11));
                xiVar.W1(xiVar.f32971y0, 0);
                xiVar.W1(xiVar.f32974z0, 0);
                if (!(xiVar.f32974z0 instanceof tm) || this.f30052b) {
                    f11 = 1.0f - f11;
                }
                float clamp = Utilities.clamp(f11, 1.0f, 0.0f);
                linearLayout2.setAlpha(clamp);
                float f12 = 1.0f - clamp;
                linearLayout.setAlpha(f12);
                linearLayout.setTranslationX(clamp * (-AndroidUtilities.dp(16.0f)));
                linearLayout2.setTranslationX(f12 * AndroidUtilities.dp(16.0f));
                return;
            default:
                qp0 qp0Var = (qp0) this.f30054e;
                boolean z10 = this.f30052b;
                if (z10) {
                    if (f7 > this.f30053c / 2.0f || !qp0Var.f30179s) {
                        return;
                    }
                } else if (f7 < this.d / 2.0f || !qp0Var.f30178r) {
                    return;
                }
                qp0Var.f30179s = !z10;
                qp0Var.f30178r = z10;
                return;
        }
    }

    public qh(qp0 qp0Var, boolean z10, float f7, float f10) {
        this.f30054e = qp0Var;
        this.f30052b = z10;
        this.f30053c = f7;
        this.d = f10;
    }
}
