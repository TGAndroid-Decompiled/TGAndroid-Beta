package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class mh implements o1.g {
    public final int f26158a = 0;
    public final boolean f26159b;
    public final float f26160c;
    public final float d;
    public final KeyEvent.Callback e;

    public mh(vi viVar, float f7, float f10, boolean z10) {
        this.e = viVar;
        this.f26160c = f7;
        this.d = f10;
        this.f26159b = z10;
    }

    @Override
    public final void a(o1.h hVar, float f7, float f10) {
        switch (this.f26158a) {
            case 0:
                vi viVar = (vi) this.e;
                LinearLayout linearLayout = viVar.l1;
                LinearLayout linearLayout2 = viVar.f28771n1;
                float f11 = f7 / 500.0f;
                viVar.f28743e0.set(viVar.f28808y0, Float.valueOf(f11));
                viVar.X0.setAlpha(AndroidUtilities.lerp(this.f26160c, this.d, f11));
                viVar.X1(viVar.f28808y0, 0);
                viVar.X1(viVar.f28811z0, 0);
                if (!(viVar.f28811z0 instanceof qm) || this.f26159b) {
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
                boolean z10 = this.f26159b;
                if (z10) {
                    if (f7 > this.f26160c / 2.0f || !wo0Var.f29764s) {
                        return;
                    }
                } else if (f7 < this.d / 2.0f || !wo0Var.f29763r) {
                    return;
                }
                wo0Var.f29764s = !z10;
                wo0Var.f29763r = z10;
                return;
        }
    }

    public mh(wo0 wo0Var, boolean z10, float f7, float f10) {
        this.e = wo0Var;
        this.f26159b = z10;
        this.f26160c = f7;
        this.d = f10;
    }
}
