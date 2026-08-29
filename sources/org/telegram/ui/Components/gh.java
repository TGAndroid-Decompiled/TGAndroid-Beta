package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class gh implements o1.h {
    public final int f28882a = 0;
    public final boolean f28883b;
    public final float f28884c;
    public final float d;
    public final KeyEvent.Callback f28885e;

    public gh(ni niVar, float f9, float f10, boolean z10) {
        this.f28885e = niVar;
        this.f28884c = f9;
        this.d = f10;
        this.f28883b = z10;
    }

    @Override
    public final void a(o1.i iVar, float f9, float f10) {
        switch (this.f28882a) {
            case 0:
                ni niVar = (ni) this.f28885e;
                LinearLayout linearLayout = niVar.f31012h1;
                LinearLayout linearLayout2 = niVar.f31018j1;
                float f11 = f9 / 500.0f;
                niVar.f30987a0.set(niVar.f31051u0, Float.valueOf(f11));
                niVar.T0.setAlpha(AndroidUtilities.lerp(this.f28884c, this.d, f11));
                niVar.X1(niVar.f31051u0, 0);
                niVar.X1(niVar.f31054v0, 0);
                if (!(niVar.f31054v0 instanceof lm) || this.f28883b) {
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
                qo0 qo0Var = (qo0) this.f28885e;
                boolean z10 = this.f28883b;
                if (z10) {
                    if (f9 > this.f28884c / 2.0f || !qo0Var.f32024s) {
                        return;
                    }
                } else if (f9 < this.d / 2.0f || !qo0Var.f32023r) {
                    return;
                }
                qo0Var.f32024s = !z10;
                qo0Var.f32023r = z10;
                return;
        }
    }

    public gh(qo0 qo0Var, boolean z10, float f9, float f10) {
        this.f28885e = qo0Var;
        this.f28883b = z10;
        this.f28884c = f9;
        this.d = f10;
    }
}
