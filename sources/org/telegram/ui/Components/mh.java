package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class mh implements o1.g {
    public final int f26148a = 0;
    public final boolean f26149b;
    public final float f26150c;
    public final float d;
    public final KeyEvent.Callback e;

    public mh(vi viVar, float f7, float f10, boolean z10) {
        this.e = viVar;
        this.f26150c = f7;
        this.d = f10;
        this.f26149b = z10;
    }

    @Override
    public final void a(o1.h hVar, float f7, float f10) {
        switch (this.f26148a) {
            case 0:
                vi viVar = (vi) this.e;
                LinearLayout linearLayout = viVar.l1;
                LinearLayout linearLayout2 = viVar.f28769n1;
                float f11 = f7 / 500.0f;
                ji jiVar = viVar.f28741e0;
                ni niVar = viVar.f28806y0;
                Float valueOf = Float.valueOf(f11);
                jiVar.getClass();
                jiVar.a(niVar, valueOf);
                viVar.X0.setAlpha(AndroidUtilities.lerp(this.f26150c, this.d, f11));
                viVar.X1(viVar.f28806y0, 0);
                viVar.X1(viVar.f28809z0, 0);
                if (!(viVar.f28809z0 instanceof qm) || this.f26149b) {
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
                xo0 xo0Var = (xo0) this.e;
                boolean z10 = this.f26149b;
                if (z10) {
                    if (f7 > this.f26150c / 2.0f || !xo0Var.f29963s) {
                        return;
                    }
                } else if (f7 < this.d / 2.0f || !xo0Var.f29962r) {
                    return;
                }
                xo0Var.f29963s = !z10;
                xo0Var.f29962r = z10;
                return;
        }
    }

    public mh(xo0 xo0Var, boolean z10, float f7, float f10) {
        this.e = xo0Var;
        this.f26149b = z10;
        this.f26150c = f7;
        this.d = f10;
    }
}
