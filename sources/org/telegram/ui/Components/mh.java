package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class mh implements o1.g {
    public final int f26159a = 0;
    public final boolean f26160b;
    public final float f26161c;
    public final float d;
    public final KeyEvent.Callback e;

    public mh(vi viVar, float f7, float f10, boolean z10) {
        this.e = viVar;
        this.f26161c = f7;
        this.d = f10;
        this.f26160b = z10;
    }

    @Override
    public final void a(o1.h hVar, float f7, float f10) {
        switch (this.f26159a) {
            case 0:
                vi viVar = (vi) this.e;
                LinearLayout linearLayout = viVar.l1;
                LinearLayout linearLayout2 = viVar.f28774n1;
                float f11 = f7 / 500.0f;
                ji jiVar = viVar.f28746e0;
                ni niVar = viVar.f28811y0;
                Float valueOf = Float.valueOf(f11);
                jiVar.getClass();
                jiVar.a(niVar, valueOf);
                viVar.X0.setAlpha(AndroidUtilities.lerp(this.f26161c, this.d, f11));
                viVar.X1(viVar.f28811y0, 0);
                viVar.X1(viVar.f28814z0, 0);
                if (!(viVar.f28814z0 instanceof qm) || this.f26160b) {
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
                wo0 wo0Var = (wo0) this.e;
                boolean z10 = this.f26160b;
                if (z10) {
                    if (f7 > this.f26161c / 2.0f || !wo0Var.f29767s) {
                        return;
                    }
                } else if (f7 < this.d / 2.0f || !wo0Var.f29766r) {
                    return;
                }
                wo0Var.f29767s = !z10;
                wo0Var.f29766r = z10;
                return;
        }
    }

    public mh(wo0 wo0Var, boolean z10, float f7, float f10) {
        this.e = wo0Var;
        this.f26160b = z10;
        this.f26161c = f7;
        this.d = f10;
    }
}
