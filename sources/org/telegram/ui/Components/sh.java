package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class sh implements o1.g {
    public final int f30563a = 0;
    public final boolean f30564b;
    public final float f30565c;
    public final float d;
    public final KeyEvent.Callback f30566e;

    public sh(aj ajVar, float f7, float f10, boolean z10) {
        this.f30566e = ajVar;
        this.f30565c = f7;
        this.d = f10;
        this.f30564b = z10;
    }

    @Override
    public final void a(o1.h hVar, float f7, float f10) {
        switch (this.f30563a) {
            case 0:
                aj ajVar = (aj) this.f30566e;
                LinearLayout linearLayout = ajVar.f24365o1;
                LinearLayout linearLayout2 = ajVar.f24371q1;
                float f11 = f7 / 500.0f;
                oi oiVar = ajVar.f24334e0;
                si siVar = ajVar.B0;
                Float valueOf = Float.valueOf(f11);
                oiVar.getClass();
                oiVar.a(siVar, valueOf);
                ajVar.f24321a1.setAlpha(AndroidUtilities.lerp(this.f30565c, this.d, f11));
                ajVar.b2(ajVar.B0, 0);
                ajVar.b2(ajVar.C0, 0);
                if (!(ajVar.C0 instanceof jn) || this.f30564b) {
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
                hq0 hq0Var = (hq0) this.f30566e;
                boolean z10 = this.f30564b;
                if (z10) {
                    if (f7 > this.f30565c / 2.0f || !hq0Var.f26874s) {
                        return;
                    }
                } else if (f7 < this.d / 2.0f || !hq0Var.f26873r) {
                    return;
                }
                hq0Var.f26874s = !z10;
                hq0Var.f26873r = z10;
                return;
        }
    }

    public sh(hq0 hq0Var, boolean z10, float f7, float f10) {
        this.f30566e = hq0Var;
        this.f30564b = z10;
        this.f30565c = f7;
        this.d = f10;
    }
}
