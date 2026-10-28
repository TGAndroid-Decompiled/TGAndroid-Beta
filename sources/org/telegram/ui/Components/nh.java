package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class nh implements o1.g {
    public final int f30916a = 1;
    public final boolean f30917b;
    public final float f30918c;
    public final float d;
    public final KeyEvent.Callback e;

    public nh(ti tiVar, float f7, float f10, boolean z10) {
        this.e = tiVar;
        this.f30918c = f7;
        this.d = f10;
        this.f30917b = z10;
    }

    @Override
    public final void a(o1.h hVar, float f7, float f10) {
        switch (this.f30916a) {
            case 0:
                ti tiVar = (ti) this.e;
                LinearLayout linearLayout = tiVar.f33017o1;
                LinearLayout linearLayout2 = tiVar.f33023q1;
                float f11 = f7 / 500.0f;
                ei eiVar = tiVar.f32986e0;
                li liVar = tiVar.B0;
                Float valueOf = Float.valueOf(f11);
                eiVar.getClass();
                eiVar.a(liVar, valueOf);
                tiVar.f32974a1.setAlpha(AndroidUtilities.lerp(this.f30918c, this.d, f11));
                tiVar.f2(tiVar.B0, 0);
                tiVar.f2(tiVar.C0, 0);
                if (!(tiVar.C0 instanceof cn) || this.f30917b) {
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
                dq0 dq0Var = (dq0) this.e;
                boolean z10 = this.f30917b;
                if (z10) {
                    if (f7 > this.f30918c / 2.0f || !dq0Var.f27528s) {
                        return;
                    }
                } else if (f7 < this.d / 2.0f || !dq0Var.f27527r) {
                    return;
                }
                dq0Var.f27528s = !z10;
                dq0Var.f27527r = z10;
                return;
        }
    }

    public nh(dq0 dq0Var, boolean z10, float f7, float f10) {
        this.e = dq0Var;
        this.f30917b = z10;
        this.f30918c = f7;
        this.d = f10;
    }
}
