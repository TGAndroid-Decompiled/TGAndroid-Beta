package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class oh implements o1.g {
    public final int f29050a = 0;
    public final boolean f29051b;
    public final float f29052c;
    public final float d;
    public final KeyEvent.Callback f29053e;

    public oh(vi viVar, float f7, float f10, boolean z10) {
        this.f29053e = viVar;
        this.f29052c = f7;
        this.d = f10;
        this.f29051b = z10;
    }

    @Override
    public final void a(o1.h hVar, float f7, float f10) {
        switch (this.f29050a) {
            case 0:
                vi viVar = (vi) this.f29053e;
                LinearLayout linearLayout = viVar.l1;
                LinearLayout linearLayout2 = viVar.f31303n1;
                float f11 = f7 / 500.0f;
                viVar.f31275e0.set(viVar.f31340y0, Float.valueOf(f11));
                viVar.X0.setAlpha(AndroidUtilities.lerp(this.f29052c, this.d, f11));
                viVar.X1(viVar.f31340y0, 0);
                viVar.X1(viVar.f31343z0, 0);
                if (!(viVar.f31343z0 instanceof qm) || this.f29051b) {
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
                xo0 xo0Var = (xo0) this.f29053e;
                boolean z10 = this.f29051b;
                if (z10) {
                    if (f7 > this.f29052c / 2.0f || !xo0Var.f32642s) {
                        return;
                    }
                } else if (f7 < this.d / 2.0f || !xo0Var.f32641r) {
                    return;
                }
                xo0Var.f32642s = !z10;
                xo0Var.f32641r = z10;
                return;
        }
    }

    public oh(xo0 xo0Var, boolean z10, float f7, float f10) {
        this.f29053e = xo0Var;
        this.f29051b = z10;
        this.f29052c = f7;
        this.d = f10;
    }
}
