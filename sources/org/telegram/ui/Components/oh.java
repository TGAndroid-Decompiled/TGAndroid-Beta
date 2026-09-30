package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class oh implements o1.g {
    public final int f27061a = 1;
    public final boolean f27062b;
    public final float f27063c;
    public final float d;
    public final KeyEvent.Callback e;

    public oh(wi wiVar, float f7, float f10, boolean z10) {
        this.e = wiVar;
        this.f27063c = f7;
        this.d = f10;
        this.f27062b = z10;
    }

    @Override
    public final void a(o1.h hVar, float f7, float f10) {
        switch (this.f27061a) {
            case 0:
                wi wiVar = (wi) this.e;
                LinearLayout linearLayout = wiVar.l1;
                LinearLayout linearLayout2 = wiVar.f29958n1;
                float f11 = f7 / 500.0f;
                wiVar.f29930e0.set(wiVar.f29995y0, Float.valueOf(f11));
                wiVar.X0.setAlpha(AndroidUtilities.lerp(this.f27063c, this.d, f11));
                wiVar.X1(wiVar.f29995y0, 0);
                wiVar.X1(wiVar.f29998z0, 0);
                if (!(wiVar.f29998z0 instanceof sm) || this.f27062b) {
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
                boolean z10 = this.f27062b;
                if (z10) {
                    if (f7 > this.f27063c / 2.0f || !lp0Var.f26052s) {
                        return;
                    }
                } else if (f7 < this.d / 2.0f || !lp0Var.f26051r) {
                    return;
                }
                lp0Var.f26052s = !z10;
                lp0Var.f26051r = z10;
                return;
        }
    }

    public oh(lp0 lp0Var, boolean z10, float f7, float f10) {
        this.e = lp0Var;
        this.f27062b = z10;
        this.f27063c = f7;
        this.d = f10;
    }
}
