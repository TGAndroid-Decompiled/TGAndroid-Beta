package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class ph implements o1.g {
    public final int f27373a = 1;
    public final boolean f27374b;
    public final float f27375c;
    public final float d;
    public final KeyEvent.Callback e;

    public ph(wi wiVar, float f7, float f10, boolean z10) {
        this.e = wiVar;
        this.f27375c = f7;
        this.d = f10;
        this.f27374b = z10;
    }

    @Override
    public final void a(o1.h hVar, float f7, float f10) {
        switch (this.f27373a) {
            case 0:
                wi wiVar = (wi) this.e;
                LinearLayout linearLayout = wiVar.l1;
                LinearLayout linearLayout2 = wiVar.f29986n1;
                float f11 = f7 / 500.0f;
                hi hiVar = wiVar.f29958e0;
                oi oiVar = wiVar.f30023y0;
                Float valueOf = Float.valueOf(f11);
                hiVar.getClass();
                hiVar.a(oiVar, valueOf);
                wiVar.X0.setAlpha(AndroidUtilities.lerp(this.f27375c, this.d, f11));
                wiVar.U1(wiVar.f30023y0, 0);
                wiVar.U1(wiVar.f30026z0, 0);
                if (!(wiVar.f30026z0 instanceof sm) || this.f27374b) {
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
                boolean z10 = this.f27374b;
                if (z10) {
                    if (f7 > this.f27375c / 2.0f || !lp0Var.f26116s) {
                        return;
                    }
                } else if (f7 < this.d / 2.0f || !lp0Var.f26115r) {
                    return;
                }
                lp0Var.f26116s = !z10;
                lp0Var.f26115r = z10;
                return;
        }
    }

    public ph(lp0 lp0Var, boolean z10, float f7, float f10) {
        this.e = lp0Var;
        this.f27374b = z10;
        this.f27375c = f7;
        this.d = f10;
    }
}
