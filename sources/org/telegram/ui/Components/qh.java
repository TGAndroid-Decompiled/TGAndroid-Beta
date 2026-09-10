package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class qh implements o1.g {
    public final int f26417a = 1;
    public final boolean f26418b;
    public final float f26419c;
    public final float d;
    public final KeyEvent.Callback e;

    public qh(yi yiVar, float f7, float f10, boolean z10) {
        this.e = yiVar;
        this.f26419c = f7;
        this.d = f10;
        this.f26418b = z10;
    }

    @Override
    public final void a(o1.h hVar, float f7, float f10) {
        switch (this.f26417a) {
            case 0:
                yi yiVar = (yi) this.e;
                LinearLayout linearLayout = yiVar.l1;
                LinearLayout linearLayout2 = yiVar.f29390n1;
                float f11 = f7 / 500.0f;
                yiVar.f29362e0.set(yiVar.f29427y0, Float.valueOf(f11));
                yiVar.X0.setAlpha(AndroidUtilities.lerp(this.f26419c, this.d, f11));
                yiVar.X1(yiVar.f29427y0, 0);
                yiVar.X1(yiVar.f29430z0, 0);
                if (!(yiVar.f29430z0 instanceof xm) || this.f26418b) {
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
                hp0 hp0Var = (hp0) this.e;
                boolean z10 = this.f26418b;
                if (z10) {
                    if (f7 > this.f26419c / 2.0f || !hp0Var.f23747s) {
                        return;
                    }
                } else if (f7 < this.d / 2.0f || !hp0Var.f23746r) {
                    return;
                }
                hp0Var.f23747s = !z10;
                hp0Var.f23746r = z10;
                return;
        }
    }

    public qh(hp0 hp0Var, boolean z10, float f7, float f10) {
        this.e = hp0Var;
        this.f26418b = z10;
        this.f26419c = f7;
        this.d = f10;
    }
}
