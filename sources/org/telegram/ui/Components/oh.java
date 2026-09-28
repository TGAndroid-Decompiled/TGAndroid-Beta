package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class oh implements o1.g {
    public final int f27063a = 1;
    public final boolean f27064b;
    public final float f27065c;
    public final float d;
    public final KeyEvent.Callback e;

    public oh(wi wiVar, float f7, float f10, boolean z10) {
        this.e = wiVar;
        this.f27065c = f7;
        this.d = f10;
        this.f27064b = z10;
    }

    @Override
    public final void a(o1.h hVar, float f7, float f10) {
        switch (this.f27063a) {
            case 0:
                wi wiVar = (wi) this.e;
                LinearLayout linearLayout = wiVar.l1;
                LinearLayout linearLayout2 = wiVar.f29967n1;
                float f11 = f7 / 500.0f;
                wiVar.f29939e0.set(wiVar.f30004y0, Float.valueOf(f11));
                wiVar.X0.setAlpha(AndroidUtilities.lerp(this.f27065c, this.d, f11));
                wiVar.X1(wiVar.f30004y0, 0);
                wiVar.X1(wiVar.f30007z0, 0);
                if (!(wiVar.f30007z0 instanceof sm) || this.f27064b) {
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
                lp0 lp0Var = (lp0) this.e;
                boolean z10 = this.f27064b;
                if (z10) {
                    if (f7 > this.f27065c / 2.0f || !lp0Var.f26065s) {
                        return;
                    }
                } else if (f7 < this.d / 2.0f || !lp0Var.f26064r) {
                    return;
                }
                lp0Var.f26065s = !z10;
                lp0Var.f26064r = z10;
                return;
        }
    }

    public oh(lp0 lp0Var, boolean z10, float f7, float f10) {
        this.e = lp0Var;
        this.f27064b = z10;
        this.f27065c = f7;
        this.d = f10;
    }
}
