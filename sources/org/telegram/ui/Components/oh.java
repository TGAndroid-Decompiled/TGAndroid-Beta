package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class oh implements o1.g {
    public final int f29077a = 0;
    public final boolean f29078b;
    public final float f29079c;
    public final float d;
    public final KeyEvent.Callback f29080e;

    public oh(vi viVar, float f7, float f10, boolean z10) {
        this.f29080e = viVar;
        this.f29079c = f7;
        this.d = f10;
        this.f29078b = z10;
    }

    @Override
    public final void a(o1.h hVar, float f7, float f10) {
        switch (this.f29077a) {
            case 0:
                vi viVar = (vi) this.f29080e;
                LinearLayout linearLayout = viVar.l1;
                LinearLayout linearLayout2 = viVar.f31330n1;
                float f11 = f7 / 500.0f;
                viVar.f31302e0.set(viVar.f31367y0, Float.valueOf(f11));
                viVar.X0.setAlpha(AndroidUtilities.lerp(this.f29079c, this.d, f11));
                viVar.X1(viVar.f31367y0, 0);
                viVar.X1(viVar.f31370z0, 0);
                if (!(viVar.f31370z0 instanceof qm) || this.f29078b) {
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
                xo0 xo0Var = (xo0) this.f29080e;
                boolean z10 = this.f29078b;
                if (z10) {
                    if (f7 > this.f29079c / 2.0f || !xo0Var.f32669s) {
                        return;
                    }
                } else if (f7 < this.d / 2.0f || !xo0Var.f32668r) {
                    return;
                }
                xo0Var.f32669s = !z10;
                xo0Var.f32668r = z10;
                return;
        }
    }

    public oh(xo0 xo0Var, boolean z10, float f7, float f10) {
        this.f29080e = xo0Var;
        this.f29078b = z10;
        this.f29079c = f7;
        this.d = f10;
    }
}
