package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

public final class zg implements o1.g {

    public final int f35234a = 0;

    public final boolean f35235b;

    public final float f35236c;
    public final float d;

    public final KeyEvent.Callback f35237e;

    public zg(gi giVar, float f10, float f11, boolean z10) {
        this.f35237e = giVar;
        this.f35236c = f10;
        this.d = f11;
        this.f35235b = z10;
    }

    @Override
    public final void a(o1.h hVar, float f10, float f11) {
        switch (this.f35234a) {
            case 0:
                gi giVar = (gi) this.f35237e;
                LinearLayout linearLayout = giVar.f28657h1;
                LinearLayout linearLayout2 = giVar.f28663j1;
                float f12 = f10 / 500.0f;
                uh uhVar = giVar.f28632a0;
                yh yhVar = giVar.f28696u0;
                Float fValueOf = Float.valueOf(f12);
                uhVar.getClass();
                uhVar.a(yhVar, fValueOf);
                giVar.T0.setAlpha(AndroidUtilities.lerp(this.f35236c, this.d, f12));
                giVar.X1(giVar.f28696u0, 0);
                giVar.X1(giVar.f28699v0, 0);
                if (!(giVar.f28699v0 instanceof em) || this.f35235b) {
                    f12 = 1.0f - f12;
                }
                float fClamp = Utilities.clamp(f12, 1.0f, 0.0f);
                linearLayout2.setAlpha(fClamp);
                float f13 = 1.0f - fClamp;
                linearLayout.setAlpha(f13);
                linearLayout.setTranslationX(fClamp * (-AndroidUtilities.dp(16.0f)));
                linearLayout2.setTranslationX(f13 * AndroidUtilities.dp(16.0f));
                break;
            default:
                go0 go0Var = (go0) this.f35237e;
                boolean z10 = this.f35235b;
                if (z10) {
                    if (f10 > this.f35236c / 2.0f || !go0Var.f28786s) {
                    }
                } else if (f10 < this.d / 2.0f || !go0Var.f28785r) {
                }
                go0Var.f28786s = !z10;
                go0Var.f28785r = z10;
                break;
        }
    }

    public zg(go0 go0Var, boolean z10, float f10, float f11) {
        this.f35237e = go0Var;
        this.f35235b = z10;
        this.f35236c = f10;
        this.d = f11;
    }
}
