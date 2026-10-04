package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class qh implements o1.g {
    public final int f30029a = 1;
    public final boolean f30030b;
    public final float f30031c;
    public final float d;
    public final KeyEvent.Callback f30032e;

    public qh(xi xiVar, float f7, float f10, boolean z10) {
        this.f30032e = xiVar;
        this.f30031c = f7;
        this.d = f10;
        this.f30030b = z10;
    }

    @Override
    public final void a(o1.h hVar, float f7, float f10) {
        switch (this.f30029a) {
            case 0:
                xi xiVar = (xi) this.f30032e;
                LinearLayout linearLayout = xiVar.l1;
                LinearLayout linearLayout2 = xiVar.f32843n1;
                float f11 = f7 / 500.0f;
                ii iiVar = xiVar.f32815e0;
                pi piVar = xiVar.f32880y0;
                Float valueOf = Float.valueOf(f11);
                iiVar.getClass();
                iiVar.a(piVar, valueOf);
                xiVar.X0.setAlpha(AndroidUtilities.lerp(this.f30031c, this.d, f11));
                xiVar.W1(xiVar.f32880y0, 0);
                xiVar.W1(xiVar.f32883z0, 0);
                if (!(xiVar.f32883z0 instanceof tm) || this.f30030b) {
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
                pp0 pp0Var = (pp0) this.f30032e;
                boolean z10 = this.f30030b;
                if (z10) {
                    if (f7 > this.f30031c / 2.0f || !pp0Var.f29712s) {
                        return;
                    }
                } else if (f7 < this.d / 2.0f || !pp0Var.f29711r) {
                    return;
                }
                pp0Var.f29712s = !z10;
                pp0Var.f29711r = z10;
                return;
        }
    }

    public qh(pp0 pp0Var, boolean z10, float f7, float f10) {
        this.f30032e = pp0Var;
        this.f30030b = z10;
        this.f30031c = f7;
        this.d = f10;
    }
}
