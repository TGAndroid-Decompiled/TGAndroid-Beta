package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class ph implements o1.g {
    public final int f27348a = 1;
    public final boolean f27349b;
    public final float f27350c;
    public final float d;
    public final KeyEvent.Callback e;

    public ph(xi xiVar, float f7, float f10, boolean z10) {
        this.e = xiVar;
        this.f27350c = f7;
        this.d = f10;
        this.f27349b = z10;
    }

    @Override
    public final void a(o1.h hVar, float f7, float f10) {
        switch (this.f27348a) {
            case 0:
                xi xiVar = (xi) this.e;
                LinearLayout linearLayout = xiVar.l1;
                LinearLayout linearLayout2 = xiVar.f30294n1;
                float f11 = f7 / 500.0f;
                li liVar = xiVar.f30266e0;
                pi piVar = xiVar.f30331y0;
                Float valueOf = Float.valueOf(f11);
                liVar.getClass();
                liVar.a(piVar, valueOf);
                xiVar.X0.setAlpha(AndroidUtilities.lerp(this.f27350c, this.d, f11));
                xiVar.X1(xiVar.f30331y0, 0);
                xiVar.X1(xiVar.f30334z0, 0);
                if (!(xiVar.f30334z0 instanceof tm) || this.f27349b) {
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
                mp0 mp0Var = (mp0) this.e;
                boolean z10 = this.f27349b;
                if (z10) {
                    if (f7 > this.f27350c / 2.0f || !mp0Var.f26354s) {
                        return;
                    }
                } else if (f7 < this.d / 2.0f || !mp0Var.f26353r) {
                    return;
                }
                mp0Var.f26354s = !z10;
                mp0Var.f26353r = z10;
                return;
        }
    }

    public ph(mp0 mp0Var, boolean z10, float f7, float f10) {
        this.e = mp0Var;
        this.f27349b = z10;
        this.f27350c = f7;
        this.d = f10;
    }
}
