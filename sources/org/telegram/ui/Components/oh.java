package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class oh implements o1.g {
    public final int f27070a = 1;
    public final boolean f27071b;
    public final float f27072c;
    public final float d;
    public final KeyEvent.Callback e;

    public oh(wi wiVar, float f7, float f10, boolean z10) {
        this.e = wiVar;
        this.f27072c = f7;
        this.d = f10;
        this.f27071b = z10;
    }

    @Override
    public final void a(o1.h hVar, float f7, float f10) {
        switch (this.f27070a) {
            case 0:
                wi wiVar = (wi) this.e;
                LinearLayout linearLayout = wiVar.l1;
                LinearLayout linearLayout2 = wiVar.f30030n1;
                float f11 = f7 / 500.0f;
                wiVar.f30002e0.set(wiVar.f30067y0, Float.valueOf(f11));
                wiVar.X0.setAlpha(AndroidUtilities.lerp(this.f27072c, this.d, f11));
                wiVar.X1(wiVar.f30067y0, 0);
                wiVar.X1(wiVar.f30070z0, 0);
                if (!(wiVar.f30070z0 instanceof rm) || this.f27071b) {
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
                jp0 jp0Var = (jp0) this.e;
                boolean z10 = this.f27071b;
                if (z10) {
                    if (f7 > this.f27072c / 2.0f || !jp0Var.f25469s) {
                        return;
                    }
                } else if (f7 < this.d / 2.0f || !jp0Var.f25468r) {
                    return;
                }
                jp0Var.f25469s = !z10;
                jp0Var.f25468r = z10;
                return;
        }
    }

    public oh(jp0 jp0Var, boolean z10, float f7, float f10) {
        this.e = jp0Var;
        this.f27071b = z10;
        this.f27072c = f7;
        this.d = f10;
    }
}
