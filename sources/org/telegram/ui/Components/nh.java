package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class nh implements o1.g {
    public final int f26637a = 1;
    public final boolean f26638b;
    public final float f26639c;
    public final float d;
    public final KeyEvent.Callback e;

    public nh(vi viVar, float f7, float f10, boolean z10) {
        this.e = viVar;
        this.f26639c = f7;
        this.d = f10;
        this.f26638b = z10;
    }

    @Override
    public final void a(o1.h hVar, float f7, float f10) {
        switch (this.f26637a) {
            case 0:
                vi viVar = (vi) this.e;
                LinearLayout linearLayout = viVar.l1;
                LinearLayout linearLayout2 = viVar.f29122n1;
                float f11 = f7 / 500.0f;
                ji jiVar = viVar.f29094e0;
                ni niVar = viVar.f29159y0;
                Float valueOf = Float.valueOf(f11);
                jiVar.getClass();
                jiVar.a(niVar, valueOf);
                viVar.X0.setAlpha(AndroidUtilities.lerp(this.f26639c, this.d, f11));
                viVar.X1(viVar.f29159y0, 0);
                viVar.X1(viVar.f29162z0, 0);
                if (!(viVar.f29162z0 instanceof qm) || this.f26638b) {
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
                boolean z10 = this.f26638b;
                if (z10) {
                    if (f7 > this.f26639c / 2.0f || !jp0Var.f25426s) {
                        return;
                    }
                } else if (f7 < this.d / 2.0f || !jp0Var.f25425r) {
                    return;
                }
                jp0Var.f25426s = !z10;
                jp0Var.f25425r = z10;
                return;
        }
    }

    public nh(jp0 jp0Var, boolean z10, float f7, float f10) {
        this.e = jp0Var;
        this.f26638b = z10;
        this.f26639c = f7;
        this.d = f10;
    }
}
