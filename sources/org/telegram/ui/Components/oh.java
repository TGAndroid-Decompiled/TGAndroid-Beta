package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class oh implements o1.g {
    public final int f27956a = 0;
    public final boolean f27957b;
    public final float f27958c;
    public final float d;
    public final KeyEvent.Callback e;

    public oh(vi viVar, float f7, float f10, boolean z10) {
        this.e = viVar;
        this.f27958c = f7;
        this.d = f10;
        this.f27957b = z10;
    }

    @Override
    public final void a(o1.h hVar, float f7, float f10) {
        switch (this.f27956a) {
            case 0:
                vi viVar = (vi) this.e;
                LinearLayout linearLayout = viVar.f30028o1;
                LinearLayout linearLayout2 = viVar.f30034q1;
                float f11 = f7 / 500.0f;
                ji jiVar = viVar.f29997e0;
                ni niVar = viVar.B0;
                Float valueOf = Float.valueOf(f11);
                jiVar.getClass();
                jiVar.a(niVar, valueOf);
                viVar.f29985a1.setAlpha(AndroidUtilities.lerp(this.f27958c, this.d, f11));
                viVar.b2(viVar.B0, 0);
                viVar.b2(viVar.C0, 0);
                if (!(viVar.C0 instanceof en) || this.f27957b) {
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
                xp0 xp0Var = (xp0) this.e;
                boolean z10 = this.f27957b;
                if (z10) {
                    if (f7 > this.f27958c / 2.0f || !xp0Var.f31306s) {
                        return;
                    }
                } else if (f7 < this.d / 2.0f || !xp0Var.f31305r) {
                    return;
                }
                xp0Var.f31306s = !z10;
                xp0Var.f31305r = z10;
                return;
        }
    }

    public oh(xp0 xp0Var, boolean z10, float f7, float f10) {
        this.e = xp0Var;
        this.f27957b = z10;
        this.f27958c = f7;
        this.d = f10;
    }
}
