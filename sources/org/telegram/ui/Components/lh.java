package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class lh implements o1.g {
    public final int f28337a = 0;
    public final boolean f28338b;
    public final float f28339c;
    public final float d;
    public final KeyEvent.Callback e;

    public lh(ri riVar, float f7, float f10, boolean z10) {
        this.e = riVar;
        this.f28339c = f7;
        this.d = f10;
        this.f28338b = z10;
    }

    @Override
    public final void a(o1.h hVar, float f7, float f10) {
        switch (this.f28337a) {
            case 0:
                ri riVar = (ri) this.e;
                LinearLayout linearLayout = riVar.f30173o1;
                LinearLayout linearLayout2 = riVar.f30179q1;
                float f11 = f7 / 500.0f;
                fi fiVar = riVar.f30142e0;
                ji jiVar = riVar.B0;
                Float valueOf = Float.valueOf(f11);
                fiVar.getClass();
                fiVar.a(jiVar, valueOf);
                riVar.f30130a1.setAlpha(AndroidUtilities.lerp(this.f28339c, this.d, f11));
                riVar.f2(riVar.B0, 0);
                riVar.f2(riVar.C0, 0);
                if (!(riVar.C0 instanceof zm) || this.f28338b) {
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
                wp0 wp0Var = (wp0) this.e;
                boolean z10 = this.f28338b;
                if (z10) {
                    if (f7 > this.f28339c / 2.0f || !wp0Var.f32321s) {
                        return;
                    }
                } else if (f7 < this.d / 2.0f || !wp0Var.f32320r) {
                    return;
                }
                wp0Var.f32321s = !z10;
                wp0Var.f32320r = z10;
                return;
        }
    }

    public lh(wp0 wp0Var, boolean z10, float f7, float f10) {
        this.e = wp0Var;
        this.f28338b = z10;
        this.f28339c = f7;
        this.d = f10;
    }
}
