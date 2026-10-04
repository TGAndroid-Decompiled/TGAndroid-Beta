package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class qh implements o1.g {
    public final int f30023a = 1;
    public final boolean f30024b;
    public final float f30025c;
    public final float d;
    public final KeyEvent.Callback f30026e;

    public qh(xi xiVar, float f7, float f10, boolean z10) {
        this.f30026e = xiVar;
        this.f30025c = f7;
        this.d = f10;
        this.f30024b = z10;
    }

    @Override
    public final void a(o1.h hVar, float f7, float f10) {
        switch (this.f30023a) {
            case 0:
                xi xiVar = (xi) this.f30026e;
                LinearLayout linearLayout = xiVar.l1;
                LinearLayout linearLayout2 = xiVar.f32836n1;
                float f11 = f7 / 500.0f;
                ii iiVar = xiVar.f32808e0;
                pi piVar = xiVar.f32873y0;
                Float valueOf = Float.valueOf(f11);
                iiVar.getClass();
                iiVar.a(piVar, valueOf);
                xiVar.X0.setAlpha(AndroidUtilities.lerp(this.f30025c, this.d, f11));
                xiVar.U1(xiVar.f32873y0, 0);
                xiVar.U1(xiVar.f32876z0, 0);
                if (!(xiVar.f32876z0 instanceof tm) || this.f30024b) {
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
                pp0 pp0Var = (pp0) this.f30026e;
                boolean z10 = this.f30024b;
                if (z10) {
                    if (f7 > this.f30025c / 2.0f || !pp0Var.f29706s) {
                        return;
                    }
                } else if (f7 < this.d / 2.0f || !pp0Var.f29705r) {
                    return;
                }
                pp0Var.f29706s = !z10;
                pp0Var.f29705r = z10;
                return;
        }
    }

    public qh(pp0 pp0Var, boolean z10, float f7, float f10) {
        this.f30026e = pp0Var;
        this.f30024b = z10;
        this.f30025c = f7;
        this.d = f10;
    }
}
